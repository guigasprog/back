package com.trial.chaos.personagem.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.trial.chaos.atributos.model.Atributos;
import com.trial.chaos.personagem.model.Personagem;
import com.trial.chaos.usuario.dto.UsuarioDTO;

import lombok.Getter;

@Getter
public class PersonagemDTO {

	private Long id;
	
	private String nome;
	
	private String classe;
	
	private UsuarioDTO usuario;
	
	private Long vida;
	
	private Long stamina;
	
	private Long mana;
	
	private Long sanidade;
	
	private Atributos atributos;
	
	private Long nivel;
	
	public PersonagemDTO(Personagem personagem) {
		this.id = personagem.getId();
		this.nome = personagem.getNome();
		this.classe = personagem.getClasse().getDescricao();
		this.usuario = new UsuarioDTO(personagem.getUsuario());
		this.vida = personagem.getVida();
		this.stamina = personagem.getStamina();
		this.mana = personagem.getMana();
		this.sanidade = personagem.getSanidade();
		this.atributos= personagem.getAtributos();
		this.nivel = personagem.getNivel();
	}
	
	public static List<PersonagemDTO> converterDTO(List<Personagem> personagens) {
		return personagens.stream()
				.map(PersonagemDTO::new)
				.collect(Collectors.toList());
	}
	
}
