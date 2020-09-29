<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
	<%@include file="Header.jsp"%>
	<article>
		<h2>Co-Passenger Details</h2>

		<form action="/addbookingticket">
			<table style="margin: 0px auto">
				<tr>
					<td>Co-Passenger Name:</td>
					<td><input type="text" placeholder="Name" name="name"></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="number" placeholder="Age" name="age"></td>
				</tr>
				<tr>
					<td>Gender</td>

					<td><input type="radio" name="gender" value="male">
						Male <input type="radio" name="gender" value="female">
						Female</td>

				</tr>
				<tr>
					<td><input type="hidden" name="cid"
						value="${sessionScope.custId}"></td>
				</tr>
				
					<tr>
					<td><input type="hidden" name="schid"
						value="${sessionScope.scheduleId}"></td>
				</tr>
				
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Add" /></td>
				</tr>
			</table>
		</form>

	</article>


</body>
</html>