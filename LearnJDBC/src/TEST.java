import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;





public class TEST {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName(getProperty("jdbc.driver"));
			String url=getProperty("url");
			String user=getProperty("user");
			String password=getProperty("password");
			conn=DriverManager.getConnection(url, user, password);
			System.out.println("get connection"+conn);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
			
	}
	private static String getProperty(String key) {
		Properties props=new Properties();
		try {
			props.load(new FileInputStream("conn_property"));
			return props.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

}
