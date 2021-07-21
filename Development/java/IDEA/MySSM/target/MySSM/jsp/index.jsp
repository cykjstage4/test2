<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
request.getScheme()返回当前连接的协议
request. getServerName ()返回当前页面所在的服务器的名字
request. getServerPort ()返回当前页面所在的服务器使用的端口
--%>
<%
    String path = request.getContextPath();
//    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>titile</title>
    <script type="text/javascript" src="<%=basePath%>js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/index.js"></script>
    <link href='css/index.css' rel='stylesheet' type='text/css' />
</head>
<body>
    <div class="banner">
        <div class="login">
            <div class="login1" style="font-size:36px">
                在线拍卖后台管理
            </div>
            <div class="login2">
                    <div class="user" style="font-size:18px">
                        <input placeholder="请输入账号" class="user-input" size="20" style="width:200px;height:30px;" type="text" name="username" id="account"/><br/>
                        <input placeholder="请输入密码" class="user-input" style="width:200px;height:30px;" type="password" name="pwd" id="password"/><br/>
                        <input placeholder="请输入验证码" style="width:90px;height:30px;" type="" id="code" class="fl"/><br/>
                        <img  src="<%=request.getContextPath() %>/imageServlet" alt="验证码" id="images" style="height: 20px;width: 100px;margin-top: -25px;margin-left: 100px" />
                    </div>
                    <canvas id="canvas" width="120" height="20"></canvas>

                    <!-- <input class="button-login" type="submit" value="登录" /> -->
                    <div class='button'>
                        <input class="loginbutton" type="button" id="login" value="登陆">
                        <input class="register" type="button" value="注册">
                    </div>
            </div>
        </div>

    </div>
</body>
</html>
