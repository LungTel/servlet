package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import yoteihyo.PresentVo;

public final class attendeeItiran_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>参加者確認画面</TITLE>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t.BackLink {\r\n");
      out.write("\tmargin-top: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</HEAD>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/yoteihyo/yoteihyo.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/yoteihyo/js/itiran.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/yoteihyo/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("\r\n");
      out.write("<h1>参加者の一覧</h1>\r\n");

	request.setCharacterEncoding("Windows-31J");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"a-box\">\r\n");
      out.write("\r\n");
      out.write("<p><b>参加者の一覧</b> <BR>\r\n");
      out.write("参加者の一覧の検索</p>\r\n");
      out.write("\r\n");
      out.write("<p><input type=\"text\" name=\"name1\" class=\"size-input-name\" maxlength=\"22\"></p>\r\n");
      out.write("\r\n");
      yoteihyo.PresentDataMake lstPresentVo = null;
      synchronized (_jspx_page_context) {
        lstPresentVo = (yoteihyo.PresentDataMake) _jspx_page_context.getAttribute("lstPresentVo", PageContext.PAGE_SCOPE);
        if (lstPresentVo == null){
          lstPresentVo = new yoteihyo.PresentDataMake();
          _jspx_page_context.setAttribute("lstPresentVo", lstPresentVo, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

	String IDNO = request.getParameter("idNo");
	List<PresentVo> vo = new ArrayList<PresentVo>();
	if(!(IDNO == null)){
		vo = lstPresentVo.SelectData(Integer.parseInt(IDNO));
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table class=\"table1\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th></th>\r\n");
      out.write("\t\t<th>No.</th>\r\n");
      out.write("\t\t<th>参加者名</th>\r\n");
      out.write("\t\t<th>候補日程1</th>\r\n");
      out.write("\t\t<th>候補日程2</th>\r\n");
      out.write("\t\t<th>候補日程3</th>\r\n");
      out.write("\t\t<th>候補日程4</th>\r\n");
      out.write("\t\t<th>候補日程5</th>\r\n");
      out.write("\t\t<th>候補日程6</th>\r\n");
      out.write("\t\t<th>候補日程7</th>\r\n");
      out.write("\t\t<th>候補日程8</th>\r\n");
      out.write("\t\t<th>〇/×1</th>\r\n");
      out.write("\t\t<th>〇/×2</th>\r\n");
      out.write("\t\t<th>〇/×3</th>\r\n");
      out.write("\t\t<th>〇/×4</th>\r\n");
      out.write("\t\t<th>〇/×5</th>\r\n");
      out.write("\t\t<th>〇/×6</th>\r\n");
      out.write("\t\t<th>〇/×7</th>\r\n");
      out.write("\t\t<th>〇/×8</th>\r\n");
      out.write("\t\t<th>回答日時</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
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
      out.print( vo.get(i).getPresentDay().get(0) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentDay().get(1) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentDay().get(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentDay().get(3) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentDay().get(4) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentDay().get(5) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentDay().get(6) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentDay().get(7) );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentProAndCon().get(0) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentProAndCon().get(1) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentProAndCon().get(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentProAndCon().get(3) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentProAndCon().get(4) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentProAndCon().get(5) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentProAndCon().get(6) );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getPresentProAndCon().get(7) );
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td>");
      out.print( vo.get(i).getDate() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  function confirmAndSubmit(){\r\n");
      out.write("      if(confirm(\"参加者の一覧を表示します。よろしいですか？\") == false)\r\n");
      out.write("          return false;\r\n");
      out.write("      else\r\n");
      out.write("          document.forms[0].submit();\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function disableSubmit(form) {\r\n");
      out.write("    var elements = form.elements;\r\n");
      out.write("    for (var i = 0; i < elements.length; i++) {\r\n");
      out.write("      if (elements[i].type == 'submit') {\r\n");
      out.write("        elements[i].disabled = true;\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<form name=\"ReSubmitForm\" method=\"post\" onsubmit=\"disableSubmit(this)\" action=\"/yoteihyo/attendeeItiran.jsp\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"IDNO\"></div>\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" value=\"「参加者の出欠一覧」ボタン\" onClick=\"confirmAndSubmit();\" />\r\n");
      out.write("<!-- http://www.openspc2.org/JavaScript/study/script.html -->\r\n");
      out.write("<!-- https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q1318565593 -->\r\n");
      out.write("<!--\r\n");
      out.write("createRunOnceFunction(document.ReSubmitForm.submit());\r\n");
      out.write("一度のみ実行できる関数を作成する\r\n");
      out.write("http://upa-pc.blogspot.com/2015/03/javascript-run-once-function.html\r\n");
      out.write("-->\r\n");
      out.write("</form>\r\n");
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
      out.write("\t<p class=\"BackLink\"><a href=\"#\" onClick=\"window.close(); return false;\">サブウィンドウを閉じる</a></p>\r\n");
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
