/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hemosystem.model.doacao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
@Entity
class Triagem implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idTriagem;
    private float peso;
    private String hematocrito;
    private String hemoglobina;
    private float pulso;
    private float temperatura;
    private int pressaoArterial;
    private boolean aptidao;
    private Reacoes reacoes;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getHematocrito() {
        return hematocrito;
    }

    public void setHematocrito(String hematocrito) {
        this.hematocrito = hematocrito;
    }

    public String getHemoglobina() {
        return hemoglobina;
    }

    public void setHemoglobina(String hemoglobina) {
        this.hemoglobina = hemoglobina;
    }

    public float getPulso() {
        return pulso;
    }

    public void setPulso(float pulso) {
        this.pulso = pulso;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public int getPressaoArterial() {
        return pressaoArterial;
    }

    public void setPressaoArterial(int pressaoArterial) {
        this.pressaoArterial = pressaoArterial;
    }

    public boolean isAptidao() {
        return aptidao;
    }

    public void setAptidao(boolean aptidao) {
        this.aptidao = aptidao;
    }

    public Reacoes getReacoes() {
        return reacoes;
    }

    public void setReacoes(Reacoes reacoes) {
        this.reacoes = reacoes;
    }
    
}
