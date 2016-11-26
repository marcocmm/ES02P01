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
public enum TipoDoacao {

    ESPONTANEA("Expontanea"), CONVOCADA("Convocada"), REPOSICAO("Reposição"), AUTOLOGA("Autologa");

    private String val;

    private TipoDoacao(String val) {
        this.val = val;
    }

    public String getTipoDoacao() {
        return val;
    }

}
