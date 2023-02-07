package org.example.repository;

import org.example.dto.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends CrudRepository<Curso, Integer> {
    public Curso findByTema(String tema);

}
