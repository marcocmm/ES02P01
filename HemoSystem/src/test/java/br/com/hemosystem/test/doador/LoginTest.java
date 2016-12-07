package br.com.hemosystem.test.doador;

import br.com.hemosystem.controller.LoginBO;
import br.com.hemosystem.model.gerencial.Login;
import br.com.hemosystem.model.gerencial.TipoLogin;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class LoginTest {

    @Test
    public void insertLoginGerente() {
        Login login = new Login();
        login.setLogin("lpbaiser");
        login.setSenha("1207");
        login.setTipoLogin(TipoLogin.GERENTE);
        Boolean canDoLogin = LoginBO.canDoLogin(login.getLogin(), login.getSenha());
        if (!canDoLogin) {
            LoginBO.inserirLoginBD(login);
        }
        canDoLogin = LoginBO.canDoLogin(login.getLogin(), login.getSenha());
        Assert.assertTrue(canDoLogin);
    }

    public void insertLoginFuncionario() {
        Login login = new Login();
        login.setLogin("lpbaiser2");
        login.setSenha("1207");
        login.setTipoLogin(TipoLogin.FUNCIONARIO);
        Boolean canDoLogin = LoginBO.canDoLogin(login.getLogin(), login.getSenha());
        if (!canDoLogin) {
            LoginBO.inserirLoginBD(login);
        }
        canDoLogin = LoginBO.canDoLogin(login.getLogin(), login.getSenha());
        Assert.assertTrue(canDoLogin);
    }

    public void testLoginFuncionario() {
        Boolean canDoLogin = LoginBO.canDoLogin("lpbaiser2", "1207");
        if (!canDoLogin) {
            insertLoginFuncionario();
        }
        canDoLogin = LoginBO.canDoLogin("lpbaiser2", "1207");
        Assert.assertTrue(canDoLogin);
    }

    public void loginLoginGerente() {
        Boolean canDoLogin = LoginBO.canDoLogin("lpbaiser", "1207");
        if (!canDoLogin) {
            insertLoginGerente();
        }
        canDoLogin = LoginBO.canDoLogin("lpbaiser", "1207");
        Assert.assertTrue(canDoLogin);
    }

}
