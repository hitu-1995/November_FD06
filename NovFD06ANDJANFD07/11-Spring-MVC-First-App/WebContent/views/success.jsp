<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
  <script type="text/javascript">
  
      function  addStudent() {
		
    	  document.myForm.action = "regPage";
    	  document.myForm.submit();
	}
      function  editStudent() {
  		
    	  document.myForm.action = "edit";
    	  document.myForm.submit();
	}
      function  deleteStudent() {
  		
    	  document.myForm.action = "delete";
    	  document.myForm.submit();
	}

  </script>
<body style="background-color: #ccff99">
	<h1>Success Page....</h1>
	<hr>


	<form name="myForm">
		<div align="center">
			<table border="2px">
				<thead>
					<tr>
						<th>Rollno</th>
						<th>Name</th>
						<th>Address</th>
						<th>Mobile No</th>
						<th>Select</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${data}" var="stu">
					
					<tr> 
					    <td><input type="radio" name="rollno" value="${stu.rollno}"></td>
						<td>${stu.rollno}</td>
						<td>${stu.name}</td>
						<td>${stu.address}</td>
						<td>${stu.mobileNo}</td>
					</tr>
					
				</c:forEach>
				</tbody>
			</table>
			  <input type="button" value="ADD" onclick="addStudent()">
		  <input type="button" value="EDIT" onclick="editStudent()">
		  <input type="button" value="DELETE" onclick="deleteStudent()">
		</div>
		
		  
	</form>
</body>
</html>