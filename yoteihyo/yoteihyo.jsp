<!doctype html>
<%@ page language="java" contentType="text/html; charset=Windows-31J"%>
<%@page import="java.util.Date"%>

<HTML>
<HEAD>
<TITLE>予定表（スケジュール表）</TITLE>
</HEAD>
<link rel="stylesheet" type="text/css" href="/yoteihyo/yoteihyo.css">
<script type="text/javascript" src="/yoteihyo/js/calender.js" ></script>
<script type="text/javascript" src="/yoteihyo/js/jquery-1.8.3.min.js"></script>

<BODY>

<h1>最速！つくれる！カンタン出欠表</h1>

<form method="post" action="/yoteihyo/YoteihyoServlet" method="post" name="form1">
<% request.setCharacterEncoding("Windows-31J"); %>

<div id="a-box">

<p>STEP1 <b>イベント名</b> <BR>
※今年の忘年会、打合せなど…</p>

<p><input type="text" name="name1" class="size-input-name" maxlength="22"></p>

<p> <b>メモ（任意）</b> <BR>
※飲み会の日程を調整しましょう！出欠の〆切は〇日等…</p>

<p><textarea name="textarea1" rows="5" cols="36" wrap="hard"></textarea></p>

<%= new Date() %>
<%= request.getContextPath() %>
</div>


<div id="b-box">
	<p>STEP2 <b>候補日程</b> <BR>
	※候補日程/日時を入力してください<BR>
	候補の区切りは改行で判断します<BR>
	８件まで選択可能！<BR>
	例:<BR>
	　2018年8月7日 20:00～<BR>
	　2018年8月8日 21:00～<BR>
	　2018年8月9日 21:00～<BR><BR></p>

	<p><textarea name="textarea2" rows="5" cols="36" wrap="hard"></textarea></p>
</div>

<div id="c-box">
<a href="/yoteihyo/ItiranServlet">
作成された一覧を閲覧する</a>
<BR>

<p>↓日付をクリックすると日程に日時が入ります</p>
<div id="calendar"></div>
</div>


<p><input type="submit" id="button" value="出欠表をつくる"></p>
</form>

<% if(!(request.getAttribute("message") ==null)) { %>
<font size="6"><b><%= request.getAttribute("message")  %></b></font>
<% } %>

</BODY>
</HTML>