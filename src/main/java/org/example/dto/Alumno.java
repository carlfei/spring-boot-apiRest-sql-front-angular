package org.example.dto;

import jakarta.persistence.*;

@Entity(name="alumnos")
public class Alumno {
	@OneToOne
	private Curso miCurso;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private String curso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String email) {
		this.curso = email;
	}
}
