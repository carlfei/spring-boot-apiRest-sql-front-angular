package org.example.controller;

import org.example.dto.Curso;
import org.example.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mvc;
    @MockBean
    private UserRepository userRepository;


    @Test
    public void getCursos() throws Exception {
/*
        Curso curso = new Curso(1,"primero","mates");
        curso.setId(1);
        given(userRepository.findById(1)).willReturn(curso));
        mvc.perform(get("/curso")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.tema").value("mates"));
        */
        Curso curso = new Curso();
        curso.setTema("mates");
        given(userRepository.findById(1)).willReturn(Optional.of(curso));
        mvc.perform(get("/curso")
                        .contentType(MediaType.APPLICATION_JSON))
                          .andExpect(status().isOk())
                             .andExpect(jsonPath("$.tema").value("mates"));
     }




}