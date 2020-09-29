
<%@ page import="com.client.entity.CustomerEntity" %>
<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
	<%@include file="Header.jsp"%>
	<article>
		<c:if test="${customerlist ne null}">
			<table id="tbl1">
				<tbody>
					<tr>
						<td>FIRST</td>
						<td>${customerlist.custFirstName}</td>
					</tr>
					<tr>
						<td>LASTNAME</td>
						<td>${customerlist.custLastName}</td>
					</tr>
					<tr>
						<td>EMAIL</td>
						<td>${customerlist.email}</td>
					</tr>
					<tr>
						<td>PASSWORD</td>
						<td>${customerlist.password}</td>
					</tr>

				</tbody>
			</table>
		</c:if>

	</article>
</body>
</html>