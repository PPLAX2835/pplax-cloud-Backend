package xyz.pplax.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.admin.po.SiteSetting;
import xyz.pplax.service.base.BaseDao;

/**
 * @table site_setting <br/>
 * @description site_setting 数据表DAO层 <br/>
 * @date 2023-01-04 20:42:58 <br/>
 * @author xcye <br/>
 */

@Mapper
public interface SiteSettingDao extends BaseDao<SiteSetting> {

}