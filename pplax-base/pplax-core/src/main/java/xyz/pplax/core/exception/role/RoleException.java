package xyz.pplax.core.exception.role;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.PPLAXException;

/**
 * @author qsyyke
 * @date Created in 2022/5/4 21:07
 */


public class RoleException extends PPLAXException {

    public RoleException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public RoleException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public RoleException(String message) {
        super(message);
    }
}
