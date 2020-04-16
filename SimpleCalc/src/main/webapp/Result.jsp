<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1> Your Result: </h1>

<%=request.getAttribute("result")==null?"":request.getAttribute("result") %>


<h2>Your recent Calculations are:</h2> <br>
<%=request.getAttribute("recents")==null?"":request.getAttribute("recents") %>
</body>
</html>