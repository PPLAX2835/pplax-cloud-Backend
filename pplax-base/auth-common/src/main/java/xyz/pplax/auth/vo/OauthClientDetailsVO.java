package xyz.pplax.auth.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.pplax.auth.po.OauthClientDetails;

/**
 * @description TODO <br/>
 * @date 2022-12-14 23:53:19 <br/>
 * @author lax <br/>
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "oauth_client_details数据表的VO")
public class OauthClientDetailsVO extends OauthClientDetails {

}