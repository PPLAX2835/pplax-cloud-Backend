package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.po.Permission;
import xyz.pplax.admin.dao.PPLAXPermissionDao;
import xyz.pplax.service.base.BaseService;

import java.util.List;

/**
 * @table permission <br/>
 * @description permission 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXPermissionService extends BaseService<Permission> {
	@SuppressWarnings("unused")
	private PPLAXPermissionDao permissionDao;
	
	@Autowired
    public void setInfoDao(PPLAXPermissionDao permissionDao) {
        super.setBaseDao(permissionDao);
        this.permissionDao = permissionDao;
    }
}