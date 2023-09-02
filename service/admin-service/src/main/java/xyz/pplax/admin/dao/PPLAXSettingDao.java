package xyz.pplax.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.admin.po.Setting;
import xyz.pplax.service.base.BaseDao;

/**
 * @table setting <br/>
 * @description setting 数据表DAO层 <br/>
 * @date 2022-12-30 15:46:26 <br/>
 * @author lax <br/>
 */

@Mapper
public interface PPLAXSettingDao extends BaseDao<Setting> {

}