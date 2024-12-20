package com.example.agenziaSpring.DTO;

import com.example.agenziaSpring.Entity.Annesso;
import com.example.agenziaSpring.Entity.Proprietario;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImmobileDTO {
    private String id;
    private String tipo;
    private Integer vani;
    private Integer costo;
    private Integer superficie;
    private Integer anno;
    private ProprietarioDTO proprietario;
    private List<AnnessoDTO> annessi;

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
    public ProprietarioDTO getProprietario() {
        return proprietario;
    }
    public void setProprietario(ProprietarioDTO proprietario) {
        this.proprietario = proprietario;
    }
    public List<AnnessoDTO> getAnnessi() {
        return annessi;
    }
    public void setAnnessi(List<AnnessoDTO> annessi) {
        this.annessi = annessi;
    }
}
