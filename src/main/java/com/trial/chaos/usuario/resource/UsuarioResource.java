package com.trial.chaos.usuario.resource;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trial.chaos.usuario.dto.UsuarioDTO;
import com.trial.chaos.usuario.forms.RegistroForm;
import com.trial.chaos.usuario.model.Usuario;
import com.trial.chaos.usuario.service.UsuarioService;

@Resource
@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> listarUsuarios() {
		return this.usuarioService.listarUsuarios();
	}
	
	@GetMapping("/logar")
	public ResponseEntity<UsuarioDTO> listarUsuario(
			@RequestParam String loginNome,
			@RequestParam String loginSenha
			) {
		return this.usuarioService.listarUsuario(loginNome, loginSenha);
	}
	
	@Transactional
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> cadastrarUsuario(
			@RequestBody @Valid RegistroForm registroForm
			) {
		return this.usuarioService.cadastrarUsuario(registroForm);
	}
	
}
