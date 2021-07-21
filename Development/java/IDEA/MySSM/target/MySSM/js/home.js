$(function (){
    $("#login").click(function (){
        $.ajax({
            url:"/MySSM_war/Product",  //等同与表单中的action
            data:{

            },  //所要提交的数据
            type:"post",      //等同于表单中的method
            dataType:"text",      //返回的数据类型
            success:function (data){
              if (data == "ok"){
                  window.location = "ProductInformation.jsp";
              }
            },
        })
    });
    $("#addPortrait").click(function (){
        $.ajax({
            url:"/MySSM_war/addPortrait",  //等同与表单中的action
            data:{

            },  //所要提交的数据
            type:"post",      //等同于表单中的method
            dataType:"text",      //返回的数据类型
            success:function (data){
                if (data == "ok"){
                    window.location = "ProductInformation.jsp";
                }
            },
        })
    });
})

function idClick(a){
    var $id  = $(a).attr('class');
    $.ajax({
        url:"/MySSM_war/deleteUser" ,  //等同与表单中的action
        data:{
            "id":$id,
        },  //所要提交的数据
        type:"post",      //等同于表单中的method
        dataType:"text",      //返回的数据类型
        success:function (data){
            if (data == "ok"){

            }
        },
    })
}