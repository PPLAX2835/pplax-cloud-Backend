package xyz.pplax.core.exception.article;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.PPLAXException;

/**
 * @author qsyyke
 * @date Created in 2022/6/4 23:12
 */


public class ArticleException extends PPLAXException {

    public ArticleException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public ArticleException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public ArticleException(String message) {
        super(message);
    }
}
