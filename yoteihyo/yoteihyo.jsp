<!doctype html>
<%@ page language="java" contentType="text/html; charset=Windows-31J"%>
<%@page import="java.util.Date"%>

<HTML>
<HEAD>
<TITLE>�\��\�i�X�P�W���[���\�j</TITLE>
</HEAD>
<link rel="stylesheet" type="text/css" href="/yoteihyo/yoteihyo.css">
<script type="text/javascript" src="/yoteihyo/js/calender.js" ></script>
<script type="text/javascript" src="/yoteihyo/js/jquery-1.8.3.min.js"></script>

<BODY>

<h1>�ő��I�����I�J���^���o���\</h1>

<form method="post" action="/yoteihyo/YoteihyoServlet" method="post" name="form1">
<% request.setCharacterEncoding("Windows-31J"); %>

<div id="a-box">

<p>STEP1 <b>�C�x���g��</b> <BR>
�����N�̖Y�N��A�ō����Ȃǁc</p>

<p><input type="text" name="name1" class="size-input-name" maxlength="22"></p>

<p> <b>�����i�C�Ӂj</b> <BR>
�����݉�̓����𒲐����܂��傤�I�o���́Y�؂́Z�����c</p>

<p><textarea name="textarea1" rows="5" cols="36" wrap="hard"></textarea></p>

<%= new Date() %>
<%= request.getContextPath() %>
</div>


<div id="b-box">
	<p>STEP2 <b>������</b> <BR>
	��������/��������͂��Ă�������<BR>
	���̋�؂�͉��s�Ŕ��f���܂�<BR>
	�W���܂őI���\�I<BR>
	��:<BR>
	�@2018�N8��7�� 20:00�`<BR>
	�@2018�N8��8�� 21:00�`<BR>
	�@2018�N8��9�� 21:00�`<BR><BR></p>

	<p><textarea name="textarea2" rows="5" cols="36" wrap="hard"></textarea></p>
</div>

<div id="c-box">
<a href="/yoteihyo/ItiranServlet">
�쐬���ꂽ�ꗗ���{������</a>
<BR>

<p>�����t���N���b�N����Ɠ����ɓ���������܂�</p>
<div id="calendar"></div>
</div>


<p><input type="submit" id="button" value="�o���\������"></p>
</form>

<% if(!(request.getAttribute("message") ==null)) { %>
<font size="6"><b><%= request.getAttribute("message")  %></b></font>
<% } %>

</BODY>
</HTML>