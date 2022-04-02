<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Librarian</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
</head>
<body class="functions">
<ul>
	<li><a href="addlibrarian.jsp">Add a Librarian</a>
	<li><a href="ManageLibrarian">Manage Librarians</a>	
	<li><a href="ManageAdminRedirect">Manage Profile</a>
	<li style="float:right"><a href="LogoutAdmin">Log-Out</a>

</ul>
<h3>Add a Librarian</h3>
<form action ="AddLibrarian" method="post">
	
	<label for "lib_fn"><b>First Name</b></label>
	<input type="text" name="lib_fn" required>
	
	<label for "lib_ln"><b>Last Name</b></label>
	<input type="text"  name="lib_ln" required>
	
	<label for "lib_num"><b>Mobile Number</b></label>
	<input type="text" name="lib_num" required>
	
	<label for "lib_email"><b>E-mail</b></label>
	<input type="text" placeholder="example@sample.com" name="lib_email" required>
	
	<label for "lib_pw"><b>Password</b></label>
	<input type="password" name="lib_pw" required>
	
	<button type="submit">Add Librarian</button>
	


</form>
</body>
</html>