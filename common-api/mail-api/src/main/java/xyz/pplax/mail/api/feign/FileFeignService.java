package xyz.pplax.mail.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import xyz.pplax.core.entity.R;
import xyz.pplax.data.entity.Condition;
import xyz.pplax.mail.api.feign.handler.FileFeignHandler;

/**
 * @author qsyyke
 * @date Created in 2022/5/18 19:29
 */

@FeignClient(value = "aurora-file", name = "aurora-file", fallback = FileFeignHandler.class)
public interface FileFeignService {

    @PostMapping("/file/queryListFileByCondition")
    R queryListFileByCondition(@RequestBody Condition<Long> condition);
}
