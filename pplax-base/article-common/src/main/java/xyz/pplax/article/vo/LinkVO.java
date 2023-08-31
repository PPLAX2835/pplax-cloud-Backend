package xyz.pplax.article.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.pplax.article.po.Link;

/**
 * @description TODO <br/>
 * @date 2022-12-14 20:46:02 <br/>
 * @author lax <br/>
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "link数据表的VO")
public class LinkVO extends Link {

}