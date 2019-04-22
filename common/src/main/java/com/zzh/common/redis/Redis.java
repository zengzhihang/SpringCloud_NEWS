package com.zzh.common.redis;

import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-13:59
 */
@Component
public class Redis {

    @Autowired
    private StringRedisTemplate template;

    /**
     *
     * @param key    键值
     * @param value  值
     * @param expine 过期时间
     */
    public void set(String key,String value,long expine){
        template.opsForValue().set(key,value,expine, TimeUnit.SECONDS);

    }
    public void set(String key,String value){
        template.opsForValue().set(key,value);
    }
    public Object get(String key){
        return template.opsForValue().get(key);
    }
    public void delete(String key){
        template.delete(key);
    }


}
