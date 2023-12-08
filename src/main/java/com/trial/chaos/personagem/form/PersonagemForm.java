package com.trial.chaos.personagem.form;

import java.lang.Math;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.trial.chaos.atributos.form.AtributosForm;
import com.trial.chaos.atributos.model.Atributos;
import com.trial.chaos.personagem.enuns.ClassesEnum;
import com.trial.chaos.personagem.model.Personagem;
import com.trial.chaos.usuario.model.Usuario;

import lombok.Getter;

@Getter
public class PersonagemForm {

	@NotBlank
	@Size(max = 100, message = "Limite ultrapassado")
	private String nome;
	
	@NotNull
	@Enumerated(value = EnumType.STRING)
	private ClassesEnum classe;
	
	@NotNull
	private Long usuario;
	
	@NotNull
	private AtributosForm atributos;
	
	public Personagem converterA(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(80 + atributos.getResistencia());
		personagem.setStamina(50 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(30 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 40L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterB(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(100 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(50 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(10 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 40L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterC(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(65 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(35 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(60 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 40L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterD(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(70 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(10 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(60 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 60L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterE(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(70 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(40 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(60 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 30L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterF(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(80 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(30 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(50 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 40L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterG(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(60 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(20 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(80 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 40L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterH(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(120 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(40 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(0 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 40L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterI(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(90 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(60 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(10 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 40L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterJ(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(50 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(50 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(30 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 70L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterK(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(50 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(0 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(110 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 40L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	public Personagem converterL(Personagem personagem, Usuario usuario, Atributos atributos) {
		personagem.setNome(this.nome);
		personagem.setClasse(this.classe);
		personagem.setUsuario(usuario);
		personagem.setVida(90 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(50 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(50 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(25 + 10L);
		personagem.setAtributos(atributos);
		personagem.setNivel(1L);
		return personagem;
	}
	
	
	// UPAR METODOS
	
	
	public Personagem uparA(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(80 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(50 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(30 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparB(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(100 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(50 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(10 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparC(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(65 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(35 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(60 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparD(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(70 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(10 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(60 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparE(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(70 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(40 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(60 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparF(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(80 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(30 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(50 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparG(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(60 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(20 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(80 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparH(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(120 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(40 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(0 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparI(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(90 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(60 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(10 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparJ(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(50 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(50 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(30 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparK(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(50 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(0 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(110 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
	public Personagem uparL(Personagem personagem, Atributos atributos) {
		personagem.setId(personagem.getId());
		personagem.setNome(personagem.getNome());
		personagem.setClasse(personagem.getClasse());
		personagem.setUsuario(personagem.getUsuario());
		personagem.setVida(90 + Math.round(atributos.getResistencia() * 0.5));
		personagem.setStamina(50 + Math.round(atributos.getForca()*1.5 + atributos.getAgilidade()*2));
		personagem.setMana(50 + Math.round(atributos.getInteligencia()*2 + atributos.getCarisma()*1.5));
		personagem.setSanidade(personagem.getSanidade() + 5L);
		personagem.setAtributos(atributos);
		personagem.setNivel(personagem.getNivel() + 1);
		return personagem;
	}
	
}
