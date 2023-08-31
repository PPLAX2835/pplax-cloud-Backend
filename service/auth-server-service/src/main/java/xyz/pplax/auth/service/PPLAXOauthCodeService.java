package xyz.pplax.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.auth.dao.PPLAXOauthCodeDao;
import xyz.pplax.auth.po.OauthCode;
import xyz.pplax.service.base.BaseService;

/**
 * @table oauth_client_details <br/>
 * @description oauth_client_details 数据表Service层 <br/>
 * @date 2022-12-14 23:53:19 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXOauthCodeService extends BaseService<OauthCode> {
    @SuppressWarnings("unused")
    private PPLAXOauthCodeDao oauthCodeDao;

    @Autowired
    public void setInfoDao(PPLAXOauthCodeDao oauthCodeDao) {
        super.setBaseDao(oauthCodeDao);
        this.oauthCodeDao = oauthCodeDao;
    }
}