package xyz.pplax.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.message.dao.PPLAXEmailLogDao;
import xyz.pplax.message.po.EmailLog;
import xyz.pplax.service.base.BaseService;

/**
 * @table email_log <br/>
 * @description email_log 数据表Service层 <br/>
 * @date 2022-12-14 22:01:53 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXEmailLogService extends BaseService<EmailLog> {
	@SuppressWarnings("unused")
	private PPLAXEmailLogDao emailLogDao;
	
	@Autowired
    public void setInfoDao(PPLAXEmailLogDao emailLogDao) {
        super.setBaseDao(emailLogDao);
        this.emailLogDao = emailLogDao;
    }
}