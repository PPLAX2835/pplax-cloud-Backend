package xyz.pplax.file.service.ext;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.pplax.data.entity.Condition;
import xyz.pplax.file.dao.ext.FileExtDao;
import xyz.pplax.file.po.File;

import java.util.List;

/**
 * @author lax
 * @description
 * @date 2022-12-14 22:47:58
 */

@Service
public class FileExtService {

    @Autowired
    private FileExtDao fileExtDao;
    public List<File> selectSpecifyFormatFiles(Condition<Long> condition) {
        return fileExtDao.selectSpecifyFormatFiles(condition);
    }

    /**
     * 查询此userUid对应的所有文件格式
     * @param userUid
     * @return
     */
    public List<String> selectAllFileFormat(Long userUid) {
        return fileExtDao.selectAllFileFormat(userUid);
    }
}
