<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2021/5/23
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%
  String path = request.getContextPath();
//    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="UTF-8">
  <script type="text/javascript" src="<%=basePath%>js/jquery-3.2.1.js"></script>
  <script type="text/javascript" src="<%=basePath%>js/home.js"></script>
  <link href='../css/home.css' rel='stylesheet' type='text/css' />
  <title>拍卖系统后台管理界面</title>
</head>
<body>
<div class="home">
  <!-- banner开始 -->
  <div class="banner fl">
    <h1 class="title fl">在线拍卖后台管理系统</h1>
    <div class="userInformation fr">
      <div class="headimage fl">
        <img class="headimage" src="../images/headPortrait.png" />
      </div>
      <div class="fr">
        <img class="out" src="../images/out.png"/>
        <a class="outa" href="">退出系统</a>
      </div>
      <div class="userinf fl">
        账号：admin 账号级别：系统管理员
      </div>
    </div>
  </div>
  <!-- banner结束 -->
  <div class="time">
    <div class="time2 fl">系统时间</div>
    <div id="datetime" class="fr">
      <script>
        setInterval("document.getElementById('datetime').innerHTML=new Date().toLocaleString();", 1000);
      </script>
    </div>
    <!-- <div class="time2 fr">系统时间：2021年05月13日22:20</div> -->
  </div>
  <!--  -->
  <div class="menucontent fl">

    <!-- menu开始 -->
    <div class="menu fl">
      <div class="operationMenu fl">
        操作菜单
      </div>

      <details>
        <summary>
          商品管理
        </summary>
        <p><a id="addPortrait">添加商品</a></p>
        <p><a id="login">维护商品信息</a></p>
      </details>

      <details>
        <summary>
          商品分类管理
        </summary>
        <p>添加分类</p>
        <p>维护分类信息</p>
      </details>

      <details>
        <summary>
          拍卖管理
        </summary>
        <p>启动商品拍卖</p>
        <p>查询拍卖信息</p>
      </details>

      <details>
        <summary>
          规则管理
        </summary>
        <p>设置拍卖规则</p>
        <p>查询拍卖信息</p>
      </details>

      <details>
        <summary>
          会员管理
        </summary>
        <p>维护会员信息</p>
      </details>

      <details>
        <summary>
          系统管理
        </summary>
        <p>添加管理员</p>
        <p>维护管理员信息</p>
        <p>修改密码</p>
      </details>
    </div>

    <!-- menu结束 -->

    <!-- content开始 -->
    <div class="content fl">
      <div class="path">首页》会员管理》维护会员信息</div>
      <div class="contentInformation">
        <div class="Information">维护会员信息</div>
        <div class="tible">
          <table class="tible2" border="1px">
            <tr>
              <th>编号</th>
              <th>会员名</th>
              <th>Email</th>
              <th>联系电话</th>
              <th>操作</th>
            </tr>
            <%

            %>
            <c:forEach var="li" items="${sessionScope.userTables}">
              <tr>
                <td>${li.getId()}</td>
                <td>${li.getAcc()}</td>
                <td>${li.getPwd()}</td>
                <td>${li.getPwd()}</td>
                <td>
                  <a href="">设置密码</a>
                  <a href="" class="${li.getId()}" onclick="idClick(this)" >删除</a>
                </td>
              </tr>
            </c:forEach>
          </table>
          <div class="Operation fr">
            <a>共${sessionScope.userTables.size()}条</a>
            <a>当前页数：【1/1】</a>
            <a>第一页</a>
            <a>上一页</a>
            <a>下一页</a>
            <a>末页</a>
            <input type="text" name=""></input>
            <input type="button" name="" value="转"></input>
          </div>
        </div>

      </div>

    </div>
  </div>

</div>
</body>
</html>
