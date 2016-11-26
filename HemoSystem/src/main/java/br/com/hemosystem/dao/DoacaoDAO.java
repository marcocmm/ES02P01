package br.com.hemosystem.dao;

import br.com.hemosystem.model.doacao.Doacao;
import br.com.hemosystem.model.doador.Doador;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoacaoDAO extends GenericDAO<Doacao>{
    
    public DoacaoDAO(){
        super(DoacaoDAO.class);
    }
    
    public List<Doacao> listaDoacoes(String numDocDoador){
        Query q = entityManager.createQuery("SELECT d1 FROM Doador d, Doacao d1 WHERE d.numDocumento = :numDocDoador");
        q.setParameter("numDocDoador", numDocDoador);
        
        return (List<Doacao>) q.getResultList();
    }
    
    

}
