package Test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionManager {
			private static SessionManager manager =new SessionManager();
			private SqlSessionFactory factory;
			
			private SessionManager() {
				String config="mybatis.xml";
				InputStream is=Test.class.getClassLoader().getResourceAsStream(config);
				factory=new SqlSessionFactoryBuilder().build(is);
			}
			public static SessionManager getInstance() {
				return manager;
			}
			public SqlSession getSession() {
				return factory.openSession();
			}
	
}
