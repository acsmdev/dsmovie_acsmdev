package br.dev.augustomatos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.augustomatos.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
