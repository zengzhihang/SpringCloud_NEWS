package com.zzh.user.po;

import com.zzh.common.model.BaseModel;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-16:41
 */
public class UserBean extends BaseModel {
    private String mobile;

    private String password;

    public String getMoblie() {
        return mobile;
    }

    public void setMoblie(String moblie) {
        this.mobile = moblie;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
