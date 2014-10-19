<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<form:form method="post" action="add.htm" commandName="contact">
	<table>
		<tr>
			<td><form:label path="firstname">
					<spring:message code="label.firstname"></spring:message>
				</form:label></td>
			<td><form:input path="firstname" /></td>

		</tr>
		<tr>
		<td>
		<form:label path="lastname"><spring:message code="label.lastname"></spring:message></form:label>		
		</td>
		<td><form:input path="lastname"/></td>		
		</tr>
		<tr>
		<td>
		<form:label path="telephone"><spring:message code="label.telephone"></spring:message></form:label></td>
		<td><form:input path="telephone"/></td>
		</tr>
		
		<tr><td colspan="2"><input type="submit" value="<spring:message code="label.addcontact"/>"></td></tr>
		<tr>
			<td>&nbsp;</td>
			<td><label>Lista de Contactos</label></td>
			<td>&nbsp;</td>
		</tr>

		<tr>
			<td>&nbsp;</td>
			<td valign="top">
				<table>
					<thead>
						<tr>
							<td>Nombre</td>
							<td>Apellido</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="contact" items="${contacts}">
							<tr>
								<td><a href="contactView.htm?id=${contact.id}"><c:out
											value="${contact.firstname}" /></a></td>
								<td>$ <c:out value="${contact.lastname}" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</td>
			<td>&nbsp;</td>
		</tr>
	</table>
</form:form>