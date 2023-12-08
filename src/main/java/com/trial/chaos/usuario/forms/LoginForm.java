package com.trial.chaos.usuario.forms;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;

@Getter
public class LoginForm {

	@NotBlank(message = "Nome nao deve estar vazio")
	@Size(max = 40)
	private String nome;
	
	@NotBlank(message = "Senha nao deve estar vazio")
	@Size(max = 30)
	private String senha;
	
}
