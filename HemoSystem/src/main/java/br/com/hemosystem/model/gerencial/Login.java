package br.com.hemosystem.model.gerencial;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
@Entity
public class Login implements Serializable {
    
    @Id
    @Column(unique = true, nullable = false)
    private String login;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private TipoLogin tipoLogin;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoLogin getTipoLogin() {
        return tipoLogin;
    }

    public void setTipoLogin(TipoLogin tipoLogin) {
        this.tipoLogin = tipoLogin;
    }

}
