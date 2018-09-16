package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDao {
	private static String USER = "root";
    private static String PASSWORD = "root";
    private static String DB_URL = "jdbc:mysql://localhost:3306/warehouse";
    private static String DB_DRIVER = "com.mysql.jdbc.Driver";
//  private static String SQL = "";
    private static Connection connection = null;
    
    public static Connection getConnection(){

        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("���ݿ������쳣");
            e.printStackTrace();
        }
        return connection;
    }
    public  static void closeConnection(Connection connection){

                    if(connection != null){
                        try {
                            connection.close(); // �ر����ݿ�����
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
	
}
