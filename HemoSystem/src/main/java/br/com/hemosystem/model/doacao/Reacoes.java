/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.model.doacao;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public enum Reacoes {
    NENHUMA("Nenhuma"), LEVE("Leve"), MODERADA("Moderada"), GRAVE("Grave");

    private String value;

    private Reacoes(String val) {
        this.value = val;
    }

    public String getReacao() {
        return value;
    }
}
