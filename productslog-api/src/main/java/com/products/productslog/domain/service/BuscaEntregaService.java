package com.products.productslog.domain.service;

import org.springframework.stereotype.Service;

import com.products.productslog.domain.exception.EntidadeNaoEncontradaException;
import com.products.productslog.domain.model.Entrega;
import com.products.productslog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
		private EntregaRepository entregaRepository;
		
		public Entrega buscar(Long entregaId) {
			return  entregaRepository.findById(entregaId).orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega nao encontrada"));
			
		}
}
