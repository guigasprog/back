package com.trial.chaos.personagem.enuns;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ClassesEnum {

	Assassino("A", "Assasino"),
	Barbaro("B", "Barbaro"),
	Bardo("C", "Bardo"),
	Bruxo("D", "Bruxo"),
	Clerico("E", "Clerico"),
	Druida("F", "Druida"),
	Feiticeiro("G", "Feiticeiro"),
	Guardiao("H", "Guardiao"),
	Guerreiro("I", "Guerreiro"),
	Ladino("J", "Ladino"),
	Mago("K", "Mago"),
	Monge("L", "Monge");
	
	private final String valor;
	
	private final String descricao;
	
	
}
