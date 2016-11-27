<%-- 
    Document   : consultaDadosUltimaDoacao
    Created on : 29/10/2016, 20:26:03
    Author     : Leonardo Baiser <lpbaiser@gmail.com>
--%>
<%
    session = request.getSession();
    if (session.getAttribute("login") == null) {
        request.setAttribute("mensagem", "Precisa estar logado!");
        RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
        dis.forward(request, response);
    }
%>
<%@page import="br.com.hemosystem.model.doacao.Doacao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="header.jsp"></jsp:include>
            <link rel="stylesheet" href="resources/css/tablecss.css">
        </head>
        <body>

            <div class="table-responsive container">
                <p class="message" >${mensagem}</p> <br>
            <%
                HttpSession consultaSession = request.getSession();
                Doacao doacao = (Doacao) consultaSession.getAttribute("ultimaDoacao");
                if (doacao != null) {

                    out.println("<table align=\"center\" width=\"1200\" class=\"\" title=" + "Dados" + ">");
                    out.println("<tr> <th class=\"titleTable\" colspan=\"2\"> Dados da Última Doação </th> </tr>");
                    out.println("<tr>");
                    out.println("<th>Nome do Doador</th>");
                    out.println("<td>" + doacao.getDoador().getNomeDoador() + "</td>");
                    out.println("</tr>");
                    out.println("<th>Cpf do Doador</th>");
                    out.println("<td>" + doacao.getDoador().getNumDocumento()+ "</td>");
                    out.println("</tr>");

                    out.println("<tr>");
                    out.println("<th>Cód. Doação</th>");
                    out.println("<td>" + doacao.getCodDoacao() + "</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<th>Nome Hospital</th>");
                    out.println("<td>" + doacao.getNomeHospital() + "</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<th>Tipo Doacao</th>");
                    out.println("<td>" + doacao.getTipoDoacao().name() + "</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<th>Procedimento</th>");
                    out.println("<td>" + doacao.getProcedimento().name() + "</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<th>Nome Responsável pela Coleta</th >");
                    out.println("<td>" + doacao.getNomeRespCad() + "</td>");
                    out.println("</tr>");
                    out.println("<tr>");
                    out.println("<th>Data da Coleta</th>");
                    out.println("<td>" + doacao.getData() + "</td>");
                    out.println("</tr>");

                }

                out.println("</table>");

                //            consultaSession.removeAttribute("ultimaDoacao");
%>
        </div>

        <div class="footer"></div>
        
    </body>
</html>
