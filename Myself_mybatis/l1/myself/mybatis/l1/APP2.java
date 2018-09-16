package myself.mybatis.l1;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import myself.pojo.User;

public class APP2 {
		public static void main(String[] args) {
			String config ="mybatis.xml";
			InputStream is=APP2.class.getClassLoader().getResourceAsStream(config);
			SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is);
			SqlSession session =factory.openSession();
			System.out.println(session);
			
			
			User user =new User();
			user.setId(4);
			user.setName("li4");
			
			String insertSql="myself.mybatis.l1.userMapper.insertWithoutId";
			
			session.insert(insertSql, user);
			session.commit();
			session.close();
		}
		
}
