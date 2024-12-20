package com.example.agenziaSpring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Proprietario {
    @Id
    private String id;
    private String nome;
    private String cognome;
    @OneToMany(mappedBy = "idp")
    private List<Immobile> immobili;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public List<Immobile> getImmobili() {
        return immobili;
    }
    public void setImmobili(List<Immobile> immobili) {
        this.immobili = immobili;
    }
    public String toString(){
        return id + "\t " + nome + "\t " + cognome;
    }
}

