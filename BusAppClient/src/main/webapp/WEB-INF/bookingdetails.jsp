<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
<%@include file="Header.jsp" %>

 <style>
            .my_text
            {
                font-family:   Fantasy
                font-size:      60px;
                font-weight:    bold;
                color:teal;
            }
        </style>
<article>
  
 <div class="my_text">
     <h2 style = "color: teal">Booking Details</h2>
     </div>
		

		<table>
			<thead>
				<tr>
					<th>BOOKING ID</th>
					<th>BOOKING DATE</th>
					<th>STATUS</th>
					<th>CUSTOMER ID</th>
					
					<th>CUSTOMER FIRST NAME</th><br><br>
					
					<th>CUSTOMER LAST NAME</th>
					<th>CUSTOMER EMAIL</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.booklist}" var="book">
					<tr>
						<td>
						<a href="/subbookdetails?bookid=${book.bookId}" >${book.bookId}</a>
						</td>
						<td>${book.bookdate}</td>
						<td>${book.status}</td>
						<td>${book.customerEntity.id}</td>
						
						<td>${book.customerEntity.custFirstName}</td>
						<td>${book.customerEntity.custLastName}</td>
					    <td>${book.customerEntity.email}</td>
					     

				

					</tr>
				</c:forEach>

			</tbody>
		</table>
	</article>


</body>
</html>
					
