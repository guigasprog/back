package com.trial.chaos.atributos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trial.chaos.atributos.model.Atributos;
import com.trial.chaos.atributos.repository.AtributosRepository;

@Service
public class AtributosService {

	@Autowired
	private AtributosRepository atributosRepository;
	
	public Atributos cadastroDeAtributo(Atributos form) {
		this.atributosRepository.save(form);
		return form;
	}
	
	public Atributos uparAtributos(Atributos form) {
		this.atributosRepository.save(form);
		return form;
	}
	
	public Atributos buscarAtributos(Long atributosId) {
		Optional<Atributos> atributo = this.atributosRepository.findById(atributosId);
		if(!atributo.isPresent()) {}
		return atributo.get();
	}
	
}
