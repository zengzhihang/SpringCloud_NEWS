package com.zzh.common.configuration;

import com.zzh.common.advice.EncryptResponsetBodyAdvice;
import com.zzh.common.advice.EncryptRequestBodyAdvice;
import com.zzh.common.properties.EncryptProperties;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-15:51
 */
@SpringBootConfiguration
@Component
@EnableAutoConfiguration
@EnableConfigurationProperties(EncryptProperties.class)
public class EncryptAutoConfiguration {
    /**
     * 配置请求解密
     *
     * @return
     */
    @Bean
    public EncryptResponsetBodyAdvice encryptResponsetBodyAdvice(){ return new EncryptResponsetBodyAdvice(); }


    /**
     * 配置请求加密
     *
     * @return
     */
    @Bean
    public EncryptRequestBodyAdvice encryptRequestBodyAdvice(){
        return new EncryptRequestBodyAdvice();
    }
}
