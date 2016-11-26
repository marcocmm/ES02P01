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
public enum Procedimento {
    COLETA_CONVENCIONAL("Coleta Convencional"), AFERESE("Aferese");
    
     private String value;

    private Procedimento(String val) {
        this.value = val;
    }

    public String getProcedimento() {
        return value;
    }
}
