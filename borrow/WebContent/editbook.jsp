<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Edit a Book</title>
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

<h3>Edit Book with call number: ${callno}</h3>

<form action ="EditBook" method="post">
	
	<label for "book_name"><b>Book Name</b></label>
	<input type="text" name="book_name">
	
	<label for "book_author"><b>Book Author</b></label>
	<input type="text"  name="book_author">
	
	<label for "book_qty"><b>Book Quantity</b></label>
	<input type="text" name="book_qty">
	
	<label for "issued_qty"><b>Issued Quantity</b></label>
	<input type="text" name="issued_qty">
		
	<input type="hidden" name="callno" value="${callno}"/>
	
	<button type="submit">Edit Book</button>
	


</form>
</body>
</html>