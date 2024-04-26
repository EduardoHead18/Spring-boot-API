package com.edu.primeraappweb.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.primeraappweb.webapp.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
