/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.model.doador;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public enum EstadoCivil {

    SOLTEIRO("Solteiro"), CASADO("Casado"), DIVORCIADO("Divorciado"), VIUVO("Viúvo"), SEPARADO("Separado"), COMPANHEIRO("Companheiro");
    
     private String value;

    private EstadoCivil(String val) {
        this.value = val;
    }

    public String getEstadoCivil() {
        return value;
    }

    public static EstadoCivil setEstadoCivil(String estadoCivil) {
        switch (estadoCivil) {
            case "solteiro":
                return EstadoCivil.SOLTEIRO;
            case "casado":
                return EstadoCivil.CASADO;
            case "divorciado":
                return EstadoCivil.DIVORCIADO;
            case "viuvo":
                return EstadoCivil.VIUVO;
            case "separado":
                return EstadoCivil.SEPARADO;
            case "companheiro":
                return EstadoCivil.COMPANHEIRO;
            default:
                return null;
        }
    }
}
