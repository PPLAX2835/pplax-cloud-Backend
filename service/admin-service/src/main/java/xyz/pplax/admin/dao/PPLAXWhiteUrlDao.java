package xyz.pplax.admin.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.admin.po.WhiteUrl;
import xyz.pplax.service.base.BaseDao;

/**
 * @table white_url <br/>
 * @description white_url 数据表DAO层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author xcye <br/>
 */

@Mapper
public interface PPLAXWhiteUrlDao extends BaseDao<WhiteUrl> {

}