package com.ava.nivel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ava.nivel.model.NivelModel;

public interface NivelRepository extends JpaRepository<NivelModel, Integer> {

    Optional<NivelModel> findById(int id);

}
