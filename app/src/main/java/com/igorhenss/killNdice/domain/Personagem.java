package com.igorhenss.killNdice.domain;

import com.igorhenss.killNdice.enums.Alinhamento;
import com.igorhenss.killNdice.enums.Atributos;
import com.igorhenss.killNdice.enums.Classe;
import com.igorhenss.killNdice.enums.Profissao;
import com.igorhenss.killNdice.enums.Raca;

public class Personagem extends Entidade {

    Raca raca;
    Classe classe;
    Profissao profissao;
    Integer nivel;

    // CONSTRUTORES

    public Personagem() {

    }

    public void atributosBasicos(String nome, Alinhamento alinhamento,
                                 Integer hitpoints) {
        setNome(nome);
        setAlinhamento(alinhamento);
        setHitpoints(hitpoints);
    }

    public void atributosDePersonagem(Raca raca, Classe classe,
                                      Profissao profissao) {
        setRaca(raca);
        setClasse(classe);
        setProfissao(profissao);
        setNivel(0);
    }

    // METODOS

    public void reduzirHitpoints(Integer hitpointsPerdidos) {
        setHitpoints(hitpoints - hitpointsPerdidos);
    }

    public void subirDeNivel() {
        setNivel(nivel + 1);
    }

    public void aumentarPontosNoAtributo(Integer pontosAdicionados, Atributos atributo) {
        if (atributo.equals(Atributos.CARISMA)) {
            setCarisma(carisma + pontosAdicionados);
        } else if (atributo.equals(Atributos.CONSTITUICAO)) {
            setConstituicao(constituicao + pontosAdicionados);
        } else if (atributo.equals(Atributos.DESTREZA)) {
            setDestreza(destreza + pontosAdicionados);
        } else if (atributo.equals(Atributos.FORCA)) {
            setForca(forca + pontosAdicionados);
        } else if (atributo.equals(Atributos.INICIATIVA)) {
            setIniciativa(iniciativa + pontosAdicionados);
        } else if (atributo.equals(Atributos.INTELIGENCIA)) {
            setInteligencia(inteligencia + pontosAdicionados);
        }
    }

    // SETTERS

    private void setRaca(Raca raca) {
        this.raca = raca;
    }

    private void setClasse(Classe classe) {
        this.classe = classe;
    }

    private void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    private void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

}
