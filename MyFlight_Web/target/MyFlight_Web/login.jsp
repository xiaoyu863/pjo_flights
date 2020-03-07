<%--
  Created by IntelliJ IDEA.
  User: lixi19861125
  Date: 2019/10/14
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="jquery/jquery.js"></script>
<script type="text/javascript">
/*
 *  javascript或者jquery的代码
 * */
$(function () { // 页面一加载的时候，就调用这个函数
    // 通过id选择器获取到对应的标签的对应的属性值
    // $("#_div,#_div2").each(function (_index, ele) { // 遍历一个复数类型，index表示索引，ele表示每次遍历的元素
    //     alert(ele);
    // });

    //绑定一个点击事件
    $("#_btn").click(function () {
        $("#_div").fadeOut("slow");
    });

    //绑定一个点击事件
    $("#_btn2").click(function () {
        $("#_div").fadeIn("slow")
    });

    $("#_div").hover(function () {
        $("#_div").text("我进来了")
    },
    function () {
        $("#_div").text("我走了")
    });

});
</script>
<html>
<body>
    <div id="_div" class="clz" style="background-color: aqua; width:700px; height:600px">
        我是div
    </div>
    <div id="_div2">

    </div>
    <button id="_btn" class="clz">隐藏</button>
    <button id="_btn2" class="clz">显示</button>
</body>
</html>
