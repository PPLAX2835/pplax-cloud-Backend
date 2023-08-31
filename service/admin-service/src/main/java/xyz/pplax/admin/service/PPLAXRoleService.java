package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.po.Role;
import xyz.pplax.admin.dao.PPLAXRoleDao;
import xyz.pplax.service.base.BaseService;

/**
 * @table role <br/>
 * @description role 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXRoleService extends BaseService<Role> {
	@SuppressWarnings("unused")
	private PPLAXRoleDao roleDao;
	
	@Autowired
    public void setInfoDao(PPLAXRoleDao roleDao) {
        super.setBaseDao(roleDao);
        this.roleDao = roleDao;
    }
}