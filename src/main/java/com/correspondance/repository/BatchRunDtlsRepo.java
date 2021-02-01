package com.correspondance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correspondance.entities.BatchRunDtls;

public interface BatchRunDtlsRepo extends JpaRepository<BatchRunDtls, Serializable>{

}
