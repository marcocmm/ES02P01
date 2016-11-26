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

        <div class="container">
            <form class="form" name="formPesquisa" method="post" action="ConsultaDoacoes.do">
                <div class="form-group">
                    <label for="cpfDoador">Cpf doador: </label>
                    <input type="text" class="form-control" placeholder="cpf do doador" name="cpf" value="" maxlength="14" required="" />
                </div>
                <div class="form-group">
                    <label for="dados">Tipo Consulta</label>
                    <select class="form-control" name="tipoConsulta">
                        <option value="dadosUltimaDoacao" >Dados da Última Doação</option>
                        <option value="dadosDoador" >Dados do Doador</option>
                        <option value="dadosTodasDoacoes" >Dados Todas as Doações</option>
                    </select>
                </div>
                <input type="hidden" value="consultaDoador" name="typeRequest"/>
                <input class="btn btn-success" style="width: 100%" type="submit" id="submitData" value="Consultar"/>
            </form>
        </div>
    </body>
    <script language="JavaScript" type="text/javascript" src="resources/js/mascInput.js"></script>
</html>
