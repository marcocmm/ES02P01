<%
    session = request.getSession();
    TipoLogin tipoLogin = (TipoLogin) session.getAttribute("tipoLogin");
    Boolean isLogado = (Boolean) session.getAttribute("logado");
    if (session.getAttribute("login") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<%-- 
    Document   : consultaDadosExames
    Created on : 29/10/2016, 20:25:46
    Author     : Leonardo Baiser <lpbaiser@gmail.com>
--%>

<%@page import="br.com.hemosystem.model.gerencial.TipoLogin"%>
<%@page import="java.util.List"%>
<%@page import="br.com.hemosystem.model.doacao.Doacao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="resources/css/tablecss.css">
        <link rel="stylesheet" href="resources/accordion/accordionStyle.css">
        <jsp:include page="header.jsp"></jsp:include>
        </head> 
        <body>

            <div class="container">
                <p class="message" >${mensagem}</p> <br>
            <%                HttpSession consultaSession = request.getSession();
                List<Doacao> doacoes = (List<Doacao>) consultaSession.getAttribute("dadosTodasDoacoes");

                int cont = 0;
                if (doacoes != null) {
                    out.println("<div class=\"accordion\">");

                    for (Doacao doacao : doacoes) {
                        cont++;

                        out.println("<dt>");
                        out.println("<a href=\"#accordion" + cont + "\" aria-expanded=\"false\" aria-controls=\"accordion\" class=\"accordion-title accordionTitle js-accordionTrigger\">Cód. Doação: " + doacao.getCodDoacao() + " - Data: " + doacao.getData() + "</a>");
                        out.println("</dt>");

                        out.println("<dd class=\"accordion-content accordionItem is-collapsed\" id=\"accordion" + cont + "\" aria-hidden=\"true\">");
                        if (doacao != null) {

                            out.println("<table align=\"center\" width=\"1200\" class=\"\" title=" + "Dados" + ">");
                            out.println("<tr> <th class=\"titleTable\" colspan=\"2\"> Dados da Última Doação </th> </tr>");
                            out.println("<tr>");
                            out.println("<th>Nome do Doador</th>");
                            out.println("<td>" + doacao.getDoador().getNomeDoador() + "</td>");
                            out.println("</tr>");
                            out.println("<th>Cpf do Doador</th>");
                            out.println("<td>" + doacao.getDoador().getNumDocumento() + "</td>");
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

                        out.println("</dd>");
                    }
                    out.println("</div>");
                } else {
                    out.println("<h4>Nenhum dado encontado!</h4>");
                }
            %>

        </div>

        <div class="footer"></div>




        <script src="resources/accordion/accordionJs.js"></script>

    </body>
</html>
