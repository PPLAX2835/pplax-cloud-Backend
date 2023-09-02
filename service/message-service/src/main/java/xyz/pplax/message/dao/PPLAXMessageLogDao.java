package xyz.pplax.message.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.message.po.MessageLog;
import xyz.pplax.service.base.BaseDao;

/**
 * @table message_log <br/>
 * @description message_log 数据表DAO层 <br/>
 * @date 2022-12-14 22:01:53 <br/>
 * @author lax <br/>
 */

@Mapper
public interface PPLAXMessageLogDao extends BaseDao<MessageLog> {

}