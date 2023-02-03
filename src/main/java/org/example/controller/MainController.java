package org.example.controller;

import com.google.gson.Gson;
import org.example.dto.Curso;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller	// This means that this class is a Controller
//@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
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

	@GetMapping(path="/all")
	//public @ResponseBody Iterable<Curso> getAllUsers() {
	public @ResponseBody String getAllUsers() {

		curso = (List<Curso>) userRepository.findAll();
			Gson gson = new Gson();
			String jsonString = gson.toJson(curso);
		return jsonString.toString();
	}

	
	@GetMapping(path="/plantilla")
	public String getUsers() {

		return "raiz";
	}
	
	
}
