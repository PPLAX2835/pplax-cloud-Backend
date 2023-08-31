package xyz.pplax.admin.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.pplax.admin.po.Navigation;

/**
 * @description TODO <br/>
 * @date 2022-12-13 20:45:36 <br/>
 * @author lax <br/>
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "navigation数据表的VO")
public class NavigationVO extends Navigation {

}