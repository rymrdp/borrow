<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Issue a Book</title>
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

<h3>Issue a Book</h3>
<form action ="IssueBook" method="post">
	
	<label for "callno"><b>Book Call No. </b></label>
	<input type="text" name="callno" required>
	
	<label for "student_id"><b>Student Id</b></label>
	<input type="text"  name="student_id" required>
	
	<label for "student_name"><b>Student Name</b></label>
	<input type="text" name="student_name" required>
	
	<label for "student_phone"><b>Student's Phone Number</b></label>
	<input type="text" name="student_phone" required>
	
	<label for "student_email"><b>Student's Email Address</b></label>
	<input type="text" name="student_email" required>
	
	<input type="hidden" name="return_status" value="no"/>
	
	<button type="submit">Issue Book</button>
	


</form>
</body>
</html>