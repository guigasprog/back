package com.trial.chaos.atributos.form;

import com.trial.chaos.atributos.model.Atributos;

import lombok.Getter;

@Getter
public class AtributosForm {
	
	private Long forca;
	
	private Long agilidade;
	
	private Long resistencia;
	
	private Long percepcao;
	
	private Long carisma;
	
	private Long inteligencia;
	
	private Long sorte;
	
	private Long pontoLivre;
	
	public Atributos converterAtributos(Atributos atributos) {
		atributos.setForca(this.forca);
		atributos.setAgilidade(this.agilidade);
		atributos.setResistencia(this.resistencia);
		atributos.setPercepcao(this.percepcao);
		atributos.setCarisma(this.carisma);
		atributos.setInteligencia(this.inteligencia);
		atributos.setSorte(this.sorte);
		atributos.setPontoLivre(this.pontoLivre);
		return atributos;
	}
	
	public Atributos upar(Atributos atributos) {
		atributos.setForca(atributos.getForca() + this.forca);
		atributos.setAgilidade(atributos.getAgilidade() + this.agilidade);
		atributos.setResistencia(atributos.getResistencia() + this.resistencia);
		atributos.setPercepcao(atributos.getPercepcao() + this.percepcao);
		atributos.setCarisma(atributos.getCarisma() +this.carisma);
		atributos.setInteligencia(atributos.getInteligencia() + this.inteligencia);
		atributos.setSorte(atributos.getSorte() + this.sorte);
		atributos.setPontoLivre(atributos.getPontoLivre() + this.pontoLivre);
		return atributos;
	}
	
}
