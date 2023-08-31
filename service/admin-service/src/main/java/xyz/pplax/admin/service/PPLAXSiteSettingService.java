package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.dao.SiteSettingDao;
import xyz.pplax.admin.po.SiteSetting;
import xyz.pplax.service.base.BaseService;

/**
 * @table site_setting <br/>
 * @description site_setting 数据表Service层 <br/>
 * @date 2023-01-04 20:42:58 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXSiteSettingService extends BaseService<SiteSetting> {
	@SuppressWarnings("unused")
	private SiteSettingDao siteSettingDao;
	
	@Autowired
    public void setInfoDao(SiteSettingDao siteSettingDao) {
        super.setBaseDao(siteSettingDao);
        this.siteSettingDao = siteSettingDao;
    }
}