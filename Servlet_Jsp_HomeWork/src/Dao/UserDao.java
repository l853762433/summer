package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pojo.User;

public class UserDao {
	User user = null;
    private String SQL =""; 
    public User login(String username, String password){
        SQL = "select * from user where username = ? and password = ?";
        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
            connection = DbDao.getConnection();
            pstmt = (PreparedStatement) connection.prepareStatement(SQL);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rSet = (ResultSet) pstmt.executeQuery();
            if(rSet.next()){
                user = new User();
                user.setUsername(rSet.getString("username"));
                user.setPassword(rSet.getString("password"));
            }
            connection.close();
            pstmt.close();
        } catch (Exception e) {
            
            e.printStackTrace();
        }finally{
            DbDao.closeConnection(connection);
        }
        return user;
    }
	
}
