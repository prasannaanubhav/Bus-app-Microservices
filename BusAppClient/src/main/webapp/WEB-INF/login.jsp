<!DOCTYPE html>
<%@include file="Meta.jsp"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  height: 100%;
  font-family: Arial, Helvetica, sans-serif;
}
* {
  box-sizing: border-box;
}
.bg-img {
  /* The image used */
  background-image: url("aa.jpg");
  min-height: 380px;
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}
/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 20px;
  max-width: 300px;
  padding: 16px;
  background-color: white;
}
/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}
/* Set a style for the submit button */
.btn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}
.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>

<h2><CENTER><B><I>BUS TRIP</I></B></CENTER></h2>
<div class="bg-img">
  <form action="/logpage"  class="container" method="post">
    <h1><i>Login</i></h1>

    <label for="custId"><b><i>CUSTOMER ID</i></b></label>
    <input type="text" placeholder="Enter Customer Id" name="custId" required>

    <label for="psw"><b><i>PASSWORD</i></b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
    <div align="center" style="color:red;">
    <c:if test="${message ne null}">
    <h3 align ="center">${message}</h3>
    </c:if>
    
     <button type="submit" class="btn">Login</button><br>
      </div>
     </form>
    
   

   
   
 
</div>



</body>
</html>