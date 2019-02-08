package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class present_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=Windows-31J");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("\r\n");
      out.write("<!-- !DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" -->\r\n");
      out.write("<html lang=\"ja\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\">\r\n");
      out.write("\r\n");
      out.write("<title>出欠登録画面</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("background-color: #ffffca;\r\n");
      out.write("color: #2b2b2b;\r\n");
      out.write("font-size: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:link { color: #0000ff; }\r\n");
      out.write("a:visited { color: #0000a0; }\r\n");
      out.write("a:hover { color: #0000ff; }\r\n");
      out.write("a:active { color: #ff8000; }\r\n");
      out.write("\r\n");
      out.write("#MainBox {\r\n");
      out.write("margin: 50px 10px 0 10px;\r\n");
      out.write("padding-bottom: 400px;\r\n");
      out.write("text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("font-size: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#MainBox p {\r\n");
      out.write("text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".BackLink {\r\n");
      out.write("margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/yoteihyo/js/itiran.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/yoteihyo/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"MainBox\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h1>あなたは参加可否を入力してください</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<form method=\"post\" action=\"/yoteihyo/servlet/yoteihyo.PresentServlet\" method=\"post\" name=\"form1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p>名前：<input type=\"text\" name=\"yourName\" class=\"size-input-name\" maxlength=\"22\"></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"niti\"></div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p><input type=\"submit\" id=\"PresentButton\" value=\"確定ボタン\"></p>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t");
 if(!(request.getAttribute("message") ==null)) { 
      out.write("\r\n");
      out.write("\t\t\t<font size=\"6\"><b>");
      out.print( request.getAttribute("message")  );
      out.write("</b></font>\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<p class=\"BackLink\"><a href=\"#\" onClick=\"window.close(); return false;\">サブウィンドウを閉じる</a></p>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
