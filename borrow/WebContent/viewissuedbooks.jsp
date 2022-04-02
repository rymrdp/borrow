<!DOCTYPE html>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.borrowlib.bean.IssueBean"%>
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

		<% ArrayList<IssueBean> list = (ArrayList) request.getAttribute("list"); %>
		
		<table cellspacing="2" cellpadding="2">
		<caption>Issued Books</caption>
		
			<tr>
				<th>Call Number</th>
				<th>Student Id</th>
				<th>Student Name</th>
				<th>Student's Phone Number</th>
				<th>Student's Email</th>
				<th>Issued Date</th>
				<th>Return Status</th>
			</tr>
		<%
		
		if(request.getAttribute("list") != null)  
		{
			
			Iterator<IssueBean> iterator = list.iterator();  
			
			while(iterator.hasNext())  // iterate through all the data until the last record
			{
				IssueBean listlib = iterator.next(); 
			%>
			<tr><td><%=listlib.getCallno()%></td>
				<td><%=listlib.getStudent_id()%></td>
				<td><%=listlib.getStudent_name()%></td>
				<td><%=listlib.getStudent_phone()%></td>
				<td><%=listlib.getStudent_email()%></td>
				<td><%=listlib.getIssue_date()%></td>
				<td><%=listlib.getReturn_status()%></td>
			</tr>
			<%
			}
		}
		%>
		</table>
	

</body>
</html>