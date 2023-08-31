package xyz.pplax.auth.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.auth.po.OauthCode;
import xyz.pplax.service.base.BaseDao;

/**
 * description : oauth_code table dao layer interface <br/>
 * time:    2022-12-14 23:53:19 <br/>
 * @author  xcye <br/>
 * @since   1.0 <br/>
 * @version 1.0 <br/>
 */
@Mapper
public interface PPLAXOauthCodeDao extends BaseDao<OauthCode> {

}