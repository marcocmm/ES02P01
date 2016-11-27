package br.com.hemosystem.controller;

import br.com.hemosystem.dao.DoacaoDAO;
import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.model.doacao.Doacao;
import br.com.hemosystem.model.doacao.Triagem;
import br.com.hemosystem.model.doador.Doador;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoacaoBO {

    public static Doacao getDadosUltimaDoacao(String cpf) {
        DoadorDAO doadorDAO = new DoadorDAO();
        Doador doador = doadorDAO.getUltimaDoacao(cpf);
        if (doador != null) {
            return doador.getUltimaDoacao();
        }
        return null;
    }

    public static List<Doacao> getTodasDoacoes(String cpf) {
        DoacaoDAO doacaoDAO = new DoacaoDAO();
        return doacaoDAO.listaDoacoes(cpf);
    }

    public static Boolean insertDoacao(Doacao doacao) {
        DoacaoDAO doacaoDAO = new DoacaoDAO();
        try {
            doacaoDAO.insert(doacao);
        } catch (SQLException ex) {
            Logger.getLogger(DoacaoBO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public static void insertTriagem(Triagem triagem, int idDoacao, String cpfDoador) throws Exception {
        DoacaoDAO doacaoDAO = new DoacaoDAO();
        DoadorDAO doadorDAO = new DoadorDAO();
        Doacao doacao = doacaoDAO.obter(idDoacao);
        doacao.setTriagem(triagem);
        doacaoDAO.update(doacao);
        Doador doador = doadorDAO.obterByNumeroDocumento(cpfDoador);
        doador.setUltimaDoacao(doacao);
        doadorDAO.update(doador);
    }

}
