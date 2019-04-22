package com.zzh.user.service;

import com.zzh.common.controller.BaseController;
import com.zzh.common.result.Code;
import com.zzh.common.result.SingleResult;
import com.zzh.common.service.BaseService;
import com.zzh.user.mapper.UserMapper;
import com.zzh.user.po.UserBean;
import com.zzh.user.po.request.LoginRequest;
import com.zzh.user.po.response.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-16:52
 */
@Transactional(rollbackFor = Exception.class)
@Service
public class UserService extends BaseService {

    @Autowired
    private UserMapper um;

    /**
     * 登陆方法
     */
    public SingleResult<TokenResponse> login(LoginRequest request){
        List<UserBean> userList = um.selectUser(request.getMobile(), request.getPassword());
        if(null!=userList && userList.size()>0){
            String token = getToken(request.getMobile(),request.getPassword());
            TokenResponse response = new TokenResponse();
            response.setToken(token);
            return SingleResult.buildSuccess(response);
        }else {
            return SingleResult.buildFailure(Code.ERROR,"手机号或者密码输入不正确");
        }

    }
}
