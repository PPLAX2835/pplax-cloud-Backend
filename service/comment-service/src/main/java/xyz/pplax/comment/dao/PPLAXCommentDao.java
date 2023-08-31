package xyz.pplax.comment.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.comment.po.Comment;
import xyz.pplax.service.base.BaseDao;

/**
 * @table comment <br/>
 * @description comment 数据表DAO层 <br/>
 * @date 2022-12-14 21:35:45 <br/>
 * @author xcye <br/>
 */

@Mapper
public interface PPLAXCommentDao extends BaseDao<Comment> {

}