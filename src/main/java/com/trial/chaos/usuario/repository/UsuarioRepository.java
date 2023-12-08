package com.trial.chaos.usuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trial.chaos.usuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByNomeAndSenha(String nome, String senha);
	
	Optional<Usuario> findByNome(String nome);
	
}
