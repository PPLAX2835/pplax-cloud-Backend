package xyz.pplax.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.admin.po.Site;
import xyz.pplax.service.base.BaseDao;

/**
 * @table site <br/>
 * @description site 数据表DAO层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author xcye <br/>
 */

@Mapper
public interface PPLAXSiteDao extends BaseDao<Site> {

}