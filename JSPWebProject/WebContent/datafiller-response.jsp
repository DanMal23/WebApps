<html>
<h1 align="center">Employee Personal Data Form</h1>

<body>
	Purpose of the form: ${param.purposeOption}
	<br/><br/> 
	First name:${param.firstName}
	<br/>
	Last name: ${param.lastName}
	<br/><br/> 
	Citizenship: ${param.citizenship}
	<br/><br/> 
	Date of Birth: ${param.birthDate}
	<br/> 
	Place of birth: ${param.birthPlace}
	<br/><br/> 
	Address:
	<br/><br/> 
	Street: ${param.street}
	<br/> 
	City: ${param.city}
	<br/> 
	Zip Code: ${param.zip}
	<br/> 
	Country: ${param.country}
	<br/><br/> 
	Phone number: ${param.phone}
	<br/> 
	Email: ${param.email}
	<br/><br/> 
	Gender: ${param.gender}
	<br/><br/> 
	Marital status: ${param.maritalstat}
	<br/><br/> 
	Education:
	<ul>
		<%
			String[] edus = request.getParameterValues("edu");
			for (String x : edus) {
				out.print("<li>" + x + "</li>");
			}
		%>
	</ul>
	<br/><br/>
	
</body>

</html>

