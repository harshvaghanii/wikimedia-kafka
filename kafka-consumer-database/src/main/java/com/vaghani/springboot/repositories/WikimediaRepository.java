package com.vaghani.springboot.repositories;

import com.vaghani.springboot.entities.Wikimedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WikimediaRepository extends JpaRepository<Wikimedia, Long> {
}
