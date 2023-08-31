package xyz.pplax.file.vo;

import lombok.Data;

/**
 * @author lax
 * @description
 * @date 2023-05-07 20:12:42
 */

@Data
public class QiniuReturnBody {

    private String bucket;

    private String key;

    private Long fsize;

    private String mimeType;

    private String hash;
}
