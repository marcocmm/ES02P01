package br.com.hemosystem.dao;

import br.com.hemosystem.model.endereco.Cidade;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class CidadeDAO extends GenericDAO<Cidade> {

    public CidadeDAO() {
        super(Cidade.class);
    }
    
    public Cidade obter(String nome, String sigla) {
        Cidade c = null;
        Query q = entityManager.createQuery("SELECT c FROM Cidade c WHERE c.nome = :nome");
        q.setParameter("nome", nome);
//        q.setParameter("sigla", sigla);
        c = (Cidade) q.getSingleResult();
        return c;
    }
    
    public List<Cidade> listaCidadeByEstado(String sigla){
        Query q = entityManager.createQuery("SELECT c FROM Cidade c, Estado e WHERE e.uf = :sigla AND c.estado = e.id");
        q.setParameter("sigla", sigla);
        return (List<Cidade>) q.getResultList();
    }

}
