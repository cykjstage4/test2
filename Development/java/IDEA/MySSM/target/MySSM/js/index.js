$(function (){
    // JS中获取到完整路径的方式
    function getRootPath() {
        //获取当前网址
        var urlPath = window.document.location.href;
        //获取主机地址之后的目录
        var pathName = window.document.location.pathname;
        var pos = urlPath.indexOf(pathName);
        //获取主机地址
        var localhostPaht = urlPath.substring(0, pos);
        //获取带"/"的项目名
        var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
        return (localhostPaht + projectName);
    }
    //验证码处理
    function code(){
        //刷新验证码图片
        $("#images").attr('src',"imageServlet?"+new Date().getTime());
        //清空验证码输入框
        $("#code").val("");
    }

    $("#login").click(function (){
      var $account  = $("#account").val();
      var $password  = $("#password").val();
      var $code  = $("#code").val();
      $.ajax({
          url:"login",  //等同与表单中的action
          data:{
              "account":$account,
              "pwd":$password,
              "code":$code,
          },  //所要提交的数据
          type:"post",      //等同于表单中的method
          dataType:"text",      //返回的数据类型
          success:function (data){

                if (data=='ok'){
                    window.location = "jsp/home.jsp";
                }else {
                    alert(data);
                    //更新验证码
                    code();
                }

              // confirm("确定删除该权限?") 点击确定返回true
              //
              // if(confirm("确定删除该权限?")){
              //     //点击确定后操作
              //
              // }
          }
      })
    });

    $("#images").click(function (){
        //更新验证码
        code();
    })
})