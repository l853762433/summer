package com.xiaou.mapper;

import org.apache.ibatis.annotations.Select;

import com.xiaou.pojo.User;

public interface UserMapper {
	@Select("select * from users where username = #{username} and password = #{password}")
	User selectUserByUsernameAndPassword(User user);
}
