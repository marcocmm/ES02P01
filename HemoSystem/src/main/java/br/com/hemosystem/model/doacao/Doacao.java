/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.model.doacao;

import br.com.hemosystem.model.doador.Doador;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
@Entity
public class Doacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codDoacao;
    private TipoDoacao tipoDoacao;
    private String nomeHospital;
    private Procedimento procedimento;
    private String nomeRespCad;
    @Temporal(TemporalType.DATE)
    private Date data;
    private Triagem triagem;

    @JoinColumn(referencedColumnName = "codDoador")
    @ManyToOne(optional = false)
    private Doador doador;

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public Triagem getTriagem() {
        return triagem;
    }

    public void setTriagem(Triagem triagem) {
        this.triagem = triagem;
    }

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

    public int getCodDoacao() {
        return codDoacao;
    }

}
