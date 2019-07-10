package com.igorhenss.killNdice.domain;

import com.igorhenss.killNdice.enums.Alinhamento;

public class Entidade extends AtributosGerais {

    String nome;
    Alinhamento alinhamento;
    Integer hitpoints;

    public Entidade() { }

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
}
