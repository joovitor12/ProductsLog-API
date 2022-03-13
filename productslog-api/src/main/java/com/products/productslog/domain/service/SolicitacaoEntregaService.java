package com.products.productslog.domain.service;

import java.time.OffsetDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.products.productslog.domain.exception.DomainException;
import com.products.productslog.domain.model.Cliente;
import com.products.productslog.domain.model.Entrega;
import com.products.productslog.domain.model.StatusEntrega;
import com.products.productslog.domain.repository.ClienteRepository;
import com.products.productslog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {
	private CrudClienteService crudClienteService;
	private EntregaRepository entregaRepository;

	
	
	@Transactional
	public Entrega solicitar(Entrega entrega) {
		//regras de negocio entrariam aqui
		Cliente cliente = crudClienteService.buscar(entrega.getCliente().getId());
		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(OffsetDateTime.now());
		
		return entregaRepository.save(entrega);
	}
}
