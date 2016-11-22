package br.com.hemosystem.dao;

import br.com.hemosystem.model.endereco.Cidade;
import javax.persistence.NoResultException;
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

}
