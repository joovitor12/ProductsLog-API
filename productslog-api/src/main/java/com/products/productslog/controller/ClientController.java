package com.products.productslog.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.productslog.domain.model.Client;


@RestController
public class ClientController {
	@GetMapping("/clientes")
	public List<Client> list() {
		Client client1 = new Client();
		client1.setId(1L);
		client1.setName("Batman");
		client1.setPhone("33333333");
		client1.setEmail("batmail@gmail.com");
		
		
		Client client2 = new Client();
		client2.setId(1L);
		client2.setName("Sup");
		client2.setPhone("33333333");
		client2.setEmail("sup@gmail.com");
		return Arrays.asList(client1, client2);
	}
}
