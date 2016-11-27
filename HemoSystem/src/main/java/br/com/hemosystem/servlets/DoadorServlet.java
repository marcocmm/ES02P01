/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.servlets;

import br.com.hemosystem.controller.DoadorBO;
import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.model.doador.Doador;
import br.com.hemosystem.model.doador.EstadoCivil;
import br.com.hemosystem.model.doador.Sexo;
import br.com.hemosystem.model.endereco.Endereco;
import br.com.hemosystem.tools.CalendarioHelper;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class DoadorServlet extends HttpServlet {

    Doador doador;
    DoadorDAO doadorDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String typeRequest = request.getParameter("typeRequest");
        if (typeRequest.equals("cadastraDoador")) {

            doador = new Doador();

            doador.setNomeDoador(request.getParameter("nome"));
            doador.setNomePai(request.getParameter("nomePai"));
            doador.setNomeMae(request.getParameter("nomeMae"));

            doador.setSexo(Sexo.setSexo(request.getParameter("genero")));

            doador.setDataNasc(CalendarioHelper.parseDate(request.getParameter("dataNasc")));

            doador.setProfissao(request.getParameter("profissao"));
            doador.setEscolaridade(request.getParameter("escolaridade"));
            doador.setEmail(request.getParameter("email"));
            doador.setTelefone(request.getParameter("telefone"));
            Endereco enderecoComercial = new Endereco();
            enderecoComercial.setRua(request.getParameter("ruaC"));
            enderecoComercial.setBairro(request.getParameter("bairroC"));
            enderecoComercial.setNumero(request.getParameter("numeroC"));
            enderecoComercial.setEstado(request.getParameter("estadoC"));
            enderecoComercial.setCidade(request.getParameter("cidadeC"));
            Endereco enderecoResindencial = new Endereco();
            enderecoResindencial.setRua("ruaR");
            enderecoResindencial.setCidade(request.getParameter("cidadeR"));
            enderecoResindencial.setEstado(request.getParameter("estadoR"));
            enderecoResindencial.setNumero("numeroR");
            enderecoResindencial.setBairro("bairroR");

            doador.setEnderecoComercial(enderecoComercial);

            doador.setEnderecoResidencial(enderecoResindencial);

            doador.setEstadoCivil(EstadoCivil.setEstadoCivil(request.getParameter("estadoCivil")));

            doador.setTrabalhoAtual(request.getParameter("trabalhoAtual"));

            doador.setNumDocumento(request.getParameter("numeroDocuento"));

            DoadorBO doadorBO = new DoadorBO();

            if (doadorBO.insertDoador(doador)) {
                request.setAttribute("mensagem", "Doador inserido com sucesso!");

            } else {
                request.setAttribute("mensagem", "Ops houve um erro!");
            }
            RequestDispatcher dis = request.getRequestDispatcher("crudDoador.jsp");
            dis.forward(request, response);

        }//else

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
