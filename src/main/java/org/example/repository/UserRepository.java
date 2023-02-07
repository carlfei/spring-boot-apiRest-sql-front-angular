package org.example.repository;

import org.example.dto.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface UserRepository extends CrudRepository<Curso, Integer> {
    public Curso findByTema(String tema);
    //public Optional<Curso> findById(Integer id);
}
