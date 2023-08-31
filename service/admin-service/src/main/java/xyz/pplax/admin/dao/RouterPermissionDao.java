package xyz.pplax.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.admin.po.RouterPermission;
import xyz.pplax.service.base.BaseDao;

/**
 * @table router_permission <br/>
 * @description router_permission 数据表DAO层 <br/>
 * @date 2022-12-30 22:23:42 <br/>
 * @author xcye <br/>
 */

@Mapper
public interface RouterPermissionDao extends BaseDao<RouterPermission> {

}