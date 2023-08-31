package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.dao.PPLAXRolePermissionDao;
import xyz.pplax.admin.po.RolePermissionRelationship;
import xyz.pplax.service.base.BaseService;

/**
 * @table role_permission <br/>
 * @description role_permission 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXRolePermissionService extends BaseService<RolePermissionRelationship> {
	@SuppressWarnings("unused")
	private PPLAXRolePermissionDao rolePermissionDao;
	
	@Autowired
    public void setInfoDao(PPLAXRolePermissionDao rolePermissionDao) {
        super.setBaseDao(rolePermissionDao);
        this.rolePermissionDao = rolePermissionDao;
    }
}