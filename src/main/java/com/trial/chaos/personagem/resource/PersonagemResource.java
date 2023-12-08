package com.trial.chaos.personagem.resource;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trial.chaos.personagem.dto.PersonagemDTO;
import com.trial.chaos.personagem.form.PersonagemForm;
import com.trial.chaos.personagem.service.PersonagemService;

@Resource
@RestController
@RequestMapping("/personagens")
public class PersonagemResource {

	@Autowired
	public PersonagemService personagemService;
	
	@GetMapping
	public ResponseEntity<List<PersonagemDTO>> listarPersonagensComBaseNoNivel() {
		return personagemService.listarTodosPersonagensOrdenadosPeloNivel();
	}
	
	@GetMapping("/{usuarioId}")
	public ResponseEntity<List<PersonagemDTO>> listarPersonagensDoUsuario(@PathVariable Long usuarioId) {
		return personagemService.listarPersonagensDoUsuario(usuarioId);
	}
	
	@GetMapping("/selecionado/{personagemId}")
	public ResponseEntity<PersonagemDTO> listarPersonagemSelecionado(@PathVariable Long personagemId) {
		return personagemService.listarPersonagemSelecionado(personagemId);
	}
	
	@Transactional
	@PostMapping("/cadastrar")
	public ResponseEntity<PersonagemDTO> cadastrarPersonagem(@Valid @RequestBody PersonagemForm personagemForm) {
		return personagemService.cadastrarPersonagem(personagemForm);
	}
	
	@Transactional
	@PostMapping("/upar/{personagemId}")
	public ResponseEntity<PersonagemDTO> uparPersonagem(@Valid @RequestBody PersonagemForm personagemForm,@PathVariable Long personagemId) {
		return personagemService.uparPersonagem(personagemForm, personagemId);
	}
	
	
}
