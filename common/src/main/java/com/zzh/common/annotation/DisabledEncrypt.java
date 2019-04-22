package com.zzh.common.annotation;

import java.lang.annotation.*;

/**
 * 禁用加密
 * @author ZengZhiHang
 * @create 2019-04-22-14:49
 */
@Target(ElementType.METHOD)//该注解可以用在method（方法）上
@Retention(RetentionPolicy.RUNTIME) //该注解在运行时生效
@Documented
public @interface DisabledEncrypt {
}
