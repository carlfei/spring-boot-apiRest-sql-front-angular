package org.example.controller;


import com.google.gson.Gson;
import org.example.dto.Alumno;
import org.example.dto.Curso;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/curso")
public class  MainController {
	@Autowired
	private UserRepository userRepository;

	private List<Curso> curso;


	@PostMapping(path="/add") // Map ONLY POST Requests
	public @ResponseBody String addNewUser (@RequestParam String curso
			, @RequestParam String tema) {
		Curso n = new Curso();
		n.setCurso(curso);
		n.setTema(tema);
			userRepository.save(n);
			return "Saved";
	}



    @PostMapping(path="/alumnos") // Map ONLY POST Requests
    public void metodoAlumnos (Alumno alumnoRecibido) {

    }



	@GetMapping(path="/all")
	//public @ResponseBody Iterable<Curso> getAllUsers() {
	public @ResponseBody String getAllUsers() {

		curso = (List<Curso>) userRepository.findAll();
			Gson gson = new Gson();
			String jsonString = gson.toJson(curso);
		return jsonString.toString();
	}

	@CrossOrigin(origins = "http://127.0.0.1:8080")
	@GetMapping(path="/plantilla")
	public String getUsers() {

		return "raiz";
	}

    @GetMapping("/id/{id}")
	public @ResponseBody Optional<Curso> getCursos(@PathVariable(value = "id") Integer id) {

      return   userRepository.findById(id);
    }


	@GetMapping("/formulario")
	//public String showForm(Model model) {
	public String showForm(@ModelAttribute("curso") Curso curso) {

		return "formulario";
	}



	@PostMapping("/formularioEnvio")
	//public String showForm(Model model) {
	public String getForm(@ModelAttribute("curso") Curso curso) {
		//Curso curso = new Curso();
		//model.addAttribute("curso", curso);

		return "formulario";
	}




}
