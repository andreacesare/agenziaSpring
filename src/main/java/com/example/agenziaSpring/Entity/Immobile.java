package com.example.agenziaSpring.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="immobili")
public class Immobile {
    @Id
    private String id;
    private String tipo;
    private Integer vani;
    private Integer costo;
    private Integer superficie;
    private Integer anno;
    @ManyToOne
    @JoinColumn(name="idp")
    private Proprietario proprietario;
    @OneToMany(mappedBy = "immobile")
    private List<Annesso> annessi;

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
    public Integer getVani() {
        return vani;
    }
    public void setVani(Integer vani) {
        this.vani = vani;
    }
    public Integer getCosto() {
        return costo;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }
    public Integer getSuperficie() {
        return superficie;
    }
    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }
    public Integer getAnno() {
        return anno;
    }
    public void setAnno(Integer anno) {
        this.anno = anno;
    }
    public Proprietario getProprietario() {
        return proprietario;
    }
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String toString(){
        return id+"\t tipo:"+tipo+"\t vani:"+vani+"\t costo:"+costo+"\t suprficie mq:"+superficie+"\t anno:"+anno;
    }

}
