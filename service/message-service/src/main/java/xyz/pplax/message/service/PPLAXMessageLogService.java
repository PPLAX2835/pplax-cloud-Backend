package xyz.pplax.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.message.dao.PPLAXMessageLogDao;
import xyz.pplax.message.po.MessageLog;
import xyz.pplax.service.base.BaseService;

/**
 * @table message_log <br/>
 * @description message_log 数据表Service层 <br/>
 * @date 2022-12-14 22:01:53 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXMessageLogService extends BaseService<MessageLog> {
	@SuppressWarnings("unused")
	private PPLAXMessageLogDao messageLogDao;
	
	@Autowired
    public void setInfoDao(PPLAXMessageLogDao messageLogDao) {
        super.setBaseDao(messageLogDao);
        this.messageLogDao = messageLogDao;
    }
}