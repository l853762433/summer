package myself.mybatis.l1;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import myself.pojo.User;

public class APP {
		public static void main(String[] args) {
			String config ="mybatis.xml";
			InputStream is=APP.class.getClassLoader().getResourceAsStream(config);
			SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(is);
			SqlSession session =factory.openSession();
			System.out.println(session);
			
			String sql="myself.mybatis.l1.mapping.userMapper.selectAll";
			List<User> users =session.selectList(sql);
			for(User m:users) {
				System.out.println(m.getId());
				System.out.println(m.getName());
				
				
			}
			
			
			/*User user =new User();
			
			user.setName("WWWW11");
			
			String insertSql="myself.mybatis.l1.userMapper.insertOne";
			
			session.insert(insertSql, user);*/
			/*String sql="myself.mybatis.l1.userMapper.selectById";
			Map map=session.selectOne(sql,11);
			System.out.println(map.get("id"));
			System.out.println(map.get("name"));
			
			session.commit();
			session.close();*/
		}
		
}
