package com.trial.chaos.usuario.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.trial.chaos.usuario.model.Usuario;

import lombok.Getter;

@Getter
public class UsuarioDTO {

	private Long id;
	
	private String nome;
	
	private String email;
	
	private String senha;
	
	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.senha = usuario.getSenha();
	}
	
	public static List<UsuarioDTO> converterDTO(List<Usuario> usuarios) {
		return usuarios.stream()
				.map(UsuarioDTO::new)
				.collect(Collectors.toList());
	}
	
}
