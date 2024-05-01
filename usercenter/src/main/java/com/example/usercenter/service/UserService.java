package com.example.usercenter.service;

import com.example.usercenter.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author zxhy2
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2024-05-01 13:40:08
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     * @param userAccount 账户
     * @param userPassword 密码
     * @param checkPassword 验证密码
     * @return id
     */
    long userRegister(String userAccount,String userPassword,String checkPassword);
    /**
     * 用户登录
     * @param userAccount 账户
     * @param userPassword 密码
     * @return User
     */
    User userLogin(String userAccount,String userPassword,HttpServletRequest request);

    User getSafetyUser(User originUser);
}
