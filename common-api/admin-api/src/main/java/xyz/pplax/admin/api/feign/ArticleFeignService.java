package xyz.pplax.admin.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import xyz.pplax.article.pojo.ArticlePojo;
import xyz.pplax.core.entity.R;

/**
 * @author qsyyke
 * @date Created in 2022/4/30 15:12
 */

@FeignClient(value = "pplax-article", contextId = "admin-pplax-article", fallback = ArticleFeignHandler.class)
public interface ArticleFeignService {

    @PostMapping("/blog/article/insertArticle")
    R insertArticle (@RequestBody ArticlePojo pojo);
}
