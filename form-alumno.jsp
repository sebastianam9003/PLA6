<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario alta alumno</title>
<style>
.error{
	color: red;
}
</style>
</head>
<body>
<h1>Alta de Alumno</h1>
<form:form action="procesar" modelAttribute="alumno">
		Nombre:<form:input path="nombre" />
			<form:errors path="nombre" cssClass="error" />
		<br />
		DNI:<form:input path="dni" />
			<form:errors path="dni" cssClass="error" />
		<br />
		E-Mail:<form:input path="email" />
			<form:errors path="email" cssClass="error" />
		<br />
		Becado:<form:radiobuttons path="becado"
		items="${alumno.listaBecado}" />
		<br />
		Asignatura: <form:select path="asignatura">
			<form:options items="${alumno.listaAsignaturas}" />
		</form:select>
		<br />
		<input type="submit">
	</form:form>
</body>
</body>
</html>