package xyz.pplax.comment.api.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author qsyyke
 * @date Created in 2022/5/12 08:14
 */

@FeignClient(value = "pplax-article", name = "pplax-article")
public interface CommentArticleFeignService {

}
