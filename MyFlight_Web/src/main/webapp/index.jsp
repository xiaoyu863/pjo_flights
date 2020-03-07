<%--
  Created by IntelliJ IDEA.
  User: lixi19861125
  Date: 2019/10/12
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="jquery/jquery.js"></script>
<%--<script type="text/javascript" src="jquery/jquery.js"></script>
<script type="text/javascript" src="echarts/echarts.min.js"></script>--%>
<html>
  <body bgcolor="#FFFFF0">


  <h1 align="center" font-size="20px" background="#f00">航班查询</h1>


  <form id="_form">


    <table border="1" width:100% id="_tab" bgcolor="#FFFFFF" bordercolor="pink" cellspacing="0px">
      <tr>
        <td width="200px" align="center">日期:</td>
        <td width="200px" align="center"><input type="text" id="_tx1" name="bt1" style="width: 200px"></td>
        <td width="200px" align="center">城市:从</td>
        <td width="200px" align="center"><input type="text" id="_tx" name="bt" style="width: 200px"></td>
        <td width="200px" align="center">到</td>
        <td width="200px" align="center"><input type="text" id="_tx2" name="bt2" style="width: 200px"></td>
        <td width="200px" align="center"><input type="button" id="btn_search" style="width: 100px" value="搜索"></td>
      </tr>
      <tr>
        <td width="200px" align="center">航空公司/航班机型</td>
        <td width="200px" align="center">起降时间</td>
        <td width="200px" align="center">机场</td>
        <td width="200px" align="center">飞行时长</td>
        <td width="200px" align="center">经停</td>
        <td width="200px" align="center">参考报价</td>
      </tr>

    </table>


  </form>


  <div id="_div">
    <table bordercolor="pink" cellspacing="0px" bgcolor="#FFFFFF">
      <tr>
        <td width="200px" >
          <div id="_div_a" style=" float:left; width:1000px ; height:80px" >
          </div>
        </td>
        <td width="200px" align="center" height="80px">
          <div id="_div_b">
          </div>
        </td>
      </tr>
    </table>
  </div>


  <div id="_div2">
    <table bordercolor="yellow" cellspacing="0px" bgcolor="#FFFFFF">
      <tr>
        <td width="200px" >
          <div id="_div2_a" style=" float:left; width:1000px ; height:80px" >
          </div>
        </td>
        <td width="200px" align="center" height="80px">
          <div id="_div2_b">
          </div>
        </td>
      </tr>
    </table>

  </div>

  <div id="_div3">
    <table bordercolor="#FF1493" cellspacing="0px" bgcolor="#FFFFFF">
      <tr>
        <td width="200px" >
          <div id="_div3_a" style=" float:left; width:1000px ; height:80px" >
          </div>
        </td>
        <td width="200px" align="center" height="80px">
          <div id="_div3_b">
          </div>
        </td>
      </tr>
    </table>

  </div>

  <div id="_div4">
    <table bordercolor="green" cellspacing="0px" bgcolor="#FFFFFF">
      <tr>
        <td width="200px" >
          <div id="_div4_a" style=" float:left; width:1000px ; height:80px" >
          </div>
        </td>
        <td width="200px" align="center" height="80px">
          <div id="_div4_b">
          </div>
        </td>
      </tr>
    </table>
  </div>

  <div id="_div5">
    <table bordercolor="red" cellspacing="0px" bgcolor="#FFFFFF">
      <tr>
        <td width="200px" >
          <div id="_div5_a" style=" float:left; width:1000px ; height:80px" >
          </div>
        </td>
        <td width="200px" align="center" height="80px">
          <div id="_div5_b">
          </div>
        </td>
      </tr>
    </table>
  </div>

  <div id="_div6">
    <table bordercolor="blue" cellspacing="0px" bgcolor="#FFFFFF">
      <tr>
        <td width="200px" >
          <div id="_div6_a" style=" float:left; width:1000px ; height:80px" >
          </div>
        </td>
        <td width="200px" align="center" height="80px">
          <div id="_div6_b">
          </div>
        </td>
      </tr>
    </table>
  </div>

  <div id="emptys" align="center" font-size="10px" background="#f00" ></div>


  <script type="text/javascript" charset="utf-8">
    $("#emptys").hide();
    var mycars=new Array()
    var hercars=new Array()
    var car=new Array()
    mycars[0]="#_div_a"
    mycars[1]="#_div2_a"
    mycars[2]="#_div3_a"
    mycars[3]="#_div4_a"
    mycars[4]="#_div5_a"
    mycars[5]="#_div6_a"
    car[0]="#_div_b"
    car[1]="#_div2_b"
    car[2]="#_div3_b"
    car[3]="#_div4_b"
    car[4]="#_div5_b"
    car[5]="#_div6_b"
    hercars[0]="#_div"
    hercars[1]="#_div2"
    hercars[2]="#_div3"
    hercars[3]="#_div4"
    hercars[4]="#_div5"
    hercars[5]="#_div6"


    $(hercars[0]).fadeOut("quick")
    $(hercars[1]).fadeOut("quick")
    $(hercars[2]).fadeOut("quick")
    $(hercars[3]).fadeOut("quick")
    $(hercars[4]).fadeOut("quick")
    $(hercars[5]).fadeOut("quick")

    $(function () { // 页面一加载的时候，就调用这个函数
      $("#btn_search").click(function () {
      $.ajax({
        url:"login.action",
        type:"post",
        data: $("#_form").serialize(),
        dataType:"json",
        success:function (_json) {
          $("#emptys").hide();
          $(hercars[0]).fadeOut("quick")
          $(hercars[1]).fadeOut("quick")
          $(hercars[2]).fadeOut("quick")
          $(hercars[3]).fadeOut("quick")
          $(hercars[4]).fadeOut("quick")
          $(hercars[5]).fadeOut("quick")


          var dataObj = _json, //返回的result为json格式的数据
                                          con = "";
          var i=0;

          if(_json!=null) {
            $.each(dataObj, function(index, item){
              $(hercars[i]).fadeIn("quick")

              con +="<a>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+item.airline+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+item.take_time+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+item.airport_name_take+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+item.flight_time+"小时"
              con +="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+item.stop_airport
              con +="<br></a><br><a>"
              con+="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +item.types2+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+item.take_time+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+item.airport_name_landing+"</a>"
              $(mycars[i]).html(con);
              cons="<details><summary>参考价格</summary><p>驴妈妈:￥"+item.a+"</p><p>心悦会员:$"+item.b+"</p><p>携程:￥"+item.c+"</p></details>"
              $(car[i]).html(cons);
              con="";
              i=i+1;
              if(i==6) {
                return false;
              }
            });
          }else{
            $(hercars[0]).fadeOut("quick")
            $(hercars[1]).fadeOut("quick")
            $(hercars[2]).fadeOut("quick")
            $(hercars[3]).fadeOut("quick")
            $(hercars[4]).fadeOut("quick")
            $(hercars[5]).fadeOut("quick")
            $("#emptys").show();
            con="暂无此航班信息！"
            $(mycars[0]).html(con);
          }

        },
        error:function (_json) {
          $(hercars[0]).fadeOut("quick")
          $(hercars[1]).fadeOut("quick")
          $(hercars[2]).fadeOut("quick")
          $(hercars[3]).fadeOut("quick")
          $(hercars[4]).fadeOut("quick")
          $(hercars[5]).fadeOut("quick")
          $("#emptys").html("<h3><font color=red>当前条件暂无航班信息</font></h3>");
          $("#emptys").show();
        }

      });
    });

    });

  </script>

  </body>

</html>
