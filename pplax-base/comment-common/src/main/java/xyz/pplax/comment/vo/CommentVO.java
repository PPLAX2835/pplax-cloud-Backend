package xyz.pplax.comment.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import xyz.pplax.comment.po.Comment;

/**
 * @description TODO <br/>
 * @date 2022-12-14 21:35:45 <br/>
 * @author lax <br/>
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "comment数据表的VO")
public class CommentVO extends Comment {

}