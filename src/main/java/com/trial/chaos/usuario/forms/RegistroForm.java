package com.trial.chaos.usuario.forms;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.trial.chaos.usuario.model.Usuario;

import lombok.Getter;

@Getter
public class RegistroForm {

	@NotBlank(message = "Nome nao deve estar vazio")
	@Size(max = 40)
	private String nome;
	
	@NotBlank(message = "Email nao deve estar vazio")
	@Size(max = 100)
	private String email;
	
	@NotBlank(message = "Senha nao deve estar vazio")
	@Size(max = 30, min = 8)
	private String senha;
	
	@NotBlank(message = "Senha nao deve estar vazio")
	@Size(max = 30, min = 8)
	private String senhaConfirmar;
	
	public Usuario converterRegistroForm(Usuario usuario) {
		usuario.setNome(this.nome.trim());
		usuario.setEmail(this.email.trim());
		usuario.setSenha(this.senha.trim());
		return usuario;
	}
	
}
