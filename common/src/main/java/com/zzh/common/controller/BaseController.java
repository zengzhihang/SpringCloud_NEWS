package com.zzh.common.controller;

import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-16:17
 */
public abstract class BaseController {
    /**
     * 接口输入参数合法性校验
      * @param result
     */
    protected void validate(BindingResult result){
        List<FieldError> errorsList = result.getFieldErrors();
        errorsList.stream().forEach(item -> Assert.isTrue(false,item.getDefaultMessage()));


    }


}
