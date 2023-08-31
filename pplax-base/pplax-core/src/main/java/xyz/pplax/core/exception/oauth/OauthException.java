package xyz.pplax.core.exception.oauth;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.PPLAXException;

/**
 * @author qsyyke
 * @date Created in 2022/6/25 11:33
 */


public class OauthException extends PPLAXException {

    public OauthException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public OauthException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public OauthException(String message) {
        super(message);
    }
}
