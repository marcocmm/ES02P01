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
public enum TipoDocumento {

    SSP, MT, PRF, OAB, CRM, CREA, CNH, CPF;

    public static TipoDocumento setTipoDocumento(String tipoDocumento) {
        switch (tipoDocumento) {
            case "ssp":
                return TipoDocumento.SSP;
            case "mt":
                return TipoDocumento.MT;
            case "prf":
                return TipoDocumento.PRF;
            case "oab":
                return TipoDocumento.OAB;
            case "crm":
                return TipoDocumento.CRM;
            case "crea":
                return TipoDocumento.CREA;
            case "cnh":
                return TipoDocumento.CNH;
            case "cpf":
                return TipoDocumento.CPF;
            default:
                return null;
        }
    }

}
