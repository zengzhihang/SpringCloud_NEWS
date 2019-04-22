package com.zzh.user.po.request;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-16:44
 */

public class LoginRequest {
    @NotEmpty
    private String mobile;
    @NotEmpty
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
