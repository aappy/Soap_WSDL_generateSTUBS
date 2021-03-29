<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lets get your info</title>
</head>
<body>
	<form name="personadd" method="post" action="personadd">
		<table>
			<tr>
				<td><label> First Name: </label></td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td><label>Middle Name: </label></td>
				<td><input type="text" name="middleName" /></td>
			</tr>
			<tr>
				<td><label>Last Name:</label></td>
				<td><input type="text" name="lastName" />
				<td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit"
					value="Submit" onclick="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>