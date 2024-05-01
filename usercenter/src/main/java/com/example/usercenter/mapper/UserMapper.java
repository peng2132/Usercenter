package com.example.usercenter.mapper;

import com.example.usercenter.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zxhy2
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2024-05-01 13:40:08
* @Entity com.example.usercenter.model.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




