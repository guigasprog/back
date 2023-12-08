package com.trial.chaos.atributos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "private", name = "atributos")
public class Atributos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long forca;
	
	private Long agilidade;
	
	private Long resistencia;
	
	private Long percepcao;
	
	private Long carisma;
	
	private Long inteligencia;
	
	private Long sorte;
	
	@Column(name = "ponto_livre")
	private Long pontoLivre;
	
}
