package com.myresto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myresto.domaine.Commande;
import com.myresto.domaine.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
