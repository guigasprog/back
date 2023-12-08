package com.trial.chaos.usuario.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.trial.chaos.usuario.dto.UsuarioDTO;
import com.trial.chaos.usuario.forms.RegistroForm;
import com.trial.chaos.usuario.model.Usuario;
import com.trial.chaos.usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	public UsuarioRepository usuarioRepository;
	
	public ResponseEntity<List<UsuarioDTO>> listarUsuarios() {
		return ResponseEntity.ok(
					UsuarioDTO.converterDTO(
						this.usuarioRepository.findAll()
					)
				);
	}
	
	public ResponseEntity<UsuarioDTO> listarUsuario(String loginNome, String loginSenha) {
		Optional<Usuario> usuario = this.usuarioRepository.findByNomeAndSenha(loginNome, loginSenha);
		if(!usuario.isPresent()) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.ok(
					new UsuarioDTO(
							usuario.get()
					)
				);
	}
	
	@Transactional
	public ResponseEntity<Usuario> cadastrarUsuario(RegistroForm registroForm) {
		Optional<Usuario> usuario = this.usuarioRepository.findByNome(registroForm.getNome());
		if(!usuario.isPresent()) {
			if(registroForm.getSenha().equals(registroForm.getSenhaConfirmar())) {
				this.usuarioRepository.save(registroForm.converterRegistroForm(new Usuario()));
				return ResponseEntity.status(HttpStatus.CREATED).build();
			}
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
	}

	public Usuario buscarUsuario(Long id) {
		Optional<Usuario> usuario = this.usuarioRepository.findById(id);
		if(!usuario.isPresent()) {
			return null;
		}
		return usuario.get();
	}
	
}
