<%-- 
    Document   : novaDoacao
    Created on : 06/11/2016, 13:35:46
    Author     : Leonardo Baiser <lpbaiser@gmail.com>
--%>

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
                <div id="form_coluna1" class="form-group">
                    <label for="nomeDoador">Nome do Doador</label>
                    <input type="text" class="form-control" placeholder="Nome do Doador" name="nome" value="Fulano" maxlength="50" required=""/>
                </div>
                
                
            </form>
            
        </div>
        
    </body>
</html>
