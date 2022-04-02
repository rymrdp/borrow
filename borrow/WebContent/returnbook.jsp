<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Return Book</title>
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

<h3>Return a Book</h3>
<form action ="ReturnBook" method="post">
	
	<label for "callno"><b>Book Call No. </b></label>
	<input type="text" name="callno" required>
	
	<label for "student_id"><b>Student Id</b></label>
	<input type="text"  name="student_id" required>
	
	
	<button type="submit">Return Book</button>
	


</form>
</body>
</html>