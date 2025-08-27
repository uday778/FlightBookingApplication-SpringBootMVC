<%@page import="com.example.FlightBookingApplication.Entity.Flight"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>Flight Results</title>
</head>

<body>
	
	<%
		List<Flight> listOfFlight = (List<Flight>)request.getAttribute("listofsearchedflights");
	
	%>
	
	<%
		for(Flight flight : listOfFlight)
		{
	%>
		
		<h1> The Flight Number is: <%=flight.getFlightNo() %></h1>
		<h1> The Flight Source is: <%=flight.getSource() %></h1>
		<h1> The Flight Destination is: <%=flight.getDestination() %></h1>
	
	<%
		}
	%>


</body>
</html>