package br.com.hemosystem.test.doador;

import br.com.hemosystem.controller.LoginBO;
import br.com.hemosystem.dao.LoginDAO;
import br.com.hemosystem.model.gerencial.Login;
import br.com.hemosystem.model.gerencial.TipoLogin;
import org.junit.Test;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class LoginTest {

    @Test
    public void insertLoginGerente() {
        Login login = new Login();
        LoginDAO loginDAO = new LoginDAO();

        login.setLogin("lpbaiser");
        login.setSenha("1207");
        login.setTipoLogin(TipoLogin.GERENTE);
        LoginBO.inserirLoginBD(login);

    }

    @Test
    public void insertLoginFuncionario() {
        Login login = new Login();
        LoginDAO loginDAO = new LoginDAO();

        login.setLogin("lpbaiser2");
        login.setSenha("1207");
        login.setTipoLogin(TipoLogin.FUNCIONARIO);
        LoginBO.inserirLoginBD(login);

    }

}
