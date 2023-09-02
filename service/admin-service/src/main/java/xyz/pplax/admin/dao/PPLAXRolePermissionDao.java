package xyz.pplax.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.admin.po.RolePermissionRelationship;
import xyz.pplax.service.base.BaseDao;

/**
 * @table role_permission <br/>
 * @description role_permission 数据表DAO层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author lax <br/>
 */

@Mapper
public interface PPLAXRolePermissionDao extends BaseDao<RolePermissionRelationship> {

}