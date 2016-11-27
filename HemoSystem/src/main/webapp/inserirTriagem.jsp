<%-- 
    Document   : inserirTriagem
    Created on : 26/11/2016, 22:10:31
    Author     : Leonardo Baiser <lpbaiser@gmail.com>
--%>

<%@page import="br.com.hemosystem.model.gerencial.TipoLogin"%>
<%
    session = request.getSession();
    if (session.getAttribute("login") == null) {
        request.setAttribute("mensagem", "Precisa estar logado!");
        RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
        dis.forward(request, response);
    }
%>

<%@page import="br.com.hemosystem.model.doacao.Reacoes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Triagem</title>
        <link rel="stylesheet" href="resources/css/toggle_switch.css">
        <jsp:include page="header.jsp"></jsp:include>
    </head>
    <body>


        <div class="container">

            <form class="form" method="post" name="formDoacao" action="Triagem.do">

                <div id="form_coluna1" class="form-group">
                    <label for="cpfDoador">Cpf do Doador</label>
                    <input type="text" class="form-control" placeholder="cpf do doador" name="cpf" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" title="Digite o CPF no formato nnn.nnn.nnn-nn" value="123.456.789-10" maxlength="50" required=""/>
                </div>
                <div id="form_coluna2" class="form-group">
                    <label for="codDoacao">Cód. Doacao</label>
                    <input type="number" class="form-control" placeholder="código da doação" min="1" name="codDoacao" value="" maxlength="50" required=""/>
                </div> 
                <div id="form_coluna1" class="form-group">
                    <label for="peso">Peso</label>
                    <input type="range" class="form-control" id="rangeInput" name="peso" min="45" max="110" value="" oninput="amount.value=rangeInput.value">                                                       
                    <output name="amount" for="rangeInput">0</output>
                </div>  
                <div id="form_coluna2" class="form-group">
                    <label for="hematocrito">Hematocrito</label>
                    <input type="text" class="form-control" placeholder="hematocrito do doador" name="hematocrito" value="" maxlength="50" required=""/>
                </div> 
                <div id="form_coluna1" class="form-group">
                    <label for="hemoglobina">Hemoglobina</label>
                    <input type="text" class="form-control" placeholder="hemoglobina do doador" name="hemoglobina" value="" maxlength="50" required=""/>
                </div>
                <div id="form_coluna2" class="form-group">
                    <label for="pulso">Pulso</label>
                    <input type="number" class="form-control" min="2" placeholder="pulso do doador" name="pulso" value="" maxlength="50" required=""/>
                </div>
                <div id="form_coluna1" class="form-group">
                    <label for="temperatura">Temperatura</label>
                    <input type="number" class="form-control" min="20" max="40" placeholder="temperatura do doador" name="temperatura" value="36" maxlength="50" required=""/>
                </div> 
                <div id="form_coluna2" class="form-group">
                    <label for="pressaoArterial">Pressao Arterial</label>
                    <input type="text" class="form-control" placeholder="pressao arterial do doador" name="pressaoArterial" value="" maxlength="50" required=""/>
                </div>
                
                <div id="form_coluna2" class="form-group">
                    <label for="aptidao">Aptidão</label><br>
                    <label class="switch">
                        <input name="aptidao" type="checkbox" checked="">
                        <div class="slider round"></div>
                    </label>
                </div>
                <div id="form_coluna1" class="form-group">
                        <label for="reacoes">Reação</label>
                    <%
                        out.println("<select class=\"form-control\" name=\"tipoReacao\"/>");
                        out.println("<option value=\"\">Selecione</option>");
                        for (Reacoes tipo : Reacoes.values()) {
                            out.println("<option value=\"" + tipo + "\">");
                            out.println(tipo.getReacao());
                            out.println("</option>");
                        }
                        out.println("</select>");
                    %>
                </div>
                
                <input type="hidden" value="insereTriagem" name="typeRequest"/>
                <input class="btn btn-success" style="width: 100%" type="submit" id="submitData" value="Inserir Triagem"/>


            </form>
        </div>

    </body>
</html>
