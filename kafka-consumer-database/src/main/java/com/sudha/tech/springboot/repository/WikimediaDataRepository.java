package com.sudha.tech.springboot.repository;


import com.sudha.tech.springboot.model.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
