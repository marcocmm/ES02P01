package br.com.hemosystem.test.doador;

import br.com.hemosystem.controller.DoacaoBO;
import br.com.hemosystem.dao.DoacaoDAO;
import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.model.doacao.Doacao;
import br.com.hemosystem.model.doador.Doador;
import br.com.hemosystem.model.doacao.Procedimento;
import br.com.hemosystem.model.doacao.Reacoes;
import br.com.hemosystem.model.doacao.TipoDoacao;
import br.com.hemosystem.model.doacao.Triagem;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoacaoTest {

    Doacao doacao;
    DoacaoDAO doacaoDAO;
    Doador doador;
    DoadorDAO doadorDAO;
    Triagem triagem;

    @Test
    public void testInsertDoacao() {
        doacaoDAO = new DoacaoDAO();
        doadorDAO = new DoadorDAO();

        doacao = new Doacao();
        doador = new Doador();

        doacao.setData(new Date());
        doacao.setNomeHospital("Hospital Teste1");
        doacao.setNomeRespCad("João da Silva");
        doacao.setProcedimento(Procedimento.COLETA_CONVENCIONAL);
        doacao.setTipoDoacao(TipoDoacao.ESPONTANEA);

        doador = doadorDAO.obterByNumeroDocumento("123.456.789-10");

        doacao.setDoador(doador);

        triagem = new Triagem();
        triagem.setAptidao(true);
        triagem.setHematocrito("hematocrito");
        triagem.setHemoglobina("hemoglobina");
        triagem.setPeso(70);
        triagem.setPressaoArterial("12/8");
        triagem.setPulso(8);
        triagem.setReacoes(Reacoes.NENHUMA);
        triagem.setTemperatura((float) 36);

        doacao.setTriagem(triagem);

        doador.setUltimaDoacao(doacao);

        List<Doacao> doacoes = doacaoDAO.listaDoacoes(doador.getNumDocumento());

        doacoes.add(doacao);

        doador.setDoacoes(doacoes);

        try {
            doacaoDAO.insert(doacao);
        } catch (SQLException ex) {
            Logger.getLogger(DoacaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        doacao = new Doacao();
        doador = new Doador();

        doacao.setData(new Date());
        doacao.setNomeHospital("Hospital Teste1");
        doacao.setNomeRespCad("João da Silva");
        doacao.setProcedimento(Procedimento.COLETA_CONVENCIONAL);
        doacao.setTipoDoacao(TipoDoacao.REPOSICAO);

        doador = doadorDAO.obterByNumeroDocumento("123.456.789-10");

        doacao.setDoador(doador);

        triagem = new Triagem();
        triagem.setAptidao(true);
        triagem.setHematocrito("hematocrito");
        triagem.setHemoglobina("hemoglobina");
        triagem.setPeso(70);
        triagem.setPressaoArterial("12/8");
        triagem.setPulso(8);
        triagem.setReacoes(Reacoes.NENHUMA);
        triagem.setTemperatura((float) 36.5);

        doacao.setTriagem(triagem);

        doador.setUltimaDoacao(doacao);

        doacoes = doacaoDAO.listaDoacoes(doador.getNumDocumento());

        doacoes.add(doacao);

        doador.setDoacoes(doacoes);

        try {
            doacaoDAO.insert(doacao);
        } catch (SQLException ex) {
            Logger.getLogger(DoacaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    @Test
    public void testListaDoacoes() {
        doacaoDAO = new DoacaoDAO();

        List<Doacao> doacaos = null;
        doacaos = DoacaoBO.getTodasDoacoes("123.456.789-10");
//        doacaos = doacaoDAO.listaDoacoes("123.456.789-10");
        for (Doacao doacao1 : doacaos) {
            System.out.println("Doacao: " + doacao1.getCodDoacao());
        }
        Assert.assertTrue(doacaos != null);
    }
    
//    @Test
    public void testObterDoacao(){
        doacaoDAO = new DoacaoDAO();
        
        Doacao doacao = null;
        doacao = doacaoDAO.obter(2);
        
        Assert.assertTrue(doacao != null);
        
    }

}
