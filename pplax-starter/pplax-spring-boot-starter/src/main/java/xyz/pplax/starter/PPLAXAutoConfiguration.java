package xyz.pplax.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import xyz.pplax.starter.properties.PPLAXProperties;

/**
 * @author qsyyke
 * @date Created in 2022/4/30 12:00
 */

@Configuration
@EnableConfigurationProperties({PPLAXProperties.class,
        PPLAXProperties.PPLAXFileProperties.class,
        PPLAXProperties.PPLAXPaginationProperties.class,
        PPLAXProperties.PPLAXAccountProperties.class,
        PPLAXProperties.PPLAXDefaultUserInfoProperties.class,
        PPLAXProperties.PPLAXAuthProperties.class})
public class PPLAXAutoConfiguration {

}
