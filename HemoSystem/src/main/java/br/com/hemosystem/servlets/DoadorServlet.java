/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.servlets;

import br.com.hemosystem.dao.DoadorDAO;
import br.com.hemosystem.dao.MunicipioDAO;
import br.com.hemosystem.model.doacao.Doador;
import br.com.hemosystem.model.doacao.EstadoCivil;
import br.com.hemosystem.model.doacao.Sexo;
import br.com.hemosystem.model.doacao.TipoDocumento;
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
            municipioDAO = new MunicipioDAO();
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
//        enderecoComercial.setMunicipio(municipioDAO.obter(request.getParameter("cidadeC"))); not work
            Endereco enderecoResindencial = new Endereco();
            enderecoResindencial.setRua("ruaR");
//            enderecoComercial.setMunicipio(municipioDAO.obter(request.getParameter("cidadeR")));
            enderecoResindencial.setNumero("numeroR");
            enderecoResindencial.setBairro("bairroR");
            
            doador.setEnderecoComercial(enderecoComercial);
            
            doador.setEnderecoResidencial(enderecoResindencial);

            doador.setEstadoCivil(EstadoCivil.setEstadoCivil(request.getParameter("estadoCivil")));

            doador.setTrabalhoAtual(request.getParameter("trabalhoAtual"));

            doador.setTipoDocumento(TipoDocumento.setTipoDocumento(request.getParameter("tipoDoc")));

            doador.setNumDocumento(request.getParameter("numeroDocuento"));
            
            doadorDAO = new DoadorDAO();
            doadorDAO.insert(doador);
            
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
