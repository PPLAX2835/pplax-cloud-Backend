package xyz.pplax.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.article.dao.PPLAXArticleDao;
import xyz.pplax.article.po.Article;
import xyz.pplax.service.base.BaseService;

/**
 * @table article <br/>
 * @description article 数据表Service层 <br/>
 * @date 2022-12-14 20:46:02 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXArticleService extends BaseService<Article> {
	@SuppressWarnings("unused")
	private PPLAXArticleDao articleDao;
	
	@Autowired
    public void setInfoDao(PPLAXArticleDao articleDao) {
        super.setBaseDao(articleDao);
        this.articleDao = articleDao;
    }
}