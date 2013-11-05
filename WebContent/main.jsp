<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mastermind Online</title>
</head>
<body bgcolor="lightblue">
<form action="game" method="post">
	<table border="1" align="center">
  		<tr>
    		<td>
    			Anzahl der Versuche(max: 999):
    		</td>
    		<td>
    			<input name="anzahl" type="text" size="3" maxlength="3">
    		</td>
    		<td>
    			<input type="submit" value="Loslegen!">
    		</td>
  		</tr>
	</table>
</form>
</body>
</html>