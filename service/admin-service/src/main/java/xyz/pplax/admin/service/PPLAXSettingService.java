package xyz.pplax.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.admin.dao.PPLAXSettingDao;
import xyz.pplax.admin.po.Setting;
import xyz.pplax.service.base.BaseService;

/**
 * @table setting <br/>
 * @description setting 数据表Service层 <br/>
 * @date 2022-12-30 15:46:26 <br/>
 * @author lax <br/>
 */

@Service
public class PPLAXSettingService extends BaseService<Setting> {
	@SuppressWarnings("unused")
	private PPLAXSettingDao pplaxSettingDao;
	
	@Autowired
    public void setInfoDao(PPLAXSettingDao pplaxSettingDao) {
        super.setBaseDao(pplaxSettingDao);
        this.pplaxSettingDao = pplaxSettingDao;
    }
}