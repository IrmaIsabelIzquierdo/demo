package com.tcs;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc  //simula una llamada desde la parte del cliente
class DemoApplicationTests {
	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate; //consume una apirest para el caso de prueba

	@Test
	public void contextLoads() throws Exception{
		ResponseEntity<List> response=
				this.restTemplate.getForEntity("http://localhost:"+port+"/tcs/personas", List.class);
		assert (response.getStatusCode().equals(HttpStatus.OK));
	}
	}


