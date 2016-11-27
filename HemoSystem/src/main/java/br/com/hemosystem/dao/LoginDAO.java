package br.com.hemosystem.dao;

import br.com.hemosystem.model.gerencial.Login;
import javax.persistence.Query;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class LoginDAO extends GenericDAO<Login> {

    public LoginDAO() {
        super(Login.class);
    }
    
    /**
     * Retorna um Login dado um ra
     *
     * @param login
     * @return Login usuario
     */
    public Login obter(String login) {
        entityManager.clear();
        return (Login) entityManager.find(Login.class, login);
    }

    public Boolean existsLogin(String login) {
        Login l = obter(login);
        if (l != null) {
            return true;
        }
        return false;
    }

    public String getSenhaLogin(String login) {
        Query q = entityManager.createQuery("SELECT l.senha FROM Login l WHERE l.login = :login");
        q.setParameter("login", login);
        return (String) q.getSingleResult();
    }

    public Login getLogin(String login, String senha) {
        Query q = entityManager.createQuery("SELECT l FROM Login l WHERE l.login = :login AND l.senha = :senha");
        q.setParameter("login", login);
        q.setParameter("senha", senha);
        return (Login) q.getSingleResult();
    }

}
