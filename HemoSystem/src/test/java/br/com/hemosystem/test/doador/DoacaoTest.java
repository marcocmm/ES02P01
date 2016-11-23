package br.com.hemosystem.test.doador;

import br.com.hemosystem.dao.DoacaoDAO;
import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.model.doacao.Doacao;
import br.com.hemosystem.model.doacao.Doador;
import br.com.hemosystem.model.doacao.Procedimento;
import br.com.hemosystem.model.doacao.Reacoes;
import br.com.hemosystem.model.doacao.TipoDoacao;
import br.com.hemosystem.model.doacao.Triagem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    @Test
    public void testInsertDoacao() {
        doacao = new Doacao();
        doador = new Doador();
        doacaoDAO = new DoacaoDAO();
        doadorDAO = new DoadorDAO();

        doacao.setData(new Date());
        doacao.setNomeHospital("Hospital Teste1");
        doacao.setNomeRespCad("Joao da Silva");
        doacao.setProcedimento(Procedimento.COLETA_CONVENCIONAL);
        doacao.setTipoDoacao(TipoDoacao.ESPONTANEA);

        doador = doadorDAO.obter("Leonardo Baiser");

        Triagem triagem = new Triagem();
        triagem.setAptidao(true);
        triagem.setHematocrito("hematocrito");
        triagem.setHemoglobina("hemoglobina");
        triagem.setPeso(70);
        triagem.setPressaoArterial(12);
        triagem.setPulso(8);
        triagem.setReacoes(Reacoes.NENHUMA);
        triagem.setTemperatura(36);

        doador.setUltimaDoacao(triagem);

//        List<Doacao> doacoes = doacaoDAO.listaDoacoes(doador.getNumDocumento());
        List<Doacao> doacoes = new ArrayList<>();

        doacoes.add(doacao);
        
//        doador.setDoacoes(doacoes);
       
        
        try {
            doacaoDAO.insert(doacao);
            doadorDAO.update(doador);
        } catch (SQLException ex) {
            Logger.getLogger(DoacaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}