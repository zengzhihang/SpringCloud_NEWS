package com.zzh.common.service;

import com.zzh.common.encryption.Algorithm;
import com.zzh.common.encryption.MessageDigestUtils;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-16:12
 */
public abstract class BaseService {
    /**
     * 密码加密算法
     * @param password
     * @return
     */
    protected String encryptPassword(String password){
        return MessageDigestUtils.encrypt(password, Algorithm.SHA1);
    }

    /**
     * 生成API健全的Token
     * @param moblie
     * @param password
     * @return
     */
    protected String getToken(String moblie,String password){
        return MessageDigestUtils.encrypt(moblie+password,Algorithm.SHA1);
    }
}

