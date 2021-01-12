package com.algaworks.rest.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.rest.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setEmail("email@email.com");
		cliente1.setNome("Leonardo");
		cliente1.setTelefone("11-99101-3888");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setEmail("cliente2@email.com");
		cliente2.setNome("Suely");
		cliente2.setTelefone("11-99314-4412");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
