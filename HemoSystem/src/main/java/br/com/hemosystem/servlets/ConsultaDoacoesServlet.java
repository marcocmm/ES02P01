/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.servlets;

import br.com.hemosystem.controller.DoacaoBO;
import br.com.hemosystem.controller.DoadorBO;
import br.com.hemosystem.model.doacao.Doacao;
import br.com.hemosystem.model.doador.Doador;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class ConsultaDoacoesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession consultaSession = request.getSession();

        String typeRequest = request.getParameter("typeRequest");
        if (typeRequest.equals("consultaDoador")) {
            String cpf = request.getParameter("cpf");
            String tipoDocao = request.getParameter("tipoConsulta");

            if (!cpf.equals("")) {

                if (tipoDocao.equals("dadosUltimaDoacao")) {
                    Doacao doacao = DoacaoBO.getDadosUltimaDoacao(cpf);
                    if (doacao != null) {
                        consultaSession.setAttribute("ultimaDoacao", doacao);
                        response.sendRedirect("consultaDadosUltimaDoacao.jsp");
                    } else {
                        response.sendRedirect("paginaErro.jsp");
                    }

                } else if (tipoDocao.equals("dadosDoador")) {
                    Doador doador = DoadorBO.getDadosDoador(cpf);
                    consultaSession.setAttribute("dadosDoador", doador);
                    response.sendRedirect("paginaErro.jsp");

                } else if (tipoDocao.equals("dadosTodasDoacoes")) {
                    List<Doacao> doacoes = DoacaoBO.getTodasDoacoes(cpf);
                    consultaSession.setAttribute("dadosTodasDoacoes", doacoes);
                    response.sendRedirect("consultaDadosTodasDoacoes.jsp");
                    
                }
            }//else se cpf vazio

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
