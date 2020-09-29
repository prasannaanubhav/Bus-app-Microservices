<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  height: 100%;
  margin: 0;
}
.bg {
  /* The image used */
  background-image: url("home.jpg");
  /* Full height */
  height: 100%; 
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
<body>
<%@include file="Header.jsp" %>
<div class="bg">
<article>
<c:set var="custId" value="${id}" scope="session"  />


<nav>
   <a href="/bookbus"><div>Book Bus</div></a>
   <a href="/viewbookdetails?custid=${sessionScope.custId}"> <div>View Booking Details</div></a>
     <a href="/customerdetails?custid=${sessionScope.custId}"> <div>Customer Details</div></a>
   <a href="/logout"><div>logout</div></a>
</nav>
<div style="text-align:center">
    ${msg}
</div>

</article>
</body>
</html>