<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>  
    <!--判断是否为空-->
     <script type="text/javascript">
        function login(form){
            if(form.username.value == ""){
                alert("用户不能为空！");
                return false;
            }
            if(form.password.value == ""){
                alert("密码不能为空！");
                return false;
            }
        }
    </script>
</head>
<body>
<center>
		<h2 align="center">管理员登录</h2>

         <form method="post" action="LoginServlet" onSubmit="return login(this);">
         
             用户名：<input type="text" name="username" ><br>
             密码：<input type="password" name="password" ><br>
                 <br>
            <input type="submit" value="登录">
        
        </form> 
    </center>
</body>
</html>