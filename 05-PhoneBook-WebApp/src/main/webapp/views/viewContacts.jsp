<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link src="https://cdn.datatables.net/2.1.7/css/dataTables.dataTables.css">


<script src="https://code.jquery.com/jquery-3.7.1.js">
	
</script>
<script src="https://cdn.datatables.net/2.1.7/js/dataTables.js"></script>
<script>
		$(document).ready(function(){
			
			$('#contactTbl').DataTable({
				"pagingType" : "full_numbers"
			});
		});

	function deleteConfirm() {

		return confirm("Are you sure , you want to delete?");

	}
</script>
</head>
<body>
	<h3>view Contacts Here</h3>
	<a href="addContact">+Add new Contact</a>
	<table border="1" id="contactTbl">
		<thead>
			<tr>
				<th>S.No</th>
				<th>Name</th>
				<th>Phone Number</th>
				<th>Action</th>
			</tr>

		</thead>
		<tbody>
			<c:forEach items="${contacts}" var="c" varStatus="index">
				<tr>
					<td>${index.count+1}</td>
					<td>${c.contactName}</td>
					<td>${c.contactEmail}</td>
					<td>${c.contact.Number}</td>
					<td><a href="editContact?cid=${c.contactId }">Edit</a> <a
						hred="deleteContact?cid=${c.contactId}" onclick="deleteConfirm()">Delete</a></td>

				</tr>

			</c:forEach>
		</tbody>
	</table>
</body>
</html>