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
public enum EstadoCivil {

    SOLTEIRO, CASADO, DIVORCIADO, VIÚVO, SEPARADO, COMPANHEIRO;

    public static EstadoCivil setEstadoCivil(String estadoCivil) {
        switch (estadoCivil) {
            case "solteiro":
                return EstadoCivil.SOLTEIRO;
            case "casado":
                return EstadoCivil.CASADO;
            case "divorciado":
                return EstadoCivil.DIVORCIADO;
            case "viuvo":
                return EstadoCivil.VIÚVO;
            case "separado":
                return EstadoCivil.SEPARADO;
            case "companheiro":
                return EstadoCivil.COMPANHEIRO;
            default:
                return null;
        }
    }
}
