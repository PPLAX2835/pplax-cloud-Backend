package xyz.pplax.admin.api.feign;

import org.springframework.stereotype.Component;
import xyz.pplax.article.pojo.ArticlePojo;
import xyz.pplax.core.entity.R;

/**
 * @author qsyyke
 * @date Created in 2022/4/30 15:12
 */

@Component
public class ArticleFeignHandler implements ArticleFeignService {

    @Override
    public R insertArticle(ArticlePojo pojo) {
        return R.failure();
    }
}
