<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h1>Hello World! Welcome to Vivek's Calculator Page.</h1>

<form action="add">
<input type="text" name="a"/><br>
<input type="text" name="b"/><br>
<input type="submit" value="ADD">
</form>
<form action="subtract">
<input type="text" name="a"/><br>
<input type="text" name="b"/><br>
<input type="submit" value="SUBTRACT">
</form>
<form action="multiply">
<input type="text" name="a"/><br>
<input type="text" name="b"/><br>
<input type="submit" value="MULTIPLY">
</form>
<form action="divide">
<input type="text" name="a"/><br>
<input type="text" name="b"/><br>
<input type="submit" value="DIVIDE">
</form>

<form action="expr">
<input type="text" name="expr"/><br>
<input type="submit" value="Evaluate">
</form>

<br><br>
<jsp:include page="Result.jsp" />

</body>
</html>
