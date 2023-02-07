package repository;

import org.example.dto.Curso;
import org.example.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest{

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private UserRepository userRepository;



    @Test
    public void repositoryTest(){
        String temaCurso = "mates";
        Curso curso = new Curso(1,"primer","mates");

        testEntityManager.persist(curso);
        testEntityManager.flush();


        Curso encuentra = userRepository.findByTema(curso.getTema());

        Assert.assertEquals(encuentra.getTema(),
                temaCurso);


    }
}