package xyz.pplax.article.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.article.dao.PPLAXBulletinDao;
import xyz.pplax.article.po.Bulletin;
import xyz.pplax.service.base.BaseService;

/**
 * @table bulletin <br/>
 * @description bulletin 数据表Service层 <br/>
 * @date 2022-12-14 20:46:02 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXBulletinService extends BaseService<Bulletin> {
	@SuppressWarnings("unused")
	private PPLAXBulletinDao bulletinDao;
	
	@Autowired
    public void setInfoDao(PPLAXBulletinDao bulletinDao) {
        super.setBaseDao(bulletinDao);
        this.bulletinDao = bulletinDao;
    }
}