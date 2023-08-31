package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.po.Site;
import xyz.pplax.admin.dao.PPLAXSiteDao;
import xyz.pplax.service.base.BaseService;

/**
 * @table site <br/>
 * @description site 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXSiteService extends BaseService<Site> {
	@SuppressWarnings("unused")
	private PPLAXSiteDao siteDao;
	
	@Autowired
    public void setInfoDao(PPLAXSiteDao siteDao) {
        super.setBaseDao(siteDao);
        this.siteDao = siteDao;
    }
}