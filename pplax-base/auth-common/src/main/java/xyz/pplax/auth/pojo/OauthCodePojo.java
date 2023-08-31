package xyz.pplax.auth.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description oauth_code数据表的POJO <br/>
 * @date 2022-12-14 23:53:19 <br/>
 * @author xcye <br/>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OauthCodePojo {

    /**
     * 
     */
    @Schema(title = "")
    private String code;

    /**
     * 
     */
    @Schema(title = "")
    private Long authentication;

}