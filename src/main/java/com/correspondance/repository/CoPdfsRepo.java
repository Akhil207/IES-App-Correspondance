package com.correspondance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correspondance.entities.COPDFS;

public interface CoPdfsRepo extends JpaRepository<COPDFS, Serializable>{

}
