package com.trial.chaos.personagem.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trial.chaos.atributos.model.Atributos;
import com.trial.chaos.atributos.service.AtributosService;
import com.trial.chaos.personagem.dto.PersonagemDTO;
import com.trial.chaos.personagem.form.PersonagemForm;
import com.trial.chaos.personagem.model.Personagem;
import com.trial.chaos.personagem.repository.PersonagemRepository;
import com.trial.chaos.usuario.service.UsuarioService;

@Service
public class PersonagemService {

	@Autowired
	public PersonagemRepository personagemRepository;
	
	@Autowired
	public UsuarioService usuarioService;
	
	@Autowired
	public AtributosService atributosService;
	
	public ResponseEntity<List<PersonagemDTO>> listarTodosPersonagensOrdenadosPeloNivel() {
		return ResponseEntity.ok(PersonagemDTO.converterDTO(this.personagemRepository.findAll())
				.stream()
				.sorted(Comparator.comparing(PersonagemDTO::getNivel).reversed())
				.collect(Collectors.toList()));
	}
	
	public ResponseEntity<List<PersonagemDTO>> listarPersonagensDoUsuario(Long usuarioId) {
		return ResponseEntity.ok(PersonagemDTO.converterDTO(this.personagemRepository.findByUsuario_Id(usuarioId)));
	}
	
	public ResponseEntity<PersonagemDTO> listarPersonagemSelecionado(Long personagemId) {
		return ResponseEntity.ok(new PersonagemDTO(buscarPersonagem(personagemId)));
	}
	
	public ResponseEntity<PersonagemDTO> cadastrarPersonagem(PersonagemForm form) {
		Atributos atributos = atributosService.cadastroDeAtributo(form.getAtributos().converterAtributos(new Atributos()));
		if(form.getClasse().getValor().equals("A")) {
			this.personagemRepository.save(form.converterA(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("B")) {
			this.personagemRepository.save(form.converterB(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("C")) {
			this.personagemRepository.save(form.converterC(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("D")) {
			this.personagemRepository.save(form.converterD(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("E")) {
			this.personagemRepository.save(form.converterE(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("F")) {
			this.personagemRepository.save(form.converterF(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("G")) {
			this.personagemRepository.save(form.converterG(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("H")) {
			this.personagemRepository.save(form.converterH(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("I")) {
			this.personagemRepository.save(form.converterI(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("J")) {
			this.personagemRepository.save(form.converterJ(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("K")) {
			this.personagemRepository.save(form.converterK(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else if(form.getClasse().getValor().equals("L")) {
			this.personagemRepository.save(form.converterL(new Personagem(), usuarioService.buscarUsuario(form.getUsuario()), atributos));
		} else ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	public ResponseEntity<PersonagemDTO> uparPersonagem(PersonagemForm form, Long personagemId) {
		Personagem personagem = this.buscarPersonagem(personagemId);
		Atributos atributos = atributosService.uparAtributos(form.getAtributos()
				.upar(this.atributosService.buscarAtributos(personagem.getAtributos().getId())));
		if(form.getClasse().getValor().equals("A")) {
			this.personagemRepository.save(form.uparA(personagem, atributos));
		} else if(form.getClasse().getValor().equals("B")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("C")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("D")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("E")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("F")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("G")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("H")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("I")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("J")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("K")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else if(form.getClasse().getValor().equals("L")) {
			this.personagemRepository.save(form.uparB(personagem, atributos));
		} else ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	public Personagem buscarPersonagem(Long id) {
		Optional<Personagem> personagem = this.personagemRepository.findById(id);
		if(!personagem.isPresent()) {}
		return personagem.get();
	}
	
}
