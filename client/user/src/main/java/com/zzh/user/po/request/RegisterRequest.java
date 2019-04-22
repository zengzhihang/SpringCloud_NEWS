package com.zzh.user.po.request;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-16:45
 */
public class RegisterRequest {
    @NotEmpty
    private String moblie;
    @NotEmpty
    private String password;
    @NotEmpty
    private String capctha;

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCapctha() {
        return capctha;
    }

    public void setCapctha(String capctha) {
        this.capctha = capctha;
    }
}
