package com.example.agenziaSpring.Entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

@Entity
@Table(name="annessi")
public class Annesso {
    @Id
    private String id;
    private String tipo;
    private String superficie;
    @ManyToOne
    @JoinColumn(name="idi")
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
