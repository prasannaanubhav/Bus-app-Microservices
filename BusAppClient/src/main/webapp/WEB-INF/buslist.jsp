<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
	<%@include file="Header.jsp"%>
	<article>
	
		<h2>Bus Details</h2>

		<table>
			<thead>
				<tr>
					<th>Bus ID</th>
					<th>Bus Name</th>
					<th>Source</th>
					<th>Destination</th>
					<th>Date of Departure</th>
					<th>Fare</th>
					<th>Seats Available</th>
					<th>Departure Time</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.busdetails}" var="bus">
				
					<tr>
						<td>${bus.busDetail.busId}</td>
						<td>${bus.busDetail.busName}</td>
						<td>${bus.busDetail.source}</td>
						<td>${bus.busDetail.dest}</td>
						<td>${bus.deptDate}</td>
						<td>${bus.fare}</td>
						<td>${bus.availSeats}</td>
						<td>${bus.deptTime}</td>
						


						<td><a
							href="/bookbutton?schid=${bus.busSchId}&custid=${sessionScope.custId}">Book</a></td>
                         <c:set var="scheduleId" value="${bus.busSchId}" scope="session"  />   	
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</article>


</body>
</html>




