package xyz.pplax.file.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.file.po.File;
import xyz.pplax.service.base.BaseDao;

/**
 * @table file <br/>
 * @description file 数据表DAO层 <br/>
 * @date 2022-12-14 22:31:22 <br/>
 * @author xcye <br/>
 */

@Mapper
public interface PPLAXFileDao extends BaseDao<File> {

}