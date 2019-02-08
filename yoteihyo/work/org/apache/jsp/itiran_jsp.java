package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import yoteihyo.YoteihyoVo;

public final class itiran_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>予定表（スケジュール表）</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/yoteihyo/yoteihyo.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/yoteihyo/js/itiran.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/yoteihyo/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("\r\n");
      out.write("<h1>出欠表の一覧</h1>\r\n");

	request.setCharacterEncoding("Windows-31J");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"a-box\">\r\n");
      out.write("\r\n");
      out.write("<p><b>一覧</b> <BR>\r\n");
      out.write("一覧の検索</p>\r\n");
      out.write("\r\n");
      out.write("<p><input type=\"text\" name=\"name1\" class=\"size-input-name\" maxlength=\"22\"></p>\r\n");
      out.write("\r\n");
      yoteihyo.DataMake lstYoteihyoVo = null;
      synchronized (_jspx_page_context) {
        lstYoteihyoVo = (yoteihyo.DataMake) _jspx_page_context.getAttribute("lstYoteihyoVo", PageContext.PAGE_SCOPE);
        if (lstYoteihyoVo == null){
          lstYoteihyoVo = new yoteihyo.DataMake();
          _jspx_page_context.setAttribute("lstYoteihyoVo", lstYoteihyoVo, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

	List<YoteihyoVo> vo = new ArrayList<YoteihyoVo>();
vo = lstYoteihyoVo.SelectData();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class=\"table1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th></th>\r\n");
      out.write("\t\t<th>No.</th>\r\n");
      out.write("\t\t<th>イベント名</th>\r\n");
      out.write("\t\t<th>メモ書き</th>\r\n");
      out.write("\t\t<th>候補日程</th>\r\n");
      out.write("\t\t<th>作成日時</th>\r\n");
      out.write("\t\t<th width=\"90px\">参加登録</th>\r\n");
      out.write("\t\t<th width=\"100px\">出欠結果一覧</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 for (int i=0; i < vo.size(); i++){ 
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getId() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getName1() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getTextarea1() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getTextarea2() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getDate() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"");
      out.print( i );
      out.write("button\" name=\"button\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<font size=\"2\">出欠の登録は<br></font>\r\n");
      out.write("\t\t\t\t\t<font size=\"5\" color=\"#333399\">ココ！</font>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<button type=\"button\" id=\"");
      out.print( i );
      out.write("button2\" name=\"button2\" value=\"\" style=\"width: 100px;\">\r\n");
      out.write("\t\t\t\t\t<font size=\"2\">出欠の一覧は<br></font>\r\n");
      out.write("\t\t\t\t\t<font size=\"5\" color=\"#333399\">ココ！</font>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p> <b>管理者権限</b> <BR>\r\n");
      out.write("※削除機能実装</p>\r\n");
      out.write("\r\n");
      out.write("<p><input type=\"text\" name=\"delete1\" maxlength=\"4\">\r\n");
      out.write("～\r\n");
      out.write("<input type=\"text\" name=\"delete2\" maxlength=\"4\"></p>\r\n");
      out.write("\r\n");
      out.write("<p><textarea name=\"pass\" rows=\"5\" cols=\"36\" wrap=\"hard\"></textarea></p>\r\n");
      out.write("<button type=\"button\" id=\"deleteButton\" name=\"deleteButton\" value=\"\">\r\n");
      out.write("<font size=\"5\" color=\"#333399\">削除ボタン</font>\r\n");
      out.write("</button>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.print( new Date() );
      out.write('\r');
      out.write('\n');
      out.print( request.getContextPath() );
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"c-box\">\r\n");
      out.write("<a href=\"http://localhost:8080/yoteihyo/yoteihyo.jsp\" >\r\n");
      out.write("出欠表の作成に戻る</a>\r\n");
      out.write("<BR>\r\n");
      out.write("</div>\r\n");
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
