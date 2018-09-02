package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>now</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("現在時間は <BR>\r\n");
      out.print( new Date() );
      out.write(" <BR><BR>\r\n");
      out.write("\r\n");
      out.write("コンテキストルートは <BR>\r\n");
      out.print( request.getContextPath() );
      out.write(" <BR><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("対象URLは下記となります <BR>\r\n");
      out.write("local<BR>\r\n");
      out.write("\r\n");
      out.write(" <!-- 一覧\r\n");
      out.write(" http://localhost:8080/basic/test.jsp\r\n");
      out.write(" http://localhost:8080/basic/hello.jsp\r\n");
      out.write(" http://localhost:8080/basic/input/echo.jsp\r\n");
      out.write(" http://localhost:8080/basic/input/echo2.jsp\r\n");
      out.write(" http://localhost:8080/basic/input/method.jsp\r\n");
      out.write(" http://localhost:8080/basic/input/param.jsp\r\n");
      out.write(" http://localhost:8080/basic/validate/eto.jsp\r\n");
      out.write(" http://localhost:8080/basic/validate/eto2.jsp\r\n");
      out.write(" http://localhost:8080/basic/servlet/dispatch.ForwardServletA\r\n");
      out.write(" http://localhost:8080/basic/servlet/dispatch.ForwardServlet2\r\n");
      out.write(" http://localhost:8080/basic/servlet/dispatch.RandomWalkServlet\r\n");
      out.write(" http://localhost:8080/basic/servlet/reqattr.ServletA\r\n");
      out.write(" http://localhost:8080/basic/servlet/reqattr.Servlet2A\r\n");
      out.write(" http://localhost:8080/basic/servlet/reqattr.Servlet3A\r\n");
      out.write(" http://localhost:8080/basic/reqattr/guess.jsp\r\n");
      out.write(" http://localhost:8080/basic/servlet/session.CounterServlet\r\n");
      out.write(" http://localhost:8080/basic/servlet/session.SessionListServlet\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"http://localhost:8080/basic/test.jsp\" >\r\n");
      out.write("http://localhost:8080/basic/test.jsp</a>\r\n");
      out.write("<BR>\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/hello.jsp\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/hello.jsp\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/input/echo.jsp\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/input/echo.jsp\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/input/echo2.jsp\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/input/echo2.jsp\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/input/method.jsp\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/input/method.jsp\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/input/param.jsp\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/input/param.jsp\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/validate/eto.jsp\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/validate/eto.jsp\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/validate/eto2.jsp\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/validate/eto2.jsp\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/servlet/dispatch.ForwardServletA\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/servlet/dispatch.ForwardServletA\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/servlet/dispatch.ForwardServlet2\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/servlet/dispatch.ForwardServlet2\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/servlet/dispatch.RandomWalkServlet\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/servlet/dispatch.RandomWalkServlet\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/servlet/reqattr.ServletA\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/servlet/reqattr.ServletA\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/servlet/reqattr.Servlet2A\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/servlet/reqattr.Servlet2A\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/servlet/reqattr.Servlet3A\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/servlet/reqattr.Servlet3A\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/reqattr/guess.jsp\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/reqattr/guess.jsp\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/servlet/session.CounterServlet\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/servlet/session.CounterServlet\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<a href=\"\r\n");
      out.write("http://localhost:8080/basic/servlet/session.SessionListServlet\r\n");
      out.write("\" >\r\n");
      out.write("http://localhost:8080/basic/servlet/session.SessionListServlet\r\n");
      out.write("</a><BR>\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
