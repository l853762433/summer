package login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.UserDao;
import pojo.User;


public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        //��ȡ�û���������
        String username = request.getParameter("username");

        String password = request.getParameter("password");
        //��ȡUserDaoʵ��
        UserDao userDao = new UserDao();

        User user = userDao.login(username,password);
        // �ж�user�Ƿ�Ϊ��
        if(user != null){
        // ת����LoginSuccess.jspҳ��
        //  getRequestDispatcher()������ת��
                request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
        }else{
        // ��¼ʧ��
            request.getRequestDispatcher("LoginFailed.jsp").forward(request, response);
                }
        }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
	
}
