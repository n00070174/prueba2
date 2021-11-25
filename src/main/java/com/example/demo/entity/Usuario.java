package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "USUARIOS_AUT")
	private Long id;
	private String Nombres;
	private String Apellidos;
	private String Direccion;
	private String Fecha_Nacimiento;
	private String Documento;
	private String Sexo;
	private String Telefono_Celular;
	private String Email;
	private String username;
	private String password;
	
	public Usuario() {
		super();
	}

	public Usuario(Long id, String nombres, String apellidos, String direccion, String fecha_Nacimiento,
			String documento, String sexo, String telefono_Celular, String email, String username, String password) {
		super();
		this.id = id;
		Nombres = nombres;
		Apellidos = apellidos;
		Direccion = direccion;
		Fecha_Nacimiento = fecha_Nacimiento;
		Documento = documento;
		Sexo = sexo;
		Telefono_Celular = telefono_Celular;
		Email = email;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getTelefono_Celular() {
		return Telefono_Celular;
	}

	public void setTelefono_Celular(String telefono_Celular) {
		Telefono_Celular = telefono_Celular;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
