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
		Nombre:<form:input path="Nombre" />
			<form:errors path="Nombre" cssClass="error" />
		<br />
		DNI:<form:input path="Dni" />
			<form:errors path="Dni" cssClass="error" />
		<br />
		E-Mail:<form:input path="Email" />
			<form:errors path="Email" cssClass="error" />
		<br />
		Becado:<form:radiobuttons path="Becado"
		items="${alumno.listaBecado}" />
		<br />
		Asignatura: <form:select path="Asignatura">
			<form:options items="${alumno.listaAsignaturas}" />
		</form:select>
		<br />
		<input type="submit">
	</form:form>
</body>
</body>
</html>