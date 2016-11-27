/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.servlets;

import br.com.hemosystem.controller.DoacaoBO;
import br.com.hemosystem.model.doacao.Reacoes;
import br.com.hemosystem.model.doacao.Triagem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class TriagemServlet extends HttpServlet {

    Triagem triagem;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String typeRequest = request.getParameter("typeRequest");

        if (typeRequest.equals("insereTriagem")) {
            triagem = new Triagem();
            triagem.setPeso(Float.parseFloat(request.getParameter("peso")));
            triagem.setHematocrito(request.getParameter("hematocrito"));
            triagem.setHemoglobina(request.getParameter("hemoglobina"));
            triagem.setPulso(Float.parseFloat(request.getParameter("pulso")));
            triagem.setTemperatura(Float.parseFloat(request.getParameter("temperatura")));
            triagem.setPressaoArterial(request.getParameter("pressaoArterial"));
            if (request.getParameter("aptidao").equals("on")) {
                triagem.setAptidao(true);
            } else {
                triagem.setAptidao(false);
            }
            triagem.setReacoes(Reacoes.setReacao(request.getParameter("tipoReacao")));

            String cpfDoador = request.getParameter("cpf");
            int idDoacao = Integer.parseInt(request.getParameter("codDoacao"));

            try {
                DoacaoBO.insertTriagem(triagem, idDoacao, cpfDoador);
            } catch (Exception ex) {
                Logger.getLogger(TriagemServlet.class.getName()).log(Level.SEVERE, null, ex);
                response.sendRedirect("paginaErro.jsp");
            }
            response.sendRedirect("novaDoacao.jsp");
            

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
