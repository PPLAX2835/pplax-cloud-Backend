package xyz.pplax.oauth.api.service.handler;

import org.springframework.stereotype.Component;
import xyz.pplax.admin.pojo.UserPojo;
import xyz.pplax.core.entity.R;
import xyz.pplax.oauth.api.service.UserFeignService;

/**
 * @author qsyyke
 * @date Created in 2022/5/18 12:40
 */

@Component
public class UserFeignHandler implements UserFeignService {

    @Override
    public R queryUserByUsernameContainPassword(UserPojo pojo) {
        return R.failure();
    }
}
