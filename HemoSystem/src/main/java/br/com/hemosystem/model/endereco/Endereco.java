/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hemosystem.model.endereco;

import br.com.hemosystem.model.doacao.Doador;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 * @since 29/10/2016
 * @version 1.0
 */
//@Entity
public class Endereco implements Serializable{
        
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idEndereco;
    private String rua;
    private Cidade municipio;
    private String bairro;
    private String numero;
    
    @JoinColumn(referencedColumnName = "codDoador")
    @OneToOne(optional = false)
    Doador doador;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Cidade getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Cidade municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
