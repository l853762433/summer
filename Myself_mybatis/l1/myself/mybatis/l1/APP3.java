package myself.mybatis.l1;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import myself.pojo.User;

public class APP3 {
		public static void main(String[] args) {
			String config ="mybatis.xml";
			InputStream is=APP3.class.getClassLoader().getResourceAsStream(config);
			SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is);
			SqlSession session =factory.openSession();
			System.out.println(session);
			
			
			User user =new User();
			user.setId(4);
			user.setName("li444");
			
			String updatetSql="myself.mybatis.l1.userMapper.updateUser";
			
			session.update(updatetSql, user);
			session.commit();
			session.close();
		}
		
}
