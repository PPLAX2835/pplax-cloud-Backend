package xyz.pplax.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.admin.po.Social;
import xyz.pplax.service.base.BaseDao;

/**
 * @table social <br/>
 * @description social 数据表DAO层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author lax <br/>
 */

@Mapper
public interface PPLAXSocialDao extends BaseDao<Social> {

}