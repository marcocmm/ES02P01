package br.com.hemosystem.model.doador;

import br.com.hemosystem.model.doacao.Doacao;
import br.com.hemosystem.model.endereco.Endereco;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 * @version 1.0
 */
@Entity
public class Doador implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codDoador;
    private String nomeDoador;
    private String nomePai;
    private String nomeMae;
    private Sexo sexo;
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    private String profissao;
    private String escolaridade;
    private String email;
    private String telefone;
    
    private Endereco enderecoComercial;
    private Endereco enderecoResidencial;
    private EstadoCivil estadoCivil;
    private String trabalhoAtual;
    @Column(unique = true)
    private String numDocumento;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doador")
    private List<Doacao> doacoes;
    
    private Doacao ultimaDoacao;

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEnderecoComercial() {
        return enderecoComercial;
    }

    public void setEnderecoComercial(Endereco enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTrabalhoAtual() {
        return trabalhoAtual;
    }

    public void setTrabalhoAtual(String trabalhoAtual) {
        this.trabalhoAtual = trabalhoAtual;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public int getCodDoador() {
        return codDoador;
    }


    public Collection<Doacao> getDoacoes() {
        return doacoes;
    }

    public void setDoacoes(List<Doacao> doacoes) {
        this.doacoes = doacoes;
    }

    public Doacao getUltimaDoacao() {
        return ultimaDoacao;
    }

    public void setUltimaDoacao(Doacao ultimaDoacao) {
        this.ultimaDoacao = ultimaDoacao;
    }

}
