package com.dronalia.dto;

import java.util.Objects;

public class User {

	private String email;
	private String nombre;
	private String apellidos;
	private String password;


	public User(String email, String nombre, String apellidos, String password) {
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.password = password;

	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return email.equals(user.email) &&
				password.equals(user.password) &&
				nombre.equals(user.nombre) &&
				apellidos.equals(user.apellidos);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public String toString() {
		return "User{" +
				"email='" + email + '\'' +
				", userPassword='" + password + '\'' +
				", nombre='" + nombre + '\'' +
				", apellidos='" + apellidos + '\'' +
				'}';
	}
}

	
	

