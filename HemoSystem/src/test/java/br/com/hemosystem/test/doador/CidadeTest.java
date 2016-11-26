package br.com.hemosystem.test.doador;

import br.com.hemosystem.dao.CidadeDAO;
import br.com.hemosystem.dao.EstadoDAO;
import br.com.hemosystem.model.endereco.Cidade;
import br.com.hemosystem.model.endereco.Estado;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class CidadeTest {
    
    CidadeDAO cidadeDAO;
    
//    @Test
    public void testObterCidade(){
        cidadeDAO = new CidadeDAO();
        
        Cidade c = new Cidade();
        c = null;
        c = cidadeDAO.obter("Mamborê", "PR");
        
        Assert.assertTrue(c != null);
    }
    
    @Test
    public void testListaCidadeByEstado(){
        cidadeDAO = new CidadeDAO();
//        EstadoDAO estadoDAO = new EstadoDAO();
//        Estado e = estadoDAO.obter("PR");
        List<Cidade> cidades = cidadeDAO.listaCidadeByEstado("PR");
        
        Assert.assertTrue(cidades != null);
    }

}
