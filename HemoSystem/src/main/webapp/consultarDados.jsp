<%-- 
    Document   : consultarDados
    Created on : 23/11/2016, 21:02:20
    Author     : Leonardo Baiser <lpbaiser@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Dados</title>
        <jsp:include page="header.jsp"></jsp:include>
    </head>
    <body>
        <form class="form" method="post" action="DadosDoacao.do">
            <div class="form-group">
                <label for="cpfDoador">Cpf doador: </label>
                <input type="text" class="form-control" placeholder="cpf do doador" name="cpf" value="" maxlength="50" required=""/>
            </div>

            <a href="consultaDadosDoacaoAtual.jsp"/>Dados da Ultima doação</a>
        </form>
    </body>
</html>
