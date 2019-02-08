package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class yoteihyo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>予定表（スケジュール表）</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/yoteihyo/yoteihyo.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/yoteihyo/js/calender.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/yoteihyo/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("\r\n");
      out.write("<h1>最速！つくれる！カンタン出欠表</h1>\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" action=\"/yoteihyo/servlet/yoteihyo.YoteihyoServlet\" method=\"post\" name=\"form1\">\r\n");
 request.setCharacterEncoding("Windows-31J"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"a-box\">\r\n");
      out.write("\r\n");
      out.write("<p>STEP1 <b>イベント名</b> <BR>\r\n");
      out.write("※今年の忘年会、打合せなど…</p>\r\n");
      out.write("\r\n");
      out.write("<p><input type=\"text\" name=\"name1\" class=\"size-input-name\" maxlength=\"22\"></p>\r\n");
      out.write("\r\n");
      out.write("<p> <b>メモ（任意）</b> <BR>\r\n");
      out.write("※飲み会の日程を調整しましょう！出欠の〆切は〇日等…</p>\r\n");
      out.write("\r\n");
      out.write("<p><textarea name=\"textarea1\" rows=\"5\" cols=\"36\" wrap=\"hard\"></textarea></p>\r\n");
      out.write("\r\n");
      out.print( new Date() );
      out.write('\r');
      out.write('\n');
      out.print( request.getContextPath() );
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"b-box\">\r\n");
      out.write("\t<p>STEP2 <b>候補日程</b> <BR>\r\n");
      out.write("\t※候補日程/日時を入力してください<BR>\r\n");
      out.write("\t候補の区切りは改行で判断します<BR>\r\n");
      out.write("\t８件まで選択可能！<BR>\r\n");
      out.write("\t例:<BR>\r\n");
      out.write("\t　2018年8月7日 20:00～<BR>\r\n");
      out.write("\t　2018年8月8日 21:00～<BR>\r\n");
      out.write("\t　2018年8月9日 21:00～<BR><BR></p>\r\n");
      out.write("\r\n");
      out.write("\t<p><textarea name=\"textarea2\" rows=\"5\" cols=\"36\" wrap=\"hard\"></textarea></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"c-box\">\r\n");
      out.write("<a href=\"/yoteihyo/servlet/yoteihyo.ItiranServlet\">\r\n");
      out.write("作成された一覧を閲覧する</a>\r\n");
      out.write("<BR>\r\n");
      out.write("\r\n");
      out.write("<p>↓日付をクリックすると日程に日時が入ります</p>\r\n");
      out.write("<div id=\"calendar\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p><input type=\"submit\" id=\"button\" value=\"出欠表をつくる\"></p>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
 if(!(request.getAttribute("message") ==null)) { 
      out.write("\r\n");
      out.write("<font size=\"6\"><b>");
      out.print( request.getAttribute("message")  );
      out.write("</b></font>\r\n");
 } 
      out.write("\r\n");
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
