package com.tcs;
import com.tcs.repository.controller.PersonaController;
import com.tcs.service.PersonaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(PersonaController.class)
public class TestControllerUnitTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    PersonaService personaService;

    @Test
    public void getAllApplications() throws Exception {
     mockMvc.perform(get("/tcs/personas")).andExpect(status().isOk());

     verify(personaService,times(1)).listaPersona();

        }
}
