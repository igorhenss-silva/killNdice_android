package com.igorhenss.killNdice.domain;

import com.igorhenss.killNdice.enums.Alinhamento;

public class Entidade {

    String nome;

    Alinhamento alinhamento;
    Integer hitpoints;

    Integer carisma;
    Integer constituicao;
    Integer destreza;
    Integer forca;
    Integer iniciativa;
    Integer inteligencia;

    // SETTERS

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setAlinhamento(Alinhamento alinhamento) {
        this.alinhamento = alinhamento;
    }

    protected void setHitpoints(Integer hitpoints) {
        this.hitpoints = hitpoints;
    }

    protected void setCarisma(Integer carisma) {
        this.carisma = carisma;
    }

    protected void setConstituicao(Integer constituicao) {
        this.constituicao = constituicao;
    }

    protected void setDestreza(Integer destreza) {
        this.destreza = destreza;
    }

    protected void setForca(Integer forca) {
        this.forca = forca;
    }

    protected void setIniciativa(Integer iniciativa) {
        this.iniciativa = iniciativa;
    }

    protected void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

}
