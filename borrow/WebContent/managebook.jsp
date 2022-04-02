<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.borrowlib.bean.BookBean"%>
<%@page import="java.util.List" 
	isErrorPage="false"%>
<html lang="en">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Manage Books</title>
</head>
<body class="functions">
<ul>
	<li><a href="addbook.jsp">Add a Book</a>
	<li><a href="ManageBook">Manage Book</a>	
	<li><a href="issuebook.jsp">Issue Book</a>
	<li><a href="returnbook.jsp">Return Book</a>
	<li><a href="ViewIssuedBooks">View Issued Books</a>
	<li style="float:right"><a href="LogoutLib">Log-Out</a>

</ul>

		<% ArrayList<BookBean> list = (ArrayList) request.getAttribute("list"); %>
		
		<table cellspacing="2" cellpadding="2">
			<caption>Manage Books</caption>
			<tr>
				<th>Call Number</th>
				<th>Book Name</th>
				<th>Book Author</th>
				<th>Book Quantity</th>
				<th>Issued Quantity</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		<%
		
		if(request.getAttribute("list") != null)  
		{
			
			Iterator<BookBean> iterator = list.iterator();  
			
			while(iterator.hasNext())  // iterate through all the data until the last record
			{
				BookBean listlib = iterator.next(); 
			%>
			<tr><td><%=listlib.getCallno()%></td>
				<td><%=listlib.getBook_name()%></td>
				<td><%=listlib.getBook_author()%></td>
				<td><%=listlib.getBook_qty()%></td>
				<td><%=listlib.getIssued_qty()%></td>
				<td><a href='EditBookRedirect?callno=<%=listlib.getCallno()%>'>Edit</a></td>
				<td><a href='DeleteBook?callno=<%=listlib.getCallno()%>'>Delete</a></td>
			</tr>
			<%
			}
		}
		%>
		</table>
	

</body>
</html>