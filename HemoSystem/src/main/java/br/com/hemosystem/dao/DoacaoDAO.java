package br.com.hemosystem.dao;

import br.com.hemosystem.model.doacao.Doacao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoacaoDAO extends GenericDAO<Doacao> {

    public DoacaoDAO() {
        super(DoacaoDAO.class);
    }

    public List<Doacao> listaDoacoes(String numDocDoador) {
        Query q = entityManager.createQuery("SELECT d1 FROM Doador d, Doacao d1 WHERE d.numDocumento = :numDocDoador");
        q.setParameter("numDocDoador", numDocDoador);

        return (List<Doacao>) q.getResultList();
    }

    /**
     * 
     * @param idDoacao
     * @return Doacao
     */
    @Override
    public Doacao obter(int idDoacao) {
        Query q = entityManager.createQuery("SELECT d FROM Doacao d WHERE d.codDoacao = :codDoacao");
        q.setParameter("codDoacao", idDoacao);
        Doacao doacao = null;
        try {
            doacao = (Doacao) q.getSingleResult();
            return doacao;
        } catch (Exception ex) {
            return null;
        }
    }

}
