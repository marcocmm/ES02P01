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
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoacaoTest {

    @Test
    public void testInsertDoacao() {
        DoacaoDAO doacaoDAO = new DoacaoDAO();
        Doacao doacao = new Doacao();
        doacao.setData(new Date());
        doacao.setNomeHospital("Hospital Teste1");
        doacao.setNomeRespCad("João da Silva");
        doacao.setProcedimento(Procedimento.COLETA_CONVENCIONAL);
        doacao.setTipoDoacao(TipoDoacao.ESPONTANEA);

        DoadorDAO doadorDAO = new DoadorDAO();
        Doador doador = doadorDAO.obterByNumeroDocumento("123.456.789-10");
        doacao.setDoador(doador);

        Triagem triagem = new Triagem();
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
            Assert.fail();
        }

        doacao = new Doacao();

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
            Assert.fail();
        }

    }

    @Test
    public void testListaDoacoes() {
        List<Doacao> doacaos = DoacaoBO.getTodasDoacoes("123.456.789-10");

        for (Doacao doacao : doacaos) {
            System.out.println("Doacao: " + doacao.getCodDoacao());
        }
        Assert.assertTrue(doacaos != null);
    }

    @Test
    public void testObterDoacao() {
        DoacaoDAO doacaoDAO = new DoacaoDAO();
        Doacao doacao = doacaoDAO.obter(151);
        Assert.assertTrue(doacao != null);
    }
}
