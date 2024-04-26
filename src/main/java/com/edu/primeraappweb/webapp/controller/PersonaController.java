package com.edu.primeraappweb.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.primeraappweb.webapp.entities.Persona;
import com.edu.primeraappweb.webapp.services.PersonaService;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    // la clase model se usa para transferir objetos del controlador a la vista

    //mostrar con la API endpoinds
    // @GetMapping("/")
    // public List<Persona> getAllPerson() {
    //     List<Persona> personas = personaService.obtenerTodas();
    //     return personas;
    // }

    @GetMapping("/")
    public List<Persona> getAllPerson() {
        List<Persona> personas = personaService.obtenerTodas();
        return personas;
    }
    

    //mostrar con thymeleaf
    

    // @GetMapping("/")
    // public List<String> getAllPersons() {
    //      // Crear una lista de cadenas
    //      List<String> data = new ArrayList<>();
    //      // Agregar elementos a la lista
    //      data.add("Jose");
    //      data.add("Julion");
    //      // Devolver la lista
    //      return data;
    // }

    // create :smiley:
    @PostMapping("/")
    public Persona createPerson(@RequestBody Persona persona) {
        try {
            Persona result = personaService.crearPersona(persona);
            return result;
        } catch (Exception e) {
            return null;
        }
    }
    // delete person
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personaService.eliminarPersona(id);
    }

}
