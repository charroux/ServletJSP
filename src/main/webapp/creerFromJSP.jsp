<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="urlTableauPersonnes" method="post">
	
		<table>
		
			<% int nb = (Integer)request.getAttribute("nombre"); %>
	    	<% for(int i=0; i<nb; i++){ %>
	    		<tr>
	    			<th>nom : <input type="text" name="nom"></th>
				</tr>
			<% } %>
		</table>
		
		<input type="submit">
		
	</form>

</body>
</html>