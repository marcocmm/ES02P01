package br.com.hemosystem.controller;

import br.com.hemosystem.dao.DoacaoDAO;
import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.model.doacao.Doacao;
import br.com.hemosystem.model.doador.Doador;
import java.util.List;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoacaoBO {

    public static Doacao getDadosUltimaDoacao(String cpf){
        DoadorDAO doadorDAO = new DoadorDAO();
        Doador doador = doadorDAO.getUltimaDoacao(cpf);
        if (doador != null){
            return doador.getUltimaDoacao();
        }
        return null;
    }

    public static List<Doacao> getTodasDoacoes(String cpf) {
        DoacaoDAO doacaoDAO = new DoacaoDAO();
        return doacaoDAO.listaDoacoes(cpf);
    }

}
