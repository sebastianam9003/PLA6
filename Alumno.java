package com.trifulcas.jjee;


import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

import java.util.regex.Matcher;
//import java.util.regex.Pattern;


public class Alumno {
	//Propierties.
	
	@NotNull
	@Size(min = 3,message = "Debe de introducir el nombre del alumno")
	private String Nombre;
	
	@Validacion
	private String Dni;
	
	@Pattern(regexp="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}",message="NIF incorrecto")
	private String Email;
	
	private String Becado;
	private String Asignatura;
	
	//Getter and Setter.
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getBecado() {
		return Becado;
	}
	public void setBecado(String becado) {
		Becado = becado;
	}
	public String getAsignatura() {
		return Asignatura;
	}
	public void setAsignatura(String asignatura) {
		Asignatura = asignatura;
	}
	
	
	private Map<String, String> ListaAsignaturas;
	private Map<String, String> ListaBecado;
 	public Map<String, String> getListaAsignaturas(){
		return ListaAsignaturas;
	}
 	public Map<String, String> getListaBecado(){
		return ListaBecado;
	}
	
	public Alumno() {
		super();
		ListaAsignaturas=new LinkedHashMap<String,String>();
		ListaAsignaturas.put("PHP", "PHP");
		ListaAsignaturas.put("JAVA", "Java");
		ListaAsignaturas.put("JS", "JavaScript");
		ListaAsignaturas.put(".NET", ".NET");
		
		ListaBecado=new LinkedHashMap<String,String>();
		ListaBecado.put("S", "Sí");
		ListaBecado.put("N", "No");
	}
}
