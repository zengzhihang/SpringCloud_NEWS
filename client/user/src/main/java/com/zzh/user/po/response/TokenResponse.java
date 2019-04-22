package com.zzh.user.po.response;

import com.zzh.common.model.response.BaseResponse;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-16:47
 */

public class TokenResponse extends BaseResponse {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
