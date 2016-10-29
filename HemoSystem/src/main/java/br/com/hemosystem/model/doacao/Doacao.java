/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hemosystem.model.doacao;

import java.util.Date;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class Doacao {
    
    private TipoDoacao tipoDoacao;
    private String nomeHospital;
    private Procedimento procedimento;
    private String nomeRespCad;
    private Date data;
    private String codDoacao;
    

    public TipoDoacao getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(TipoDoacao tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public String getNomeHospital() {
        return nomeHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public String getNomeRespCad() {
        return nomeRespCad;
    }

    public void setNomeRespCad(String nomeRespCad) {
        this.nomeRespCad = nomeRespCad;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCodDoacao() {
        return codDoacao;
    }

    public void setCodDoacao(String codDoacao) {
        this.codDoacao = codDoacao;
    }

}
