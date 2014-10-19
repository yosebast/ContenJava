<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<title>Spring 3 MVC Series - Contact Manager</title>
	<style type="text/css">
		body {
			font-family: sans-serif;
		}
		.data, .data td {
			border-collapse: collapse;
			width: 80%;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px;
		}
		.data th {
			font-weight: bold;
			background-color: #5C82FF;
			color: white;
		}
	</style>
</head>
<body>

<h2><spring:message code="label.title"/></h2>


<table id="Table_01" width="775" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2" width="101" height="31">
			<a href="<c:url value="/contactList.htm"/>">Lista de Contactos</a>
		</td>
	</tr>	
</table>





</body>
</html>
