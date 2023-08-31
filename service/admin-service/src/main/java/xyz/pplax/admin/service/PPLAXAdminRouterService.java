package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.dao.AdminRouterDao;
import xyz.pplax.admin.po.AdminRouter;
import xyz.pplax.service.base.BaseService;

/**
 * @table admin_router <br/>
 * @description admin_router 数据表Service层 <br/>
 * @date 2022-12-30 22:47:42 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXAdminRouterService extends BaseService<AdminRouter> {
	@SuppressWarnings("unused")
	private AdminRouterDao adminRouterDao;
	
	@Autowired
    public void setInfoDao(AdminRouterDao adminRouterDao) {
        super.setBaseDao(adminRouterDao);
        this.adminRouterDao = adminRouterDao;
    }
}