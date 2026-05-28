package com.ava.nivel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "nivel")
public class NivelModel {

    @Id
    private int id;

    private String numero_nivel;
    private String nome_nivel;
    private String pontos_necessarios;
    private String beneficio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_nivel() {
        return numero_nivel;
    }

    public void setNumero_nivel(String numero_nivel) {
        this.numero_nivel = numero_nivel;
    }

    public String getNome_nivel() {
        return nome_nivel;
    }

    public void setNome_nivel(String nome_nivel) {
        this.nome_nivel = nome_nivel;
    }

    public String getPontos_necessarios() {
        return pontos_necessarios;
    }

    public void setPontos_necessarios(String pontos_necessarios) {
        this.pontos_necessarios = pontos_necessarios;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
}
