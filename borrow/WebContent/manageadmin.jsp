<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="style.css">
<title>Manage Profile</title>
</head>
<body class="functions">
<ul>
	<li><a href="addlibrarian.jsp">Add a Librarian</a>
	<li><a href="ManageLibrarian">Manage Librarians</a>	
	<li><a href="ManageAdminRedirect">Manage Profile</a>
	<li style="float:right"><a href="LogoutAdmin">Log-Out</a>

</ul>
<h3>Manage your Profile</h3>
<form action ="ManageAdmin" method="post">
	
	<label for "admin_fn"><b>First Name</b></label>
	<input type="text" name="admin_fn">
	
	<label for "admin_ln"><b>Last Name</b></label>
	<input type="text"  name="admin_ln">
	
	<label for "admin_pw"><b>Password</b></label>
	<input type="password" name="admin_pw">
	
	 <input type="hidden" name="admin_email" value="${admin_email}"/>
	
	<button type="submit">Update</button>
	


</form>
</body>
</html>