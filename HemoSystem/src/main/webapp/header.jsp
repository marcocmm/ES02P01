<%-- 
    Document   : header
    Created on : 06/11/2016, 13:10:49
    Author     : Leonardo Baiser <lpbaiser@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/css/header.css">
        <link rel="stylesheet" href="resources/css/styleMenu.css">
        <link rel="stylesheet" href="resources/css/bootstrap.css">
        <link rel="stylesheet" href="resources/css/style.css">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
    <div class="header textHeader">HemoSystem</div>

    <nav id="cssmenu">
        <ul>
            <li><a class="active" href="#">Doador</a>
                <ul>
                    <li><a href="crudDoador.jsp">Cadastrar Doador</a></li>
                    <li><a href="consultarDados.jsp">Consultar Dados</a>
                </ul>
            </li>
            <li><a href="novaDoacao.jsp">Nova Doação</a></li>
            <li><a href="inserirTriagem.jsp">Triagem</a></li>
            <li><a href="Login.do?typeRequest=logout">Sair</a></li>

            </li>
        </ul>
    </nav>
</head>
<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
<script src="resources/js/scriptMenu.js"></script>
</html>
