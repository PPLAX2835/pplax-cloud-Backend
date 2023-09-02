package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.dao.PPLAXNavigationDao;
import xyz.pplax.admin.po.Navigation;
import xyz.pplax.service.base.BaseService;

/**
 * @table navigation <br/>
 * @description navigation 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXNavigationService extends BaseService<Navigation> {
	@SuppressWarnings("unused")
	private PPLAXNavigationDao navigationDao;
	
	@Autowired
    public void setInfoDao(PPLAXNavigationDao navigationDao) {
        super.setBaseDao(navigationDao);
        this.navigationDao = navigationDao;
    }
}