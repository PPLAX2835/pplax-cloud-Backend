package xyz.pplax.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.admin.po.AdminRouter;
import xyz.pplax.service.base.BaseDao;

/**
 * @table admin_router <br/>
 * @description admin_router 数据表DAO层 <br/>
 * @date 2022-12-30 22:47:42 <br/>
 * @author xcye <br/>
 */

@Mapper
public interface AdminRouterDao extends BaseDao<AdminRouter> {

}