/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.servlets;

import br.com.hemosystem.dao.MunicipioDAO;
import br.com.hemosystem.model.doacao.Doador;
import br.com.hemosystem.model.doacao.Sexo;
import br.com.hemosystem.model.endereco.Endereco;
import br.com.hemosystem.tools.CalendarioHelper;
import java.io.IOException;
import java.io.PrintWriter;
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
    MunicipioDAO municipioDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doador = new Doador();
        municipioDAO = new MunicipioDAO();
        doador.setNomeDoador(request.getParameter("nome"));
        doador.setNomePai(request.getParameter("nomePai"));
        doador.setNomeMae(request.getParameter("nomeMae"));
        
        switch (request.getParameter("genero")) {
            case "masculino":
                doador.setSexo(Sexo.MASCULINO);
            case "feminino":
                doador.setSexo(Sexo.FEMENINO);
            case "outro":
                doador.setSexo(Sexo.OUTRO);
        }
        
        doador.setDataNasc(CalendarioHelper.parseDate(request.getParameter("dataNasc")));
        
        doador.setProfissao(request.getParameter("profissao"));
        doador.setEscolaridade(request.getParameter("escolaridade"));
        doador.setEmail(request.getParameter("email"));
        doador.setTelefone(request.getParameter("telefone"));
        Endereco enderecoComercial = new Endereco();
        enderecoComercial.setRua(request.getParameter("ruaC"));
        enderecoComercial.setBairro(request.getParameter("bairroC"));
        enderecoComercial.setNumero(request.getParameter("numeroC"));
        enderecoComercial.setMunicipio(municipioDAO.obter(request.getParameter("municipio")));
        
       

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
