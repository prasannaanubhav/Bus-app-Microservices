<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
<%@include file="Header.jsp"%>
	<article>
		<h2>Sub Booking Details</h2>

		<table>
			<thead>
				<tr>
				   <th>CONAME</th>
					<th>AGE</th>
					<th>GENDER</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.subbook}" var="sub">
					<tr>
						<td>${sub.coName}</td>
						<td>${sub.coAge}</td>
						<td>${sub.coGender}</td>
						</tr>
				</c:forEach>

			</tbody>
		</table>
	</article>


</body>
</html>