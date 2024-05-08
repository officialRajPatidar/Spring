<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home page</title>
</head>
<body>
<h1>this home page</h1>
<h1>called by home controller</h1>

<%
String name = (String)request.getAttribute("name");
List <String> nam= (List <String>)request.getAttribute("n");
%>
<h1>my name is :
<%=name %>
</h1>
<p>
some names of students are:
<%for(String s: nam){	%>
	
	<h4><%=s %></h4>
<% }%>

</p>
</body>
</html>