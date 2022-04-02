<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Add Book</title>
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

<h3>Add a Book</h3>
<form action ="AddBook" method="post">
	
	<label for "callno"><b>Call No. </b></label>
	<input type="text" name="callno" required>
	
	<label for "book"><b>Book Name</b></label>
	<input type="text"  name="book_name" required>
	
	<label for "book_author"><b>Book Author</b></label>
	<input type="text" name="book_author" required>
	
	<label for "book_qty"><b>Book Quantity</b></label>
	<input type="text" name="book_qty" required>
	
	
	<button type="submit">Add Book</button>
	


</form>
</body>
</html>