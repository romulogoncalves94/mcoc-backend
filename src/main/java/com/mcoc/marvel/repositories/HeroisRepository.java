package com.mcoc.marvel.repositories;

import com.mcoc.marvel.domain.Herois;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroisRepository extends JpaRepository<Herois, Integer> {
}
