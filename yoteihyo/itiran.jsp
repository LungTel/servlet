<!doctype html>
<%@ page language="java" contentType="text/html; charset=Windows-31J"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="yoteihyo.YoteihyoVo"%>

<HTML>
<HEAD>
<TITLE>�\��\�i�X�P�W���[���\�j</TITLE>
</HEAD>
<link rel="stylesheet" type="text/css" href="/yoteihyo/yoteihyo.css">
<script type="text/javascript" src="/yoteihyo/js/itiran.js" ></script>
<script type="text/javascript" src="/yoteihyo/js/jquery-1.8.3.min.js"></script>

<BODY>

<h1>�o���\�̈ꗗ</h1>
<%
	request.setCharacterEncoding("Windows-31J");
%>

<div id="a-box">

<p><b>�ꗗ</b> <BR>
�ꗗ�̌���</p>

<p><input type="text" name="name1" class="size-input-name" maxlength="22"></p>

<jsp:useBean id="lstYoteihyoVo" class="yoteihyo.DataMake"/>
<%
	List<YoteihyoVo> vo = new ArrayList<YoteihyoVo>();
vo = lstYoteihyoVo.SelectData();
%>

<table class="table1">
	<tr>
		<th></th>
		<th>No.</th>
		<th>�C�x���g��</th>
		<th>��������</th>
		<th>������</th>
		<th>�쐬����</th>
		<th width="90px">�Q���o�^</th>
		<th width="100px">�o�����ʈꗗ</th>
	</tr>
	<% for (int i=0; i < vo.size(); i++){ %>
		<tr>
			<td></td>
			<td><%= vo.get(i).getId() %></td>
			<td><%= vo.get(i).getName1() %></td>
			<td><%= vo.get(i).getTextarea1() %></td>
			<td><%= vo.get(i).getTextarea2() %></td>
			<td><%= vo.get(i).getDate() %></td>
			<td>
				<button type="button" id="<%= i %>button" name="button" value="">
					<font size="2">�o���̓o�^��<br></font>
					<font size="5" color="#333399">�R�R�I</font>
				</button>
			</td>
			<td>
				<button type="button" id="<%= i %>button2" name="button2" value="" style="width: 100px;">
					<font size="2">�o���̈ꗗ��<br></font>
					<font size="5" color="#333399">�R�R�I</font>
				</button>
			</td>

		</tr>
	<% } %>
</table>


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
<a href="http://localhost:8080/yoteihyo/yoteihyo.jsp" >
�o���\�̍쐬�ɖ߂�</a>
<BR>
</div>

</BODY>
</HTML>