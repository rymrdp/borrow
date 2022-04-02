<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Edit Librarian</title>
</head>
<body class="functions">
<ul>
	<li><a href="addlibrarian.jsp">Add a Librarian</a>
	<li><a href="ManageLibrarian">Manage Librarians</a>	
	<li><a href="ManageAdminRedirect">Manage Profile</a>
	<li style="float:right"><a href="LogoutAdmin">Log-Out</a>

</ul>
<h3>Edit Librarian with Library ID: ${lib_id}</h3>
<form action ="EditLibrarian" method="post">
	
	<label for "lib_fn"><b>First Name</b></label>
	<input type="text" name="lib_fn">
	
	<label for "lib_ln"><b>Last Name</b></label>
	<input type="text"  name="lib_ln">
	
	<label for "lib_num"><b>Mobile Number</b></label>
	<input type="text" name="lib_num">
	
	<label for "lib_email"><b>E-mail</b></label>
	<input type="text" placeholder="example@sample.com" name="lib_email">
	
	<label for "lib_pw"><b>Password</b></label>
	<input type="password" name="lib_pw">
	
	 <input type="hidden" name="lib_id" value="${lib_id}"/>
	
	<button type="submit">Edit Librarian</button>
	


</form>
</body>
</html>