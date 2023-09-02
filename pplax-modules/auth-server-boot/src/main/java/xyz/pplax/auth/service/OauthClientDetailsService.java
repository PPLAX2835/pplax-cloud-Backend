package xyz.pplax.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import xyz.pplax.auth.constant.OauthClientConfigConstant;
import xyz.pplax.auth.po.OauthClientDetails;
import xyz.pplax.auth.pojo.OauthClientDetailsPojo;
import xyz.pplax.auth.vo.OauthClientDetailsVO;
import xyz.pplax.core.exception.oauth.OauthException;
import xyz.pplax.core.util.BeanUtils;
import xyz.pplax.core.util.lambda.AssertUtils;
import xyz.pplax.data.entity.Condition;
import xyz.pplax.data.entity.PageData;
import xyz.pplax.data.util.PageUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author qsyyke
 * @date Created in 2022/6/25 11:32
 */

@Service
public class OauthClientDetailsService {

    @Autowired
    private PPLAXOauthClientDetailsService pplaxOauthClientDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public int physicalDeleteOauthClient(OauthClientDetailsPojo pojo) {
        String clientId = pojo.getClientId();
        AssertUtils.ifNoLengthThrow(clientId, () -> new OauthException("clientId不能为null"));
        OauthClientDetails oauthClientDetails = new OauthClientDetails();
        oauthClientDetails.setClientId(clientId);
        return pplaxOauthClientDetailsService.deleteByWhere(oauthClientDetails);
    }

    public void insertOauthClient(OauthClientDetailsPojo pojo) {
        AssertUtils.ifNullThrow(pojo, () -> new OauthException("必须存在客户端信息"));
        AssertUtils.ifNullThrow(pojo.getClientId(), () -> new OauthException("必须存在clientId"));
        AssertUtils.ifNullThrow(pojo.getAuthorizedGrantTypes(), () -> new OauthException("必须存在授权类型"));
        AssertUtils.ifNullThrow(pojo.getClientSecret(), () -> new OauthException("必须要有密码"));
        // 判断此clientId是否存在
        OauthClientDetails oauthClientDetails = pplaxOauthClientDetailsService.queryOne(new OauthClientDetails() {{
            setClientId(pojo.getClientId());
        }});
        AssertUtils.stateThrow(oauthClientDetails == null, () -> new OauthException("此clientId已经存在"));
        // 判断授权类型
        String authorizedGrantTypes = assertAuthorizedGrantTypes(pojo);
        AssertUtils.stateThrow(StringUtils.hasLength(authorizedGrantTypes), () -> new OauthException("没有授权类型"));
        pojo.setClientSecret(passwordEncoder.encode(pojo.getClientSecret()));
        pplaxOauthClientDetailsService.insert(BeanUtils.copyProperties(pojo, OauthClientDetails.class));
    }

    public PageData<OauthClientDetailsVO> queryListOauthClientByCondition(Condition<Object> condition) {
        return PageUtils.copyPageDataResult(pplaxOauthClientDetailsService.queryListByCondition(condition), OauthClientDetailsVO.class);
    }

    public OauthClientDetailsVO queryOauthClientByClientId(OauthClientDetailsPojo pojo) {
        AssertUtils.ifNullThrow(pojo, () -> new OauthException("必须存在客户端信息"));
        AssertUtils.ifNullThrow(pojo.getClientId(), () -> new OauthException("必须存在clientId"));
        OauthClientDetails oauthClientDetails = new OauthClientDetails();
        oauthClientDetails.setClientId(pojo.getClientId());
        return BeanUtils.copyProperties(pplaxOauthClientDetailsService.queryOne(oauthClientDetails), OauthClientDetailsVO.class);
    }

    public int updateOauthClient(OauthClientDetailsPojo pojo) {
        AssertUtils.ifNullThrow(pojo, () -> new OauthException("必须存在客户端信息"));
        AssertUtils.ifNullThrow(pojo.getClientId(), () -> new OauthException("必须存在clientId"));
        if (StringUtils.hasLength(pojo.getAuthorizedGrantTypes())) {
            String authorizedGrantTypes = assertAuthorizedGrantTypes(pojo);
            if (StringUtils.hasLength(authorizedGrantTypes)) {
                pojo.setAuthorizedGrantTypes(authorizedGrantTypes);
            }else {
                pojo.setAuthorizedGrantTypes(null);
            }
        }
        if (StringUtils.hasLength(pojo.getClientSecret())) {
            pojo.setClientSecret(passwordEncoder.encode(pojo.getClientSecret()));
        }
        return pplaxOauthClientDetailsService.updateById(BeanUtils.copyProperties(pojo, OauthClientDetails.class));
    }

    private String assertAuthorizedGrantTypes(OauthClientDetailsPojo pojo) {
        return Arrays.stream(pojo.getAuthorizedGrantTypes().split(","))
                .filter(OauthClientConfigConstant.AUTHORIZED_GRANT_TYPES::contains)
                .collect(Collectors.joining(","));
    }
}
