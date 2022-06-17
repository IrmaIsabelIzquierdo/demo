package com.tcs.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.service.PersonaService;

@RestController
@RequestMapping("/tcs")
public class PersonaController {
    @Autowired
    PersonaService personaService;
    @GetMapping("/personas")
    public ResponseEntity<Object> getPersonas() throws Exception{
        return new ResponseEntity<>(personaService.listaPersona(),HttpStatus.OK);
    }




}
    
