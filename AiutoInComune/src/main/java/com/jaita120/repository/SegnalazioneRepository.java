package com.jaita120.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaita120.entities.Segnalazione;

@Repository
public interface SegnalazioneRepository extends JpaRepository<Segnalazione,Integer> {

}
