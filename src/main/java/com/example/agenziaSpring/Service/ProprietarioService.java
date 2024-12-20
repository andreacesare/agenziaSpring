package com.example.agenziaSpring.Service;

import com.example.agenziaSpring.Repository.ProprietarioRepository;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioService {
    private final ProprietarioRepository proprietarioRepository;
    public ProprietarioService(ProprietarioRepository proprietarioRepository) {
        this.proprietarioRepository = proprietarioRepository;
    }


}
