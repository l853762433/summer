package mapping;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import pojo.User;

public interface UserMapper {
	
	@Select("select * from user where username=#{username} and password=#{password}")
	User findUser(@Param ("username") String username,@Param ("password")String password);

}
