package xyz.pplax.article.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.article.po.Article;
import xyz.pplax.service.base.BaseDao;

/**
 * @table article <br/>
 * @description article 数据表DAO层 <br/>
 * @date 2022-12-14 20:46:02 <br/>
 * @author lax <br/>
 */

@Mapper
public interface PPLAXArticleDao extends BaseDao<Article> {

}