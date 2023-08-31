package xyz.pplax.core.exception.token;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.PPLAXException;

/**
 * @author qsyyke
 * @date Created in 2022/5/15 14:37
 */


public class TokenException extends PPLAXException {

    public TokenException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public TokenException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public TokenException(String message) {
        super(message);
    }
}
