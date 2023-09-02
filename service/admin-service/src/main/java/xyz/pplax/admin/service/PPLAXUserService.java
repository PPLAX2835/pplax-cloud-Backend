package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.po.User;
import xyz.pplax.admin.dao.PPLAXUserDao;
import xyz.pplax.service.base.BaseService;

/**
 * @table user <br/>
 * @description user 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXUserService extends BaseService<User> {
	@SuppressWarnings("unused")
	private PPLAXUserDao userDao;
	
	@Autowired
    public void setInfoDao(PPLAXUserDao userDao) {
        super.setBaseDao(userDao);
        this.userDao = userDao;
    }
}