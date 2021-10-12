package com.adiel.gerenciador.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adiel.gerenciador.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);
	
}
