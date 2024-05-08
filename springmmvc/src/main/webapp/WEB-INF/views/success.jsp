<%@page import="springmvc.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view data</title>
</head>
<body>
<h1>${heading}</h1>
<h4>${des}</h4>
<h3 style="color: green;">${succ }</h3>
<h1>${user.email }</h1>



</body>
</html>