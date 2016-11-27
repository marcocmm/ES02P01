/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hemosystem.servlets;

import br.com.hemosystem.controller.LoginBO;
import br.com.hemosystem.model.gerencial.Login;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String typeRequest = request.getParameter("typeRequest");

        if (typeRequest.equals("logout")) {
            HttpSession session = request.getSession();
            session.removeAttribute("logado");
            session.removeAttribute("login");
            session.removeAttribute("tipoLogin");
            response.sendRedirect("login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String typeRequest = request.getParameter("typeRequest");

        if (typeRequest.equals("requestLogin")) {
            String login1 = request.getParameter("login");
            String senha = request.getParameter("senha");

            if (LoginBO.canDoLogin(login1, senha)) {
                Login login = new Login();
                login = LoginBO.getLogin(login1, senha);
                HttpSession sessionLogin = request.getSession();
                login.setSenha("");
                sessionLogin.setAttribute("logado", true);
                sessionLogin.setAttribute("loginId", login.getLogin());
                sessionLogin.setAttribute("login", login);
                sessionLogin.setAttribute("tipoLogin", login.getTipoLogin());
                response.sendRedirect("novaDoacao.jsp");
            } else {
                request.setAttribute("mensagem", "Usuário e Senha inválidos!");
                RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
                dis.forward(request, response);
            }

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
