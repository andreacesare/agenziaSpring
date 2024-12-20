package com.example.agenziaSpring.DTO;

import com.example.agenziaSpring.Entity.Immobile;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnnessoDTO {
    private String id;
    private String tipo;
    private String superficie;
    private ImmobileDTO immobile;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getSuperficie() {
        return superficie;
    }
    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }
    public ImmobileDTO getImmobile() {
        return immobile;
    }
    public void setImmobile(ImmobileDTO immobile) {
        this.immobile = immobile;
    }
}
