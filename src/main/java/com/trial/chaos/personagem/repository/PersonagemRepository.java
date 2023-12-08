package com.trial.chaos.personagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trial.chaos.personagem.model.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

	List<Personagem> findByUsuario_Id(Long usuarioId);
	
}
