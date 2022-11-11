<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body style="background-color: #ccff95">
   <h1>Update Page.....</h1>
   <hr>
     <div align="center">
            <form action="reg">
          <label>Rollno</label>
          <input type="hidden" name="rollno" value="${data.rollno}" placeholder="Enter Rollno"><br><br>
          <label>Name</label>
          <input type="text" name="name" value="${data.name}"placeholder="Enter Name"><br><br>
          <label>Address</label>
          <input type="text" name="address" value="${data.address}" placeholder="Enter Address"><br><br>
          <label>Mobile No</label>
          <input type="text" name="mobileNo" value="${data.mobileNo}" placeholder="Enter Mobile Number"><br><br>
          <input type="submit" value="UPDATE"><br><br>
        </form> 
     </div>
</body>
</html>