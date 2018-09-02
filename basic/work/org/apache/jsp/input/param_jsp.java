package org.apache.jsp.input;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class param_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<BODY>\r\n");
      out.write("\r\n");
      out.write("<H2>いろんなパラメータ</H2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<FORM ACTION=\"../servlet/input.ParamListServlet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<P>テキストフィールド\r\n");
      out.write("\t<INPUT TYPE=\"text\" NAME=\"text1\" VALUE=\"テキストフィールド\">\r\n");
      out.write("\r\n");
      out.write("\t<P>テキストエリア\r\n");
      out.write("\t<TEXTAREA NAME=\"textarea1\" COLS=\"30\" ROWS=\"5\">テキストエリア</TEXTAREA>\r\n");
      out.write("\r\n");
      out.write("\t<P>ラジオボタン\r\n");
      out.write("\t<INPUT TYPE=\"RADIO\" NAME=\"radio1\" VALUE=\"value1\" CHECKED>左\r\n");
      out.write("\t<INPUT TYPE=\"RADIO\" NAME=\"radio1\" VALUE=\"value2\">右\r\n");
      out.write("\r\n");
      out.write("\t<P>チェックボックス\r\n");
      out.write("\t<INPUT TYPE=\"CHECKBOX\" NAME=\"check1\">ゴルフ\r\n");
      out.write("\t<INPUT TYPE=\"CHECKBOX\" NAME=\"check2\">テニス\r\n");
      out.write("\t<INPUT TYPE=\"CHECKBOX\" NAME=\"check3\">サッカー\r\n");
      out.write("\r\n");
      out.write("\t<P>セレクト\r\n");
      out.write("\t<SELECT NAME=\"lang\" SIZE=\"3\" MULTIPLE=\"true\">\r\n");
      out.write("\t\t<OPTION VALUE=\"sel1\">VB\r\n");
      out.write("\t\t<OPTION VALUE=\"sel2\">C\r\n");
      out.write("\t\t<OPTION VALUE=\"sel3\">Java\r\n");
      out.write("\t</SELECT>\r\n");
      out.write("\r\n");
      out.write("\t<P>\r\n");
      out.write("\t<INPUT TYPE=\"SUBMIT\">\r\n");
      out.write("\t<INPUT TYPE=\"RESET\">\r\n");
      out.write("\t\r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
