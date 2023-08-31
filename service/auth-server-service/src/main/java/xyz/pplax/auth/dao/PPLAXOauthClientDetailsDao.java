package xyz.pplax.auth.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.auth.po.OauthClientDetails;
import xyz.pplax.service.base.BaseDao;

/**
 * @table oauth_client_details <br/>
 * @description oauth_client_details 数据表DAO层 <br/>
 * @date 2022-12-14 23:53:19 <br/>
 * @author xcye <br/>
 */

@Mapper
public interface PPLAXOauthClientDetailsDao extends BaseDao<OauthClientDetails> {

}