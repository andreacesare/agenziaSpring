package com.example.agenziaSpring.DTO;

import com.example.agenziaSpring.Entity.Immobile;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class ProprietarioDTO {

    private String id;
    private String nome;
    private String cognome;
    private List<ImmobileDTO> immobili;

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
    public List<ImmobileDTO> getImmobili() {
        return immobili;
    }
    public void setImmobili(List<ImmobileDTO> immobili) {
        this.immobili = immobili;
    }
    public String toString(){
        return id + "\t " + nome + "\t " + cognome;
    }
}
