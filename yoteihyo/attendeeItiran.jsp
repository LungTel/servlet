<!doctype html>
<%@ page language="java" contentType="text/html; charset=Windows-31J"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<%@page import="javax.servlet.ServletException"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="yoteihyo.PresentVo"%>

<HTML>
<HEAD>
<TITLE>�Q���Ҋm�F���</TITLE>

<style type="text/css">

	.BackLink {
	margin-top: 50px;
	}

</style>

</HEAD>
<link rel="stylesheet" type="text/css" href="/yoteihyo/yoteihyo.css">
<script type="text/javascript" src="/yoteihyo/js/itiran.js" ></script>
<script type="text/javascript" src="/yoteihyo/js/jquery-1.8.3.min.js"></script>

<BODY>

<h1>�Q���҂̈ꗗ</h1>
<%
	request.setCharacterEncoding("Windows-31J");
%>

<div id="a-box">

<p><b>�Q���҂̈ꗗ</b> <BR>
�Q���҂̈ꗗ�̌���</p>

<p><input type="text" name="name1" class="size-input-name" maxlength="22"></p>

<jsp:useBean id="lstPresentVo" class="yoteihyo.PresentDataMake"/>
<%
	String IDNO = request.getParameter("idNo");
	List<PresentVo> vo = new ArrayList<PresentVo>();
	if(!(IDNO == null)){
		vo = lstPresentVo.SelectData(Integer.parseInt(IDNO));
	}
%>

<table class="table1">
	<tr>
		<th></th>
		<th>No.</th>
		<th>�Q���Җ�</th>
		<th>������1</th>
		<th>������2</th>
		<th>������3</th>
		<th>������4</th>
		<th>������5</th>
		<th>������6</th>
		<th>������7</th>
		<th>������8</th>
		<th>�Z/�~1</th>
		<th>�Z/�~2</th>
		<th>�Z/�~3</th>
		<th>�Z/�~4</th>
		<th>�Z/�~5</th>
		<th>�Z/�~6</th>
		<th>�Z/�~7</th>
		<th>�Z/�~8</th>
		<th>�񓚓���</th>
	</tr>

	<% for (int i=0; i < vo.size(); i++){ %>
		<tr>
			<td></td>
			<td><%= vo.get(i).getId() %></td>
			<td><%= vo.get(i).getName1() %></td>
			<td><%= vo.get(i).getPresentDay().get(0) %></td>
			<td><%= vo.get(i).getPresentDay().get(1) %></td>
			<td><%= vo.get(i).getPresentDay().get(2) %></td>
			<td><%= vo.get(i).getPresentDay().get(3) %></td>
			<td><%= vo.get(i).getPresentDay().get(4) %></td>
			<td><%= vo.get(i).getPresentDay().get(5) %></td>
			<td><%= vo.get(i).getPresentDay().get(6) %></td>
			<td><%= vo.get(i).getPresentDay().get(7) %></td>

			<td><%= vo.get(i).getPresentProAndCon().get(0) %></td>
			<td><%= vo.get(i).getPresentProAndCon().get(1) %></td>
			<td><%= vo.get(i).getPresentProAndCon().get(2) %></td>
			<td><%= vo.get(i).getPresentProAndCon().get(3) %></td>
			<td><%= vo.get(i).getPresentProAndCon().get(4) %></td>
			<td><%= vo.get(i).getPresentProAndCon().get(5) %></td>
			<td><%= vo.get(i).getPresentProAndCon().get(6) %></td>
			<td><%= vo.get(i).getPresentProAndCon().get(7) %></td>

			<td><%= vo.get(i).getDate() %></td>
		</tr>
	<% } %>
</table>

<!--
<script type="text/javascript">
  function confirmAndSubmit(){
      if(confirm("�Q���҂̈ꗗ��\�����܂��B��낵���ł����H") == false)
          return false;
      else
          document.forms[0].submit();
  }

  function disableSubmit(form) {
    var elements = form.elements;
    for (var i = 0; i < elements.length; i++) {
      if (elements[i].type == 'submit') {
        elements[i].disabled = true;
      }
    }
  }
</script>
-->

<form name="ReSubmitForm" method="post" onsubmit="disableSubmit(this)" action="/yoteihyo/attendeeItiran.jsp">

<div id="IDNO"></div>

<input type="hidden" value="�u�Q���҂̏o���ꗗ�v�{�^��" onClick="confirmAndSubmit();" />
<!-- http://www.openspc2.org/JavaScript/study/script.html -->
<!-- https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q1318565593 -->
<!--
createRunOnceFunction(document.ReSubmitForm.submit());
��x�̂ݎ��s�ł���֐����쐬����
http://upa-pc.blogspot.com/2015/03/javascript-run-once-function.html
-->
</form>

<p> <b>�Ǘ��Ҍ���</b> <BR>
���폜�@�\����</p>

<p><input type="text" name="delete1" maxlength="4">
�`
<input type="text" name="delete2" maxlength="4"></p>

<p><textarea name="pass" rows="5" cols="36" wrap="hard"></textarea></p>
<button type="button" id="deleteButton" name="deleteButton" value="">
<font size="5" color="#333399">�폜�{�^��</font>
</button>

<br>
<%= new Date() %>
<%= request.getContextPath() %>
</div>


<div id="c-box">
	<p class="BackLink"><a href="#" onClick="window.close(); return false;">�T�u�E�B���h�E�����</a></p>
</div>

</BODY>
</HTML>