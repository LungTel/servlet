<!doctype html>
<%@ page language="java" contentType="text/html; charset=Windows-31J"%>
<!-- !DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" -->
<html lang="ja">
<head>

<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<meta name="viewport" content="width=device-width">

<title>出欠登録画面</title>

<style type="text/css">
<!--

body {
background-color: #ffffca;
color: #2b2b2b;
font-size: 100%;
}

a:link { color: #0000ff; }
a:visited { color: #0000a0; }
a:hover { color: #0000ff; }
a:active { color: #ff8000; }

#MainBox {
margin: 50px 10px 0 10px;
padding-bottom: 400px;
text-align: center;
}

h1 {
font-size: 100%;
}

#MainBox p {
text-align: center;
}

.BackLink {
margin-top: 50px;
}

-->
</style>

</head>

<script type="text/javascript" src="/yoteihyo/js/itiran.js" ></script>
<script type="text/javascript" src="/yoteihyo/js/jquery-1.8.3.min.js"></script>



<body>

	<div id="MainBox">

		<h1>あなたは参加可否を入力してください</h1>

		<form method="post" action="/yoteihyo/PresentServlet" method="post" name="form1">

			<p>名前：<input type="text" name="yourName" class="size-input-name" maxlength="22"></p>

			<div id="niti"></div>
			<br>

			<p><input type="submit" id="PresentButton" value="確定ボタン"></p>
		</form>

		<% if(!(request.getAttribute("message") ==null)) { %>
			<font size="6"><b><%= request.getAttribute("message")  %></b></font>
		<% } %>

		<p class="BackLink"><a href="#" onClick="window.close(); return false;">サブウィンドウを閉じる</a></p>

	</div>


</body>
</html>
