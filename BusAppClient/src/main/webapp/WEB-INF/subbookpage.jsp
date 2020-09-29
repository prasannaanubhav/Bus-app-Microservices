<%@include file="Meta.jsp" %>
<html>
<%@include file="HeadSection.jsp" %>
<body>
<%@include file="Header.jsp" %>
<article>
  <h2 style = "color: teal">Book Bus</h2>
  <!-- <div style="text-align:center;margin:20px;">
		<form action="viewpass">
			Enter Number of Passengers<input type="number" name="txtpass" required/> 
			       <input type="submit" value="search"/>
				</form>
		</div> -->
  
<div style="text-align:center;margin:20px; font-family:fantasy ;color: #5CA5AF">
Add a Co-Passenger
<a href="/subbook2">+</a>
<br>
<a href="/BookingSuccess">
 <button type="submit" class="btn">BOOK</button></a><br>
</div>
 <%--  <form action="bookingticket/cid=${sessionScope.custId}">
  <table style="margin:0px auto">
 <tr><td> Source </td><td><input type="text"   placeholder="Name" name="name"></td></tr>
 <tr><td>Destination</td><td> <input type="number"   placeholder="Age" name="age"></td></tr>
 <tr><td>Date</td><td><input type="date"   placeholder="Gender" name="gender"></td></tr>
 <tr><td colspan="2" align="center"><input type="submit" value="Add"/></td></tr>
</table>
  </form> --%>

  
</article>


</body>
</html>