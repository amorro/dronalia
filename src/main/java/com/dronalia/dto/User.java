package com.dronalia.dto;

import java.util.Objects;

public class User {
	private String email;
	private String userName;
	private String userPassword;
	private String nombre;
	private String apellidos;

	public User(String email, String userName, String userPassword, String nombre, String apellidos) {
		this.email = email;
		this.userName = userName;
		this.userPassword = userPassword;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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
				userName.equals(user.userName) &&
				userPassword.equals(user.userPassword) &&
				nombre.equals(user.nombre) &&
				apellidos.equals(user.apellidos);
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, userName);
	}

	@Override
	public String toString() {
		return "User{" +
				"email='" + email + '\'' +
				", userName='" + userName + '\'' +
				", userPassword='" + userPassword + '\'' +
				", nombre='" + nombre + '\'' +
				", apellidos='" + apellidos + '\'' +
				'}';
	}
}

	
	

