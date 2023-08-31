package xyz.pplax.core.exception.comment;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.PPLAXException;

/**
 * @author qsyyke
 * @date Created in 2022/5/12 14:59
 */


public class CommentException extends PPLAXException {

    public CommentException(String message) {
        super(message);
    }

    public CommentException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public CommentException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }
}