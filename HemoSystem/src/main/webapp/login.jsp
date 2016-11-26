<%-- 
    Document   : index.jsp
    Created on : 29/10/2016, 20:23:54
    Author     : Leonardo Baiser <lpbaiser@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hemo System</title>

        <link rel="stylesheet" href="resources/css/login.css">
    </head>
    <body>


        <div class="login-page">
            <div class="form_login">
                <form class="login-form">
                    <input type="text" placeholder="username"/>
                    <input type="password" placeholder="password"/>
                    <button>login</button>
                    <a href="crudDoador.jsp"/>Entrar</a>
                </form>
            </div>
        </div>

        <script src="resources/js/loginJs.js"></script>

    </body>
</html>
