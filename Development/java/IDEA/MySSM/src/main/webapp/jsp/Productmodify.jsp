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
  <link href='<%=basePath%>css/Productmodify.css' rel='stylesheet' type='text/css' />
  <script type="text/javascript" src="<%=basePath%>js/jquery-3.2.1.js"></script>
  <script type="text/javascript" src="<%=basePath%>js/Productmodify.js"></script>
  <title>拍卖系统后台管理界面</title>
</head>
</head>
<body>
<div class="home">
  <!-- banner开始 -->
  <div class="banner fl">
    <h1 class="title fl">在线拍卖后台管理系统</h1>
    <div class="userInformation fr">
      <div class="headimage fl">
        <img class="headimage" src="<%=basePath%>images/headPortrait.png" />
      </div>
      <div class="fr">
        <img class="out" src="<%=basePath%>images/out.png"/>
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
        <p>添加商品</p>
        <p><a href="Product">维护商品信息</a></p>
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
        <div class="Information">维护商品信息</div>
        <div class="tible">
<%--          <form action="Product">--%>
            <table class="tible2" border="1px">
              <%

              %>
              <c:forEach var="li" items="${sessionScope.produc}">
                <tr>
                  <td>编号</td>
                  <td><input type="text" value="${li.getNumber()}" name="number" id="number"></td>
                </tr>
                <tr>
                  <td>商品名</td>
                  <td><input type="text" value="${li.getName()}" name="name" id="name"></td>
                </tr>
                <tr>
                  <td>起拍价</td>
                  <td><input type="text" value="${li.getStattingPrice()}" name="stattingPrice" id="stattingPrice"></td>
                </tr>
                <tr>
                  <td>类型</td>
                  <td><input type="text" value="${li.getType()}" name="type" id="type"></td>
                </tr>
                <tr>
                  <td>图片</td>
                  <td><input type="text" value="${li.getImg()}" name="img" id="img"></td>
                </tr>
                <tr>
                  <td>商品简介</td>
                  <td><input type="text" value="${li.getBrief()}" name="brief" id="brief"></td>
                </tr>
                <tr>
                  <input type="button" class="${li.getID()}" id="login" value="保存">
                  <input type="button" value="返回">
                </tr>

              </c:forEach>
            </table>

<%--          </form>--%>
        </div>

      </div>

    </div>
  </div>

</div>
</body>
</html>
