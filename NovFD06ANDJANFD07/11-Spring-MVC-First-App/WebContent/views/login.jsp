<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <script type="text/javascript">
 
   function  checkCred() {

	    var un = document.getElementById("un").value;
	    var ps = document.getElementById("ps").value;
	    
	    alert("User Name Is : "+un);
	    alert("Password Is : "+ps);
	    
}
 </script>

<body style="background-color: #ffffcc">
   <h1>Login Page.....</h1>
      
     <div align="center">
            <form action="login">
          <label>User Name</label>
          <input type="text" name="uname" placeholder="Enter UserName" id="un"><br><br>
          <label>Password</label>
          <input type="text" name="pass" placeholder="Enter Password" id="ps"><br><br>
          <input type="submit" value="LOGIN" onclick="checkCred()"> <br><br>
          
        </form> 
     </div>
</body>
</html>