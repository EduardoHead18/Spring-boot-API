package com.edu.primeraappweb.webapp.services;

import java.util.List;

import com.edu.primeraappweb.webapp.entities.Persona;

public interface PersonaService {
  List<Persona> getAllPerson();

  Persona getById(Long id);

  Persona createPerson(Persona persona);

  Persona updatePerson(Long id, Persona persona);

  void deletePerson(Long id);

}
