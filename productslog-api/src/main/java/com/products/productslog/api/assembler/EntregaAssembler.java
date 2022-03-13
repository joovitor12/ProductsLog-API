package com.products.productslog.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.products.productslog.api.model.EntregaModel;
import com.products.productslog.api.model.request.EntregaRequest;
import com.products.productslog.domain.model.Entrega;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Component
public class EntregaAssembler {
		private ModelMapper modelMapper;
		public EntregaModel toModel(Entrega entrega) {
			return modelMapper.map(entrega, EntregaModel.class);
		}
		
		public List<EntregaModel> toCollectionModel(List<Entrega> entregas){
			return entregas.stream().map(this::toModel).collect(Collectors.toList());
		}
		public Entrega toEntity(EntregaRequest entregaInput) {
			return modelMapper.map(entregaInput, Entrega.class);
		}
}
