<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fomulario para visualizar alta Alumno</title>
</head>
<body>
<h1>Visualización datos del Alumno.</h1>
<p>Nombre:${alumno.nombre}</p>
<p>DNI:${alumno.dni}</p>
<p>E-Mail:${alumno.email}</p>
<p>Becado:${alumno.becado}</p>
<p>Asignatura:${alumno.asignatura}</p>
</body>
</html>