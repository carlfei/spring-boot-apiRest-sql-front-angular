package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String curso;

	private String tema;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String name) {
		this.curso = name;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String email) {
		this.tema = email;
	}
}
