$(function (){
    $("#login").click(function (){
        var $number  = $("#number").val();
        var $name  = $("#name").val();
        var $stattingPrice  = $("#stattingPrice").val();
        var $type  = $("#type").val();
        var $img  = $("#img").val();
        var $brief  = $("#brief").val();
        var $id  = $('#login').attr('class');
        $.ajax({
            url:"/MySSM_war/UpdataProductServlet",  //等同与表单中的action
            data:{
                "number":$number,
                "name":$name,
                "stattingPrice":$stattingPrice,
                "type":$type,
                "img":$img,
                "brief":$brief,
                "id":$id,
            },  //所要提交的数据
            type:"post",      //等同于表单中的method
            dataType:"text",      //返回的数据类型
            success:function (data){
                    alert(data)
            },


        })
    });

})