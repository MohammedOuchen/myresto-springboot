package com.myresto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myresto.domaine.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {


}
