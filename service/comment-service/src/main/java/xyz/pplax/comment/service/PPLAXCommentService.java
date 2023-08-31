package xyz.pplax.comment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.comment.po.Comment;
import xyz.pplax.comment.dao.PPLAXCommentDao;
import xyz.pplax.service.base.BaseService;

/**
 * @table comment <br/>
 * @description comment 数据表Service层 <br/>
 * @date 2022-12-14 21:35:45 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXCommentService extends BaseService<Comment> {
	@SuppressWarnings("unused")
	private PPLAXCommentDao commentDao;
	
	@Autowired
    public void setInfoDao(PPLAXCommentDao commentDao) {
        super.setBaseDao(commentDao);
        this.commentDao = commentDao;
    }
}