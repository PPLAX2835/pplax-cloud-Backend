package xyz.pplax.auth.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.auth.po.LoginInfo;
import xyz.pplax.service.base.BaseDao;

/**
 * @table login_info <br/>
 * @description login_info 数据表DAO层 <br/>
 * @date 2022-12-14 23:53:19 <br/>
 * @author lax <br/>
 */

@Mapper
public interface PPLAXLoginInfoDao extends BaseDao<LoginInfo> {

}