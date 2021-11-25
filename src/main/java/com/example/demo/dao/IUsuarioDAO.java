package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);
	

}
