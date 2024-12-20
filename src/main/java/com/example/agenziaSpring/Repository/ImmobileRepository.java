package com.example.agenziaSpring.Repository;

import com.example.agenziaSpring.Entity.Immobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmobileRepository extends JpaRepository<Immobile, Integer>{
}
