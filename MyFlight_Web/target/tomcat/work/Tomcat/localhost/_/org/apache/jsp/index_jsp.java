/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-19 03:30:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"jquery/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <body bgcolor=\"#FFFFF0\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <h1 align=\"center\" font-size=\"20px\" background=\"#f00\">航班查询</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <form id=\"_form\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <table border=\"1\" width:100% id=\"_tab\" bgcolor=\"#FFFFFF\" bordercolor=\"pink\" cellspacing=\"0px\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"200px\" align=\"center\">日期:</td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\"><input type=\"text\" id=\"_tx1\" name=\"bt1\" style=\"width: 200px\"></td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\">城市:从</td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\"><input type=\"text\" id=\"_tx\" name=\"bt\" style=\"width: 200px\"></td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\">到</td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\"><input type=\"text\" id=\"_tx2\" name=\"bt2\" style=\"width: 200px\"></td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\"><input type=\"button\" id=\"btn_search\" style=\"width: 100px\" value=\"搜索\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"200px\" align=\"center\">航空公司/航班机型</td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\">起降时间</td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\">机场</td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\">飞行时长</td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\">经停</td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\">参考报价</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div id=\"_div\">\r\n");
      out.write("    <table bordercolor=\"pink\" cellspacing=\"0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"200px\" >\r\n");
      out.write("          <div id=\"_div_a\" style=\" float:left; width:1000px ; height:80px\" >\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\" height=\"80px\">\r\n");
      out.write("          <div id=\"_div_b\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div id=\"_div2\">\r\n");
      out.write("    <table bordercolor=\"yellow\" cellspacing=\"0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"200px\" >\r\n");
      out.write("          <div id=\"_div2_a\" style=\" float:left; width:1000px ; height:80px\" >\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\" height=\"80px\">\r\n");
      out.write("          <div id=\"_div2_b\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"_div3\">\r\n");
      out.write("    <table bordercolor=\"#FF1493\" cellspacing=\"0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"200px\" >\r\n");
      out.write("          <div id=\"_div3_a\" style=\" float:left; width:1000px ; height:80px\" >\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\" height=\"80px\">\r\n");
      out.write("          <div id=\"_div3_b\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"_div4\">\r\n");
      out.write("    <table bordercolor=\"green\" cellspacing=\"0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"200px\" >\r\n");
      out.write("          <div id=\"_div4_a\" style=\" float:left; width:1000px ; height:80px\" >\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\" height=\"80px\">\r\n");
      out.write("          <div id=\"_div4_b\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"_div5\">\r\n");
      out.write("    <table bordercolor=\"red\" cellspacing=\"0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"200px\" >\r\n");
      out.write("          <div id=\"_div5_a\" style=\" float:left; width:1000px ; height:80px\" >\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\" height=\"80px\">\r\n");
      out.write("          <div id=\"_div5_b\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"_div6\">\r\n");
      out.write("    <table bordercolor=\"blue\" cellspacing=\"0px\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"200px\" >\r\n");
      out.write("          <div id=\"_div6_a\" style=\" float:left; width:1000px ; height:80px\" >\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"200px\" align=\"center\" height=\"80px\">\r\n");
      out.write("          <div id=\"_div6_b\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"emptys\" align=\"center\" font-size=\"10px\" background=\"#f00\" ></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("    $(\"#emptys\").hide();\r\n");
      out.write("    var mycars=new Array()\r\n");
      out.write("    var hercars=new Array()\r\n");
      out.write("    var car=new Array()\r\n");
      out.write("    mycars[0]=\"#_div_a\"\r\n");
      out.write("    mycars[1]=\"#_div2_a\"\r\n");
      out.write("    mycars[2]=\"#_div3_a\"\r\n");
      out.write("    mycars[3]=\"#_div4_a\"\r\n");
      out.write("    mycars[4]=\"#_div5_a\"\r\n");
      out.write("    mycars[5]=\"#_div6_a\"\r\n");
      out.write("    car[0]=\"#_div_b\"\r\n");
      out.write("    car[1]=\"#_div2_b\"\r\n");
      out.write("    car[2]=\"#_div3_b\"\r\n");
      out.write("    car[3]=\"#_div4_b\"\r\n");
      out.write("    car[4]=\"#_div5_b\"\r\n");
      out.write("    car[5]=\"#_div6_b\"\r\n");
      out.write("    hercars[0]=\"#_div\"\r\n");
      out.write("    hercars[1]=\"#_div2\"\r\n");
      out.write("    hercars[2]=\"#_div3\"\r\n");
      out.write("    hercars[3]=\"#_div4\"\r\n");
      out.write("    hercars[4]=\"#_div5\"\r\n");
      out.write("    hercars[5]=\"#_div6\"\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(hercars[0]).fadeOut(\"quick\")\r\n");
      out.write("    $(hercars[1]).fadeOut(\"quick\")\r\n");
      out.write("    $(hercars[2]).fadeOut(\"quick\")\r\n");
      out.write("    $(hercars[3]).fadeOut(\"quick\")\r\n");
      out.write("    $(hercars[4]).fadeOut(\"quick\")\r\n");
      out.write("    $(hercars[5]).fadeOut(\"quick\")\r\n");
      out.write("\r\n");
      out.write("    $(function () { // 页面一加载的时候，就调用这个函数\r\n");
      out.write("      $(\"#btn_search\").click(function () {\r\n");
      out.write("      $.ajax({\r\n");
      out.write("        url:\"login.action\",\r\n");
      out.write("        type:\"post\",\r\n");
      out.write("        data: $(\"#_form\").serialize(),\r\n");
      out.write("        dataType:\"json\",\r\n");
      out.write("        success:function (_json) {\r\n");
      out.write("          $(\"#emptys\").hide();\r\n");
      out.write("          $(hercars[0]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[1]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[2]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[3]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[4]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[5]).fadeOut(\"quick\")\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          var dataObj = _json, //返回的result为json格式的数据\r\n");
      out.write("                                          con = \"\";\r\n");
      out.write("          var i=0;\r\n");
      out.write("\r\n");
      out.write("          if(_json!=null) {\r\n");
      out.write("            $.each(dataObj, function(index, item){\r\n");
      out.write("              $(hercars[i]).fadeIn(\"quick\")\r\n");
      out.write("\r\n");
      out.write("              con +=\"<a>\"+\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\"+item.airline+\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\"+item.take_time+\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\"+item.airport_name_take+\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\"+item.flight_time+\"小时\"\r\n");
      out.write("              con +=\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\"+item.stop_airport\r\n");
      out.write("              con +=\"<br></a><br><a>\"\r\n");
      out.write("              con+=\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\" +item.types2+\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\"+item.take_time+\"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\"+item.airport_name_landing+\"</a>\"\r\n");
      out.write("              $(mycars[i]).html(con);\r\n");
      out.write("              cons=\"<details><summary>参考价格</summary><p>驴妈妈:￥\"+item.a+\"</p><p>心悦会员:$\"+item.b+\"</p><p>携程:￥\"+item.c+\"</p></details>\"\r\n");
      out.write("              $(car[i]).html(cons);\r\n");
      out.write("              con=\"\";\r\n");
      out.write("              i=i+1;\r\n");
      out.write("              if(i==6) {\r\n");
      out.write("                return false;\r\n");
      out.write("              }\r\n");
      out.write("            });\r\n");
      out.write("          }else{\r\n");
      out.write("            $(hercars[0]).fadeOut(\"quick\")\r\n");
      out.write("            $(hercars[1]).fadeOut(\"quick\")\r\n");
      out.write("            $(hercars[2]).fadeOut(\"quick\")\r\n");
      out.write("            $(hercars[3]).fadeOut(\"quick\")\r\n");
      out.write("            $(hercars[4]).fadeOut(\"quick\")\r\n");
      out.write("            $(hercars[5]).fadeOut(\"quick\")\r\n");
      out.write("            $(\"#emptys\").show();\r\n");
      out.write("            con=\"暂无此航班信息！\"\r\n");
      out.write("            $(mycars[0]).html(con);\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("        },\r\n");
      out.write("        error:function (_json) {\r\n");
      out.write("          $(hercars[0]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[1]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[2]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[3]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[4]).fadeOut(\"quick\")\r\n");
      out.write("          $(hercars[5]).fadeOut(\"quick\")\r\n");
      out.write("          $(\"#emptys\").html(\"<h3><font color=red>当前条件暂无航班信息</font></h3>\");\r\n");
      out.write("          $(\"#emptys\").show();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("      });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
