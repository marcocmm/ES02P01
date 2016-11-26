package br.com.hemosystem.test.doador;

import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.model.doador.Doador;
import br.com.hemosystem.model.doador.EstadoCivil;
import br.com.hemosystem.model.doador.Sexo;
import br.com.hemosystem.model.endereco.Endereco;
import br.com.hemosystem.tools.CalendarioHelper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoadorTest {
    
    Doador doador;
    DoadorDAO doadorDAO;
    
//    @Test
    public void testInsertDoador(){
        doador = new Doador();
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
        doador.setNumDocumento("123.456.789-10");
        doador.setTrabalhoAtual("Técnico em Informática");
        Endereco enderecoComercial = new Endereco();
        enderecoComercial.setBairro("Centro");
        enderecoComercial.setCidade("Mambore");
        enderecoComercial.setNumero("620");
        enderecoComercial.setRua("Av. Paulino Ferreira Messias");
        enderecoComercial.setEstado("PR");
        Endereco enderecoResidencial = new Endereco();
        enderecoResidencial.setBairro("Alto da gloria");
        enderecoResidencial.setCidade("Mambore");
        enderecoResidencial.setEstado("PR");
        enderecoResidencial.setNumero("123");
        enderecoResidencial.setRua("Av. Manoel F. da Silva");
        
        doador.setEnderecoComercial(enderecoComercial);
        doador.setEnderecoResidencial(enderecoResidencial);
        
        try {
            doadorDAO.insert(doador);
        } catch (Exception ex) {
            Logger.getLogger(DoadorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    @Test
    public void testObterDoador(){
        doador = new Doador();
        doadorDAO = new DoadorDAO();
        
        doador = null;
        doador = doadorDAO.obterByNumeroDocumento("123.456.789-10");
        
        Assert.assertTrue(doador != null);
        
    }
//    @Test
    public void testObterDoadorCpf(){
         doador = new Doador();
        doadorDAO = new DoadorDAO();
        
        doador = null;
        doador = doadorDAO.getUltimaDoacao("123.456.789-10");
        
        Assert.assertTrue(doador != null);
    }
    

}
