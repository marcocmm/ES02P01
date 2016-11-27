/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.servlets;

import br.com.hemosystem.controller.DoacaoBO;
import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.model.doacao.Doacao;
import br.com.hemosystem.model.doacao.Procedimento;
import br.com.hemosystem.model.doacao.TipoDoacao;
import br.com.hemosystem.tools.CalendarioHelper;
import java.io.IOException;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoacaoServlet extends HttpServlet {

    Doacao doacao;
    DoadorDAO doadorDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String typeRequest = request.getParameter("typeRequest");

        if (typeRequest.equals("cadastraDoacao")) {
            doacao = new Doacao();
            doadorDAO = new DoadorDAO();

            doacao.setDoador(doadorDAO.obterByNumeroDocumento(request.getParameter("cpf")));
            doacao.setNomeHospital(request.getParameter("nomeHospital"));
            doacao.setNomeRespCad(request.getParameter("nomeRespColeta"));
            doacao.setProcedimento(Procedimento.AFERESE);//falta setar
            doacao.setTipoDoacao(TipoDoacao.REPOSICAO);//falta setar
            doacao.setTriagem(null);//vai como null até concluir o procedimento
            doacao.setData(CalendarioHelper.parseDate(request.getParameter("dataColeta")));

            if (DoacaoBO.insertDoacao(doacao)) {
                request.setAttribute("mensagem", "Doação inserida com sucesso!");
            } else {
                request.setAttribute("mensagem", "Ops houve um erro!");
                
            }
                RequestDispatcher dis = request.getRequestDispatcher("novaDoacao.jsp");
                dis.forward(request, response);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
