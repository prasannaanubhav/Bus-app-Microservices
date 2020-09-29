<%@include file="Meta.jsp"%>
<html>
<%@include file="HeadSection.jsp"%>
<body>
<%@include file="Header.jsp" %>

<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
  height: 100%;
  font-family: Fantasy, Helvetica, sans-serif;
  color:teal;
}

* {
  box-sizing: border-box;
}


}

/* Add styles to the form container */
.container {
  position: absolute;
  right: 0;
  margin: 20px;
  max-width: 300px;
  padding: 16px;
  background-color:0D6090;

}

/* Full-width input fields */
input[type=text], input[type=text], input[type=date] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background:6DB4BD;
  

}

input[type=text]:focus, input[type=text]:focus, input[type=date]:focus {
  background-color: #ddd;
  outline: none;

}

/* Set a style for the search button */
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


<form action="/busbook2" class="container">
<table style="margin:0px auto">
 <tr><td style = "color: white"> Source </td><td><input type="text"   placeholder="Enter Source" name="source"></td></tr>
 <tr><td style = "color: white">Destination</td><td> <input type="text"   placeholder="Enter Destination" name="destination"></td></tr>
 <tr><td style = "color: white">Date</td><td><input type="date"   placeholder="Enter Date" name="dates"></td></tr>
 <tr><td colspan="2" align="center"><input type="submit" value="SEARCH"/></td></tr>
  
    

</table>
</form>
<article>
		
		<div id="err" style="color:red;text-align:center">${msg}</div>
		
		
	</article>
  
  
 

</body>
  
  
 


</html>