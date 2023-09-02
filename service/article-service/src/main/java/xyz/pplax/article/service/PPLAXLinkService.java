package xyz.pplax.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.article.dao.PPLAXLinkDao;
import xyz.pplax.article.po.Link;
import xyz.pplax.service.base.BaseService;

/**
 * @table link <br/>
 * @description link 数据表Service层 <br/>
 * @date 2022-12-14 20:46:02 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXLinkService extends BaseService<Link> {
	@SuppressWarnings("unused")
	private PPLAXLinkDao linkDao;
	
	@Autowired
    public void setInfoDao(PPLAXLinkDao linkDao) {
        super.setBaseDao(linkDao);
        this.linkDao = linkDao;
    }
}