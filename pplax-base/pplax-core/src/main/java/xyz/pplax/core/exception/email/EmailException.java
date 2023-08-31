package xyz.pplax.core.exception.email;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.PPLAXException;

/**
 * @author qsyyke
 */


public class EmailException extends PPLAXException {

    public EmailException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public EmailException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public EmailException(String message) {
        super(message);
    }

}
