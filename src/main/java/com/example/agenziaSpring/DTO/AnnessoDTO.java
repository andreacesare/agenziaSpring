package com.example.agenziaSpring.DTO;

import com.example.agenziaSpring.Entity.Immobile;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class AnnessoDTO {
    private String id;
    private String tipo;
    private String superficie;
    private Immobile immobile;


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
    public Immobile getImmobile() {
        return immobile;
    }
    public void setImmobile(Immobile immobile) {
        this.immobile = immobile;
    }
}
