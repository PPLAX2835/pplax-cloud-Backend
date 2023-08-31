package xyz.pplax.core.exception.setting;

import xyz.pplax.core.enums.ResponseStatusCodeEnum;
import xyz.pplax.core.exception.AuroraException;

/**
 * @author qsyyke
 */


public class SettingException extends AuroraException {

    public SettingException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public SettingException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public SettingException(String message) {
        super(message);
    }
}
