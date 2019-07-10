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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlinhamento(Alinhamento alinhamento) {
        this.alinhamento = alinhamento;
    }

    public void setHitpoints(Integer hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void setCarisma(Integer carisma) {
        this.carisma = carisma;
    }

    public void setConstituicao(Integer constituicao) {
        this.constituicao = constituicao;
    }

    public void setDestreza(Integer destreza) {
        this.destreza = destreza;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public void setIniciativa(Integer iniciativa) {
        this.iniciativa = iniciativa;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }
}
