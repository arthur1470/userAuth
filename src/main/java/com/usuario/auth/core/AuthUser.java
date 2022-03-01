package com.usuario.auth.core;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;

import com.usuario.auth.domain.Usuario;

public class AuthUser extends User {
	private static final long serialVersionUID = 1L;

	private String nome;
	
	public AuthUser(Usuario usuario) {
		super(usuario.getCpf(), usuario.getSenha(), Collections.emptyList());
		
		this.nome = usuario.getNome();
	}

	public String getNome() {
		return nome;
	}
}
