package com.example.agenziaSpring.Repository;

import com.example.agenziaSpring.Entity.Annesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnessoRepository extends JpaRepository<Annesso, Integer> {
}
