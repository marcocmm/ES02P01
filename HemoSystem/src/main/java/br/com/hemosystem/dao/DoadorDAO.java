package br.com.hemosystem.dao;

import br.com.hemosystem.model.doacao.Doador;
import javax.persistence.Query;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoadorDAO extends GenericDAO<Doador>{

    public DoadorDAO(){
        super(Doador.class);
    }
    
    public Doador obter(String nome) {
        Query q = entityManager.createQuery("SELECT d FROM Doador d WHERE d.nomeDoador = :nome");
        q.setParameter("nome", nome);
        return (Doador) q.getSingleResult();
    }
    
    public Doador obterByNumeroDocumento(String numDoc) {
        Query q = entityManager.createQuery("SELECT d FROM Doador d WHERE d.numDocumento = :numDoc");
        q.setParameter("numDoc", numDoc);
        return (Doador) q.getSingleResult();
    }
    
}
