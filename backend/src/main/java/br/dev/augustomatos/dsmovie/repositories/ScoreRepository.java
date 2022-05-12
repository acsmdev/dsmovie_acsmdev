package br.dev.augustomatos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.augustomatos.dsmovie.entities.Score;
import br.dev.augustomatos.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
