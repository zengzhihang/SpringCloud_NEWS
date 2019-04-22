package com.zzh.user.mapper;

import com.zzh.user.po.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ZengZhiHang
 * @create 2019-04-22-16:49
 */
@Mapper
@Repository
public interface UserMapper {
    @Select("select id,mobile,password from new_user where mobile=#{mobile} and password=#{password}")
    List<UserBean> selectUser(@Param("mobile") String mobile, @Param("password") String password);
}
