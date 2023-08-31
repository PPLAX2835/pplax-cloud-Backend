package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.po.WhiteUrl;
import xyz.pplax.admin.dao.PPLAXWhiteUrlDao;
import xyz.pplax.service.base.BaseService;

/**
 * @table white_url <br/>
 * @description white_url 数据表Service层 <br/>
 * @date 2022-12-13 22:06:00 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXWhiteUrlService extends BaseService<WhiteUrl> {
	@SuppressWarnings("unused")
	private PPLAXWhiteUrlDao whiteUrlDao;
	
	@Autowired
    public void setInfoDao(PPLAXWhiteUrlDao whiteUrlDao) {
        super.setBaseDao(whiteUrlDao);
        this.whiteUrlDao = whiteUrlDao;
    }
}