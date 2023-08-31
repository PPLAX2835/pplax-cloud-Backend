package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.po.AdminSidebar;
import xyz.pplax.admin.dao.PPLAXAdminSidebarDao;
import xyz.pplax.service.base.BaseService;

/**
 * @table admin_sidebar <br/>
 * @description admin_sidebar 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXAdminSidebarService extends BaseService<AdminSidebar> {
	@SuppressWarnings("unused")
	private PPLAXAdminSidebarDao adminSidebarDao;
	
	@Autowired
    public void setInfoDao(PPLAXAdminSidebarDao adminSidebarDao) {
        super.setBaseDao(adminSidebarDao);
        this.adminSidebarDao = adminSidebarDao;
    }
}