package com.products.productslog.controller;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.productslog.domain.model.Cliente;


@RestController
public class ClientController {
	@PersistenceContext
	private EntityManager manager;
	
	
	@GetMapping("/clientes")
	public List<Cliente> list() {
		return manager.createQuery("from Cliente", Cliente.class).getResultList();
	}
}
