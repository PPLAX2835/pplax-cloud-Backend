package xyz.pplax.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.article.dao.PPLAXTalkDao;
import xyz.pplax.article.po.Talk;
import xyz.pplax.service.base.BaseService;

/**
 * @table talk <br/>
 * @description talk 数据表Service层 <br/>
 * @date 2022-12-14 20:46:02 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXTalkService extends BaseService<Talk> {
	@SuppressWarnings("unused")
	private PPLAXTalkDao talkDao;
	
	@Autowired
    public void setInfoDao(PPLAXTalkDao talkDao) {
        super.setBaseDao(talkDao);
        this.talkDao = talkDao;
    }
}