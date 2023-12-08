package com.trial.chaos.personagem.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.trial.chaos.atributos.model.Atributos;
import com.trial.chaos.personagem.enuns.ClassesEnum;
import com.trial.chaos.usuario.model.Usuario;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "private", name = "personagens")
public class Personagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Enumerated(value = EnumType.STRING)
	private ClassesEnum classe;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	private Long vida;
	
	private Long stamina;
	
	private Long mana;
	
	private Long sanidade;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "atributos_id",
	referencedColumnName = "id")
	private Atributos atributos;
	
	private Long nivel;
	
}
