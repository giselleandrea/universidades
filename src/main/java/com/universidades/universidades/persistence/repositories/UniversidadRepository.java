package com.universidades.universidades.persistence.repositories;

import com.universidades.universidades.persistence.entities.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Long> {
}