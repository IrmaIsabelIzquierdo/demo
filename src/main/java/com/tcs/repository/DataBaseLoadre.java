package com.tcs.repository;

import com.tcs.entity.Persona;
import com.tcs.entity.enums.EnumGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class DataBaseLoadre implements ApplicationRunner {
    private final PersonaRepository personaRepository;

    @Autowired
    public DataBaseLoadre(PersonaRepository personaRepository){
        this.personaRepository=personaRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Persona> listaPersonas= Arrays.asList(

                new Persona(1L,"Alex",37, EnumGenero.M,"guamani"),
                new Persona(2L,"Jose",37, EnumGenero.M,"calderon"),
                new Persona(3l,"Irma",35,EnumGenero.F,"conocoto")
                );
        personaRepository.saveAll(listaPersonas);

    }
}
