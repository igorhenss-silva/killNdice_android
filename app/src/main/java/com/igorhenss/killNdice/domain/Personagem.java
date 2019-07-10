package com.igorhenss.killNdice.domain;

import com.igorhenss.killNdice.enums.Alinhamento;
import com.igorhenss.killNdice.enums.Classe;
import com.igorhenss.killNdice.enums.Profissao;
import com.igorhenss.killNdice.enums.Raca;

public class Personagem extends Entidade {

    Raca raca;
    Classe classe;
    Profissao profissao;

    public Personagem() { }

    public void atributosBasicos(String nome, Alinhamento alinhamento,
                                 Integer hitpoints) {
        setNome(nome);
        setAlinhamento(alinhamento);
        setHitpoints(hitpoints);
    }

    public void atributosGerais(Integer carisma, Integer constituicao,
                                Integer destreza, Integer forca,
                                Integer iniciativa, Integer inteligencia) {
        setCarisma(carisma);
        setConstituicao(constituicao);
        setDestreza(destreza);
        setForca(forca);
        setIniciativa(iniciativa);
        setInteligencia(inteligencia);
    }

    public void atributosDePersonagem(Raca raca, Classe classe,
                                      Profissao profissao) {
        setRaca(raca);
        setClasse(classe);
        setProfissao(profissao);
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
