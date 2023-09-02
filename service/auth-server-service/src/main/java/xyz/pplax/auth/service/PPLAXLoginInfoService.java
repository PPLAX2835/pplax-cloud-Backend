package xyz.pplax.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.auth.dao.PPLAXLoginInfoDao;
import xyz.pplax.auth.po.LoginInfo;
import xyz.pplax.service.base.BaseService;

/**
 * @table login_info <br/>
 * @description login_info 数据表Service层 <br/>
 * @date 2022-12-14 23:53:19 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXLoginInfoService extends BaseService<LoginInfo> {
	@SuppressWarnings("unused")
	private PPLAXLoginInfoDao loginInfoDao;
	
	@Autowired
    public void setInfoDao(PPLAXLoginInfoDao loginInfoDao) {
        super.setBaseDao(loginInfoDao);
        this.loginInfoDao = loginInfoDao;
    }
}