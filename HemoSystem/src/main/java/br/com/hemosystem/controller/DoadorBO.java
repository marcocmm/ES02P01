package br.com.hemosystem.controller;

import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.model.doador.Doador;
import br.com.hemosystem.servlets.DoadorServlet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoadorBO {

    Doador doador;
    DoadorDAO doadorDAO;

    public Boolean insertDoador(Doador doador) {
        doadorDAO = new DoadorDAO();
        try {
            doadorDAO.insert(doador);
        } catch (SQLException ex) {
            Logger.getLogger(DoadorServlet.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public static Doador getDadosDoador(String cpf) {
        return null;
    }

    public static Boolean existsDoador(String cpf) {
        DoadorDAO doadorDAO = new DoadorDAO();
        if (doadorDAO.obterByNumeroDocumento(cpf) != null) {
            return true;
        }
        return false;
    }

}
