package br.com.hemosystem.dao;

import static br.com.hemosystem.dao.GenericDAO.entityManager;
import br.com.hemosystem.model.endereco.Cidade;
import br.com.hemosystem.model.endereco.Estado;
import javax.persistence.Query;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class EstadoDAO extends GenericDAO<Estado> {

    public EstadoDAO() {
        super(Estado.class);
    }

    public Estado obter(String sigla) {
        Estado c = null;
        Query q = entityManager.createQuery("SELECT e FROM Estado e WHERE e.uf = :sigla");
        q.setParameter("sigla", sigla);
        c = (Estado) q.getSingleResult();
        return c;
    }

}
