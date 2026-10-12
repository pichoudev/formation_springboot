package com.devspring.applearn.repository;

import com.devspring.applearn.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long>{

}