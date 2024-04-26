package com.edu.primeraappweb.webapp.services;

import java.util.List;

import com.edu.primeraappweb.webapp.entities.Persona;

public interface PersonaService {
  List<Persona> obtenerTodas();

  Persona obtenerPorId(Long id);

  Persona crearPersona(Persona persona);

  Persona actualizarPersona(Long id, Persona persona);

  void eliminarPersona(Long id);

}
