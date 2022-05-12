package br.dev.augustomatos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.augustomatos.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
