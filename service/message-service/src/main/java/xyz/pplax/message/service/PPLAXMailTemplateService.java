package xyz.pplax.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.message.dao.PPLAXMailTemplateDao;
import xyz.pplax.message.po.MailTemplate;
import xyz.pplax.service.base.BaseService;

/**
 * @table mail_template <br/>
 * @description mail_template 数据表Service层 <br/>
 * @date 2022-12-14 22:01:53 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXMailTemplateService extends BaseService<MailTemplate> {
	@SuppressWarnings("unused")
	private PPLAXMailTemplateDao mailTemplateDao;
	
	@Autowired
    public void setInfoDao(PPLAXMailTemplateDao mailTemplateDao) {
        super.setBaseDao(mailTemplateDao);
        this.mailTemplateDao = mailTemplateDao;
    }
}