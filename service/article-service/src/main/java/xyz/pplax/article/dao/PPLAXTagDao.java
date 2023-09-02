package xyz.pplax.article.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.article.po.Tag;
import xyz.pplax.service.base.BaseDao;

/**
 * @table tag <br/>
 * @description tag 数据表DAO层 <br/>
 * @date 2022-12-14 20:46:02 <br/>
 * @author lax <br/>
 */

@Mapper
public interface PPLAXTagDao extends BaseDao<Tag> {

}