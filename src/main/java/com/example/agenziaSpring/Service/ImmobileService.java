package com.example.agenziaSpring.Service;

import com.example.agenziaSpring.Repository.ImmobileRepository;
import org.springframework.stereotype.Service;

@Service
public class ImmobileService {
    private final ImmobileRepository immobileRepository;
    public ImmobileService(ImmobileRepository immobileRepository) {
        this.immobileRepository = immobileRepository;
    }
}
