package com.zzh.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-14:39
 */
@ConfigurationProperties(prefix = "api.encrypt")
public class EncryptProperties  {
    private String key;
    private String charset="UTF-8";

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }
}
