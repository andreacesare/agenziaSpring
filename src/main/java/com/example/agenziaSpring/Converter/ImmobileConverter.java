package com.example.agenziaSpring.Converter;

import com.example.agenziaSpring.DTO.ImmobileDTO;
import com.example.agenziaSpring.Entity.Immobile;

public class ImmobileConverter {

    public static ImmobileDTO toDTO(Immobile immobile) {
        ImmobileDTO immobileDTO = new ImmobileDTO();
        immobileDTO.setId(immobile.getId());
        immobileDTO.setAnno(immobile.getAnno());
        immobileDTO.setCosto(immobile.getCosto());
        immobileDTO.setTipo(immobile.getTipo());
        immobileDTO.setSuperficie(immobile.getSuperficie());
        immobileDTO.setVani(immobile.getVani());
        immobileDTO.setProprietario(ProprietarioConverter.toDTOnotImmobili(immobile.getProprietario()));
        immobileDTO.setAnnessi(immobile.getAnnessi().stream().map(AnnessoConverter::toDTOnotImmobile).toList());
        return immobileDTO;
    }

    public static ImmobileDTO toDTOnotProp(Immobile immobile) {
        ImmobileDTO immobileDTO = new ImmobileDTO();
        immobileDTO.setId(immobile.getId());
        immobileDTO.setAnno(immobile.getAnno());
        immobileDTO.setCosto(immobile.getCosto());
        immobileDTO.setTipo(immobile.getTipo());
        immobileDTO.setSuperficie(immobile.getSuperficie());
        immobileDTO.setVani(immobile.getVani());
        immobileDTO.setAnnessi(immobile.getAnnessi().stream().map(AnnessoConverter::toDTOnotImmobile).toList());
        return immobileDTO;

    }

    public static ImmobileDTO toDTOnotAnnessi(Immobile immobile) {
        ImmobileDTO immobileDTO = new ImmobileDTO();
        immobileDTO.setId(immobile.getId());
        immobileDTO.setAnno(immobile.getAnno());
        immobileDTO.setCosto(immobile.getCosto());
        immobileDTO.setTipo(immobile.getTipo());
        immobileDTO.setSuperficie(immobile.getSuperficie());
        immobileDTO.setVani(immobile.getVani());
        immobile.setProprietario(immobile.getProprietario());
        return immobileDTO;

    }
}
