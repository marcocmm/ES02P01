package br.com.hemosystem.dao;

import br.com.hemosystem.model.endereco.Municipio;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class MunicipioDAO extends GenericDAO<Municipio>{
    
    public MunicipioDAO(){
        super(Municipio.class);
    }
    
    public Municipio obter(String nome) {
        entityManager.clear();
        return (Municipio) entityManager.createQuery("SELECT e FROM Municipio e WHERE e.nome := nome").setParameter("nome", nome).getSingleResult();
    }

}
