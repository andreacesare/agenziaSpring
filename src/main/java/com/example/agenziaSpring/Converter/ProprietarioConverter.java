package com.example.agenziaSpring.Converter;

import com.example.agenziaSpring.DTO.ProprietarioDTO;
import com.example.agenziaSpring.Entity.Proprietario;

public class ProprietarioConverter {

    public static ProprietarioDTO toDTOnotImmobili(Proprietario proprietario) {
        ProprietarioDTO dto = new ProprietarioDTO();
        dto.setId(proprietario.getId());
        dto.setNome(proprietario.getNome());
        dto.setCognome(proprietario.getCognome());
        return dto;
    }

    public static ProprietarioDTO toDTO(Proprietario proprietario) {
        ProprietarioDTO dto = new ProprietarioDTO();
        dto.setId(proprietario.getId());
        dto.setNome(proprietario.getNome());
        dto.setCognome(proprietario.getCognome());
        dto.setImmobili(proprietario.getImmobili().stream().map(ImmobileConverter::toDTOnotProp).toList());
        return dto;
    }
}
