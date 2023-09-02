package xyz.pplax.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.admin.po.Navigation;
import xyz.pplax.service.base.BaseDao;

/**
 * @table navigation <br/>
 * @description navigation 数据表DAO层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author lax <br/>
 */

@Mapper
public interface PPLAXNavigationDao extends BaseDao<Navigation> {

}