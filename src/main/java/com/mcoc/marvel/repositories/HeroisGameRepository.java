package com.mcoc.marvel.repositories;

import com.mcoc.marvel.domain.HeroisGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroisGameRepository extends JpaRepository<HeroisGame, Integer> {
}
