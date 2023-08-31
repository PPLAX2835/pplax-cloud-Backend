package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.po.Social;
import xyz.pplax.admin.dao.PPLAXSocialDao;
import xyz.pplax.service.base.BaseService;

/**
 * @table social <br/>
 * @description social 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXSocialService extends BaseService<Social> {
	@SuppressWarnings("unused")
	private PPLAXSocialDao socialDao;
	
	@Autowired
    public void setInfoDao(PPLAXSocialDao socialDao) {
        super.setBaseDao(socialDao);
        this.socialDao = socialDao;
    }
}