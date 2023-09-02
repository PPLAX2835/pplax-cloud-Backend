package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.dao.PPLAXUserRoleDao;
import xyz.pplax.admin.po.UserRoleRelationship;
import xyz.pplax.service.base.BaseService;

/**
 * @table user_role <br/>
 * @description user_role 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXUserRoleService extends BaseService<UserRoleRelationship> {
	@SuppressWarnings("unused")
	private PPLAXUserRoleDao userRoleDao;
	
	@Autowired
    public void setInfoDao(PPLAXUserRoleDao userRoleDao) {
        super.setBaseDao(userRoleDao);
        this.userRoleDao = userRoleDao;
    }
}