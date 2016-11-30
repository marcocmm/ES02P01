package br.com.hemosystem.controller;

import br.com.hemosystem.dao.LoginDAO;
import br.com.hemosystem.model.gerencial.Login;
import br.com.hemosystem.model.gerencial.TipoLogin;
import br.com.hemosystem.tools.StringToMD5;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class LoginBO {

    public static Boolean canDoLogin(String login, String senha) {
        LoginDAO loginDAO = new LoginDAO();
        if (loginDAO.existsLogin(login)) {
            if (StringToMD5.convertStringToMd5(senha).equals(loginDAO.getSenhaLogin(login))) {
                return true;
            }
        }

        return false;
    }

    public static TipoLogin getTipoLogin(Login login) {
        LoginDAO loginDAO = new LoginDAO();
        Login loginBD = loginDAO.obter(login);
        return loginBD.getTipoLogin();
    }

    public static void inserirLoginBD(Login login) {
        LoginDAO loginDAO = new LoginDAO();
        String senhaMD5 = StringToMD5.convertStringToMd5(login.getSenha());
        login.setSenha(senhaMD5);
        try {
            loginDAO.insert(login);
        } catch (SQLException ex) {
            Logger.getLogger(LoginBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Login getLogin(String login, String senha) {
        LoginDAO loginDAO = new LoginDAO();
        return loginDAO.getLogin(login, StringToMD5.convertStringToMd5(senha));
    }

}
