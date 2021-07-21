$(function (){

    $("#login").click(function idClick(){
        var $id  = $('#login').attr('class');
        $.ajax({
            url:"/MySSM_war/productModify",  //等同与表单中的action
            data:{
                "id":$id,
            },  //所要提交的数据
            type:"post",      //等同于表单中的method
            dataType:"text",      //返回的数据类型
            success:function (data){
                if (data == "ok"){
                    window.location = "Productmodify.jsp";
                }
            },


        })
    });

})

function idClick(a){
    var $id  = $(a).attr('class');
    $.ajax({
        url:"/MySSM_war/productModify",  //等同与表单中的action
        data:{
            "id":$id,
        },  //所要提交的数据
        type:"post",      //等同于表单中的method
        dataType:"text",      //返回的数据类型
        success:function (data){
            if (data == "ok"){
                window.location = "Productmodify.jsp";
            }
        },


    })
}
