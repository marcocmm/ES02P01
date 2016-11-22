package br.com.hemosystem.test.doador;

import br.com.hemosystem.dao.CidadeDAO;
import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.model.doacao.Doador;
import br.com.hemosystem.model.doacao.EstadoCivil;
import br.com.hemosystem.model.doacao.Sexo;
import br.com.hemosystem.model.doacao.TipoDocumento;
import br.com.hemosystem.model.endereco.Endereco;
import br.com.hemosystem.tools.CalendarioHelper;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.constraints.AssertTrue;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoadorTest {
    
    Doador doador;
    CidadeDAO cidadeDAO;
    DoadorDAO doadorDAO;
    
//    @Test
    public void testInsertDoador(){
        doador = new Doador();
        cidadeDAO = new CidadeDAO();
        doadorDAO = new DoadorDAO();
        
        doador.setNomeDoador("Leonardo Baiser");
        doador.setNomePai("Aguinaldo Baiser");
        doador.setNomeMae("SIlvana Baiser");
        doador.setDataNasc(CalendarioHelper.parseDate("12-07-1995"));
        doador.setEmail("lpbaiser@gmail.com");
        doador.setEscolaridade("Ensino Médio");
        doador.setEstadoCivil(EstadoCivil.SOLTEIRO);
        doador.setProfissao("Técnico em Informática");
        doador.setSexo(Sexo.MASCULINO);
        doador.setTelefone("44 99478968");
        doador.setTipoDocumento(TipoDocumento.CPF);
        doador.setNumDocumento("123.456.789.10");
        doador.setTrabalhoAtual("Técnico em Informática");
        Endereco enderecoComercial = new Endereco();
        enderecoComercial.setBairro("Centro");
        enderecoComercial.setMunicipio(cidadeDAO.obter("Mamborê", "PR"));
        enderecoComercial.setNumero("620");
        enderecoComercial.setRua("Av. Paulino Ferreira Messias");
        
        doador.setEnderecoComercial(enderecoComercial);
        
        try {
            doadorDAO.insert(doador);
        } catch (Exception ex) {
            Logger.getLogger(DoadorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void testObterDoado(){
        doador = new Doador();
        doadorDAO = new DoadorDAO();
        
        doador = null;
        doador = doadorDAO.obter("Leonardo Baiser");
        
        Assert.assertTrue(doador != null);
        
    }

}
