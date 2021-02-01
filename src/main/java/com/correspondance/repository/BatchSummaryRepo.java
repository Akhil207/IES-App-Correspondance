package com.correspondance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correspondance.entities.BatchSummary;

public interface BatchSummaryRepo extends JpaRepository<BatchSummary, Serializable>{

}
