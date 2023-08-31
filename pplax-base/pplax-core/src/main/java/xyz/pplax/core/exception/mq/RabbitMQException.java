package xyz.pplax.core.exception.mq;


import xyz.pplax.core.enums.ResponseStatusCodeEnum;

/**
 * @author qsyyke
 * @date Created in 2022/4/28 08:55
 */


public class RabbitMQException extends AbstractMqMessageException {

    public RabbitMQException(String message, Integer statusCode) {
        super(message, statusCode);
    }

    public RabbitMQException(ResponseStatusCodeEnum responseCodeInfo) {
        super(responseCodeInfo);
    }

    public RabbitMQException(String message) {
        super(message);
    }
}
