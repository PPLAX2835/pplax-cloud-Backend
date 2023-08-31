package xyz.pplax.core.exception.file;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.PPLAXException;

/**
 * 和文件相关的自定义异常
 * @author qsyyke
 */


public class FileException extends PPLAXException {

    public FileException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public FileException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public FileException(String message) {
        super(message);
    }

}
