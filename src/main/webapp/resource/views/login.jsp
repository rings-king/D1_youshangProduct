<%--
  Created by IntelliJ IDEA.
  User: lanou
  Date: 2018/7/29
  Time: 下午3:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <form method="post" action="http://localhost:8080/customer/login">
        用户名：<input type="text" name="telNo" ><br>
        密码：<input type="text" name="custPaw" ><br>
        <input type="text" placeholder="请输入右侧图片的数字" name="Ncode"/>
        <img src="http://localhost:8080/code"/><a href="">刷新</a>
        <button>获取验证码</button>
        自动登录：<input type="checkbox" name="auto" value="auto" ><br>
        <input type="submit" value="登录">
    </form>
</head>
<body>

</body>
</html>