<!doctype html>
<%@ page language="java" contentType="text/html; charset=Windows-31J"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="yoteihyo.YoteihyoVo"%>

<HTML>
<HEAD>
<TITLE>予定表（スケジュール表）</TITLE>
</HEAD>
<link rel="stylesheet" type="text/css" href="/yoteihyo/yoteihyo.css">
<script type="text/javascript" src="/yoteihyo/js/itiran.js" ></script>
<script type="text/javascript" src="/yoteihyo/js/jquery-1.8.3.min.js"></script>

<BODY>

<h1>出欠表の一覧</h1>
<%
	request.setCharacterEncoding("Windows-31J");
%>

<div id="a-box">

<p><b>一覧</b> <BR>
一覧の検索</p>

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
		<th>イベント名</th>
		<th>メモ書き</th>
		<th>候補日程</th>
		<th>作成日時</th>
		<th width="90px">参加登録</th>
		<th width="100px">出欠結果一覧</th>
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
					<font size="2">出欠の登録は<br></font>
					<font size="5" color="#333399">ココ！</font>
				</button>
			</td>
			<td>
				<button type="button" id="<%= i %>button2" name="button2" value="" style="width: 100px;">
					<font size="2">出欠の一覧は<br></font>
					<font size="5" color="#333399">ココ！</font>
				</button>
			</td>

		</tr>
	<% } %>
</table>


<p> <b>管理者権限</b> <BR>
※削除機能実装</p>

<p><input type="text" name="delete1" maxlength="4">
～
<input type="text" name="delete2" maxlength="4"></p>

<p><textarea name="pass" rows="5" cols="36" wrap="hard"></textarea></p>
<button type="button" id="deleteButton" name="deleteButton" value="">
<font size="5" color="#333399">削除ボタン</font>
</button>

<br>
<%= new Date() %>
<%= request.getContextPath() %>
</div>


<div id="c-box">
<a href="http://localhost:8080/yoteihyo/yoteihyo.jsp" >
出欠表の作成に戻る</a>
<BR>
</div>

</BODY>
</HTML>