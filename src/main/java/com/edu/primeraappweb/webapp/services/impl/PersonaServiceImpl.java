package com.edu.primeraappweb.webapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.primeraappweb.webapp.entities.Persona;
import com.edu.primeraappweb.webapp.repository.PersonaRepository;
import com.edu.primeraappweb.webapp.services.PersonaService;
@Service
public class PersonaServiceImpl implements PersonaService {
    // inyeccionn de dependecias
    @Autowired
    private PersonaRepository personaRepository;

  
    // obtner todas las personas de la db

    public List<Persona> getAllPerson() {
        return personaRepository.findAll();
    }

    // obtner persona por id de la db

    public Persona getById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    // crear persona en la db


    public Persona createPerson(Persona persona) {
        try {
            return personaRepository.save(persona);
        } catch (Exception e) {
            System.err.println("Error al crear el registro");
        }
        return null;
    }

    // actaulizar persona en la db
 
    public Persona updatePerson(Long id, Persona persona) {
        try {
            Persona personaExist = personaRepository.findById(id).orElse(persona);
            if (personaExist != null) {
                personaExist.setName(persona.getName());
                personaExist.setAge(persona.getAge());
                return personaRepository.save(personaExist);
            }
        } catch (Exception e) {
            System.err.println("Error en la actualización: ");
        }
        return null;
    }

    // eliminar persona en la db

    public void deletePerson(Long id) {
        try {
            personaRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error eliminando un usurio");
        }

        throw new UnsupportedOperationException("Unimplemented method 'eliminarPersona'");
    }

}
