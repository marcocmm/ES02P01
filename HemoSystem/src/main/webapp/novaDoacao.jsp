<%-- 
    Document   : novaDoacao
    Created on : 06/11/2016, 13:35:46
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
<%@page import="br.com.hemosystem.model.doacao.Procedimento"%>
<%@page import="br.com.hemosystem.model.doacao.TipoDoacao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nova Doação</title>
        <jsp:include page="header.jsp"></jsp:include>
        </head>
        <body>

            <div class="container">

                <form class="form" method="post" name="formDoacao" action="Doacao.do">
                    <p class="message" >${mensagem}</p> <br>
                <div id="form_coluna1" class="form-group">
                    <label for="cpfDoador">Cpf do Doador</label>
                    <input type="text" class="form-control" placeholder="cpf do doador" name="cpf" id="cpf" onblur="validarCPF(this)" onkeypress="formatar('###.###.###-##', this)" maxlength="14" required=""/>
                </div>  
                <div id="form_coluna2" class="form-group">
                    <label for="tipoDoacao">Tipo de Doação</label>
                    <%
                        out.println("<select class=\"form-control\" name=\"tipoDoacao\"/>");
                        out.println("<option value=\"\">Selecione</option>");
                        for (TipoDoacao tipo : TipoDoacao.values()) {
                            out.println("<option value=\"" + tipo + "\">");
                            out.println(tipo.getTipoDoacao());
                            out.println("</option>");
                        }
                        out.println("</select>");
                    %>
                </div>
                <div id="form_coluna1" class="form-group">
                    <label for="nomeHospital">Nome do Hospital</label>
                    <input type="text" class="form-control" placeholder="nome do Hospital" name="nomeHospital" value="Hemonucleo CM" maxlength="50" required=""/>
                </div>  
                <div id="form_coluna2" class="form-group">
                    <label for="procedimento">Procedimento</label>
                    <%
                        out.println("<select class=\"form-control\" name=\"procedimento\">");
                        out.println("<option value=\"\">Selecione</option>");
                        for (Procedimento proc : Procedimento.values()) {
                            out.println("<option value=\"" + proc + "\">");
                            out.println(proc.getProcedimento());
                            out.println("</option>");
                        }
                        out.println("</select>");
                    %>
                </div>
                <div id="form_coluna1" class="form-group">
                    <label for="nomeRespColeta">Nome do Responsável pela Coleta</label>
                    <input type="text" class="form-control" placeholder="Nome do Responsável pela Coleta" name="nomeRespColeta" value="João da Silva" maxlength="50" required=""/>
                </div> 

                <div id="form_coluna1" class="form-group">
                    <label for="dataColeta">Data da Coleta</label>
                    <input type="date" class="form-control" name="dataColeta" value="" id="dataColeta" required="" />
                </div>

                <input type="hidden" value="cadastraDoacao" name="typeRequest"/>
                <input class="btn btn-success" style="width: 100%" type="submit" id="submitData" value="Cadastrar Doação"/>



            </form>

        </div>
        <script language="JavaScript" type="text/javascript" src="resources/js/mascInput.js"></script>

    </body>
</html>
