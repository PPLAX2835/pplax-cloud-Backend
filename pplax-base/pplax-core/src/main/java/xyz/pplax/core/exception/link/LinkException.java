package xyz.pplax.core.exception.link;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.PPLAXException;

/**
 * @author qsyyke
 * @date Created in 2022/5/13 19:46
 */


public class LinkException extends PPLAXException {

    public LinkException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public LinkException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public LinkException(String message) {
        super(message);
    }
}
