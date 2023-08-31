package xyz.pplax.core.exception.login;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.AuroraException;

/**
 * @author qsyyke
 * @date Created in 2022/5/17 16:15
 */


public class LoginException extends AuroraException {

    public LoginException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public LoginException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public LoginException(String message) {
        super(message);
    }
}
