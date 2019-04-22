package com.zzh.user.handler;

import com.netflix.discovery.converters.Auto;
import com.zzh.common.controller.BaseController;
import com.zzh.common.model.response.BaseResponse;
import com.zzh.common.result.SingleResult;
import com.zzh.user.po.request.LoginRequest;
import com.zzh.user.po.response.TokenResponse;
import com.zzh.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-17:03
 */
@RequestMapping("user")
@RestController
public class UserHandler extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping("losin")
    public SingleResult<TokenResponse> login(@Valid @RequestBody LoginRequest request, BindingResult result){
        validate(result);
        return userService.login(request);

    }

}
