package xyz.pplax.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.article.dao.PPLAXTagDao;
import xyz.pplax.article.po.Tag;
import xyz.pplax.service.base.BaseService;

/**
 * @table tag <br/>
 * @description tag 数据表Service层 <br/>
 * @date 2022-12-14 20:46:02 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXTagService extends BaseService<Tag> {
	@SuppressWarnings("unused")
	private PPLAXTagDao tagDao;
	
	@Autowired
    public void setInfoDao(PPLAXTagDao tagDao) {
        super.setBaseDao(tagDao);
        this.tagDao = tagDao;
    }
}