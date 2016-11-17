package br.com.hemosystem.dao;

import br.com.hemosystem.model.endereco.Cidade;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class MunicipioDAO extends GenericDAO<Cidade>{
    
    public MunicipioDAO(){
        super(Cidade.class);
    }
    
    public Cidade obter(String nome) {
        entityManager.clear();
        return (Cidade) entityManager.createQuery("SELECT e FROM Municipio e WHERE e.nome := nome").setParameter("nome", nome).getSingleResult();
    }

}
