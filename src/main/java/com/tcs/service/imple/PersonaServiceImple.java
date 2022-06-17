package com.tcs.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcs.entity.Persona;
import com.tcs.repository.PersonaRepository;
import com.tcs.service.PersonaService;
import org.springframework.stereotype.Service;


@Service
public class  PersonaServiceImple implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Persona> listaPersona() {
        // TODO Auto-generated method stub
        return (List<Persona>)personaRepository.findAll()    ;
    }
   
   
    

    
    
}
