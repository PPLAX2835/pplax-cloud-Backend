package xyz.pplax.admin.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.pplax.admin.po.WhiteUrl;

/**
 * @description TODO <br/>
 * @date 2022-12-13 20:45:36 <br/>
 * @author lax <br/>
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "white_url数据表的VO")
public class WhiteUrlVO extends WhiteUrl {

}