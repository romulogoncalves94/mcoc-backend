package com.mcoc.marvel.repositories;

import com.mcoc.marvel.domain.Membros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembrosRepository extends JpaRepository<Membros, Integer> {

}
