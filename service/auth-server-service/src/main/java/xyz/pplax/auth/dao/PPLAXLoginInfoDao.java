package xyz.pplax.auth.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.auth.po.LoginInfo;
import xyz.pplax.service.base.BaseDao;

/**
 * au_login_info表DAO层
 */
@Mapper
public interface PPLAXLoginInfoDao extends BaseDao<LoginInfo> {

}