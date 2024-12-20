package com.example.agenziaSpring.Converter;

import com.example.agenziaSpring.DTO.AnnessoDTO;
import com.example.agenziaSpring.Entity.Annesso;

public class AnnessoConverter {

    public static AnnessoDTO toDTOnotImmobile(Annesso obj){
        AnnessoDTO objDTO = new AnnessoDTO();
        objDTO.setId(obj.getId());
        objDTO.setSuperficie(obj.getSuperficie());
        objDTO.setTipo(obj.getTipo());
        return objDTO;
    }

    public static AnnessoDTO toDTO(Annesso obj){
        AnnessoDTO objDTO = new AnnessoDTO();
        objDTO.setId(obj.getId());
        objDTO.setSuperficie(obj.getSuperficie());
        objDTO.setTipo(obj.getTipo());
        objDTO.setImmobile(ImmobileConverter.toDTOnotAnnessi(obj.getImmobile()));
        return objDTO;
    }
}
