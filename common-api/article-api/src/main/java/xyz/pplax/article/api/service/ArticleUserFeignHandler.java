package xyz.pplax.article.api.service;

import org.springframework.stereotype.Component;
import xyz.pplax.admin.pojo.UserPojo;
import xyz.pplax.core.entity.R;

/**
 * @author qsyyke
 */

@Component
public class ArticleUserFeignHandler implements ArticleUserFeignService {

    @Override
    public R queryUserByUid(UserPojo pojo) {
        return R.failure();
    }
}