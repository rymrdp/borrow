<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.borrowlib.bean.LibBean"%>
<%@page import="java.util.List" 
	isErrorPage="false"%>
<html lang="en">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Manage Librarians</title>
</head>
<body class="functions">
<ul>
	<li><a href="addlibrarian.jsp">Add a Librarian</a>
	<li><a href="ManageLibrarian">Manage Librarians</a>	
	<li><a href="ManageAdminRedirect">Manage Profile</a>
	<li style="float:right"><a href="LogoutAdmin">Log-Out</a>

</ul>

		<% ArrayList<LibBean> list = (ArrayList) request.getAttribute("list"); %>
		
		<table cellspacing="2" cellpadding="2">
		<caption>Manage Librarians</caption>
		
			<tr>
				<th>Librarian ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Mobile Number</th>
				<th>Email</th>
				<th>Password</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		<%
		
		if(request.getAttribute("list") != null)  
		{
			
			Iterator<LibBean> iterator = list.iterator();  
			
			while(iterator.hasNext())  // iterate through all the data until the last record
			{
				LibBean listlib = iterator.next(); 
			%>
			<tr><td><%=listlib.getLib_id()%></td>
				<td><%=listlib.getLib_fn()%></td>
				<td><%=listlib.getLib_ln()%></td>
				<td><%=listlib.getLib_num()%></td>
				<td><%=listlib.getLib_email()%></td>
				<td><%=listlib.getLib_pw()%></td>
				<td><a href='EditLibrarianRedirect?id=<%=listlib.getLib_id()%>'>Edit</a></td>
				<td><a href='DeleteLibrarian?id=<%=listlib.getLib_id()%>'>Delete</a></td>
			</tr>
			<%
			}
		}
		%>
		</table>
	

</body>
</html>