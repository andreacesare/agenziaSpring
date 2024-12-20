package com.example.agenziaSpring.Service;

import com.example.agenziaSpring.Repository.AnnessoRepository;
import org.springframework.stereotype.Service;

@Service
public class AnnessoService {
    private final AnnessoRepository annessoRepository;
    public AnnessoService(AnnessoRepository annessoRepository) {
        this.annessoRepository = annessoRepository;
    }
}
