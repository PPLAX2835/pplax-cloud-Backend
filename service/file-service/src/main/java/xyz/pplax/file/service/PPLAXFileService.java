package xyz.pplax.file.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.file.po.File;
import xyz.pplax.file.dao.PPLAXFileDao;
import xyz.pplax.service.base.BaseService;

/**
 * @table file <br/>
 * @description file 数据表Service层 <br/>
 * @date 2022-12-14 22:31:22 <br/>
 * @author xcye <br/>
 */

@Service
public class PPLAXFileService extends BaseService<File> {
	@SuppressWarnings("unused")
	private PPLAXFileDao fileDao;
	
	@Autowired
    public void setInfoDao(PPLAXFileDao fileDao) {
        super.setBaseDao(fileDao);
        this.fileDao = fileDao;
    }
}