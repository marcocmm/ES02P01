package br.com.hemosystem.dao;

import br.com.hemosystem.model.doador.Doador;
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
        Doador doador = null;
        try{
            doador = (Doador) q.getSingleResult();
            return doador;
        }catch (Exception ex){
            return null;
        }
    }
    
    public Doador obterByNumeroDocumento(String numDoc) {
        Query q = entityManager.createQuery("SELECT d FROM Doador d WHERE d.numDocumento = :numDoc");
        q.setParameter("numDoc", numDoc);
        Doador doador = null;
        try{
            doador = (Doador) q.getSingleResult();
            return doador;
        }catch (Exception ex){
            return null;
        }
    }
    
    public Doador getUltimaDoacao(String cpf){
        Query q = entityManager.createQuery("SELECT d FROM Doador d WHERE d.numDocumento = :cpf");
        q.setParameter("cpf", cpf);
        Doador doador = null;
        try{
            doador = (Doador) q.getSingleResult();
            return doador;
        }catch (Exception ex){
            return null;
        }
    }
    
}
