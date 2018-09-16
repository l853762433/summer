package Dao;

import org.apache.ibatis.session.SqlSession;

import mapping.UserMapper;
import pojo.User;





public class UserDao {
	
	public static boolean login(String username,String password) {
		SqlSession session = SessionManager.getInstance().getSession();
		System.out.println(session);
		UserMapper mapper=session.getMapper(UserMapper.class);
		User user=mapper.findUser(username,password);
		if(user!=null) return true;
		return false;
	}
		
	
}	
