<%--
  Created by IntelliJ IDEA.
  User: old
  Date: 2021/7/9
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="main">
    <div class="title">
        <span>注册</span>
    </div>

    <div class="title-msg">
        <span>请输入登录账户和密码</span>
    </div>

    <form action="admin/register" class="login-form" method="post" novalidate>
        <!--输入框-->
        <div class="input-content">
            <!--autoFocus-->
            <div>
                <input type="text" autocomplete="off"
                       placeholder="用户名" name="userName" required/>
            </div>

            <div style="margin-top: 16px">
                <input type="password"
                       autocomplete="off" placeholder="登录密码" name="password" required maxlength="32"/>
            </div>

            <div style="margin-top: 16px">
                <input type="password"
                       autocomplete="off" placeholder="确认登录密码" name="repassword" required maxlength="32"/>
            </div>
        </div>

        <!--注册按钮-->
        <div style="text-align: center">
            <button type="submit" class="enter-btn">注册</button>
        </div>

    </form>

</div>
</body>
<style>
    body {
        background: #FAF3F3;
    }

    * {
        padding: 0;
        margin: 0;
    }

    .main {
        margin: 0 auto;
        padding-left: 25px;
        padding-right: 25px;
        padding-top: 15px;
        width: 350px;
        height: 350px;
        background: #FFFFFF;
        /*以下css用于让登录表单垂直居中在界面,可删除*/
        position: absolute;
        top: 50%;
        left: 50%;
        margin-top: -175px;
        margin-left: -175px;
    }

    .title {
        width: 100%;
        height: 40px;
        line-height: 40px;
    }

    .title span {
        font-size: 18px;
        color: #353f42;
    }

    .title-msg {
        width: 100%;
        height: 64px;
        line-height: 64px;
    }

    .title:hover {
        cursor: default;
    }

    .title-msg:hover {
        cursor: default;
    }

    .title-msg span {
        font-size: 12px;
        color: #707472;
    }

    .input-content {
        width: 100%;
        height: 120px;
    }

    .input-content input {
        width: 330px;
        height: 40px;
        border: 1px solid #dad9d6;
        background: #ffffff;
        padding-left: 10px;
        padding-right: 10px;
    }

    .enter-btn {
        width: 350px;
        height: 40px;
        color: #fff;
        background: #0bc5de;
        line-height: 40px;
        text-align: center;
        border: 0px;
    }

    .foor {
        width: 100%;
        height: auto;
        color: #9b9c98;
        font-size: 12px;
        margin-top: 20px;
    }

    .enter-btn:hover {
        cursor: pointer;
        background: #1db5c9;
    }

    .foor div:hover {
        cursor: pointer;
        color: #484847;
        font-weight: 600;
    }

    .left {
        float: left;
    }

    .right {
        float: right;
    }

</style>
</html>
