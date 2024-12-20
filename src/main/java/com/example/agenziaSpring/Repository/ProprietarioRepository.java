package com.example.agenziaSpring.Repository;

import com.example.agenziaSpring.Entity.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Integer> {

}
