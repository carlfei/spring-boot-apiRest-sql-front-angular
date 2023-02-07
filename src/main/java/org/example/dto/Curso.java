package org.example.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.management.ConstructorParameters;

@AllArgsConstructor
@NoArgsConstructor
@Entity // This tells Hibernate to make a table out of this class
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String curso;



	private String tema;
/*
	public Curso(Integer id, String tema, String curso) {
		this.id = id;
		this.tema = tema;
		this.curso = curso;
	}

	*/

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
