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
        <link rel="stylesheet" href="resources/css/bootstrap.css">
    </head>
    <body>


        <div class="login-page">
            <div class="form_login">
                <form class="login-form" name="Login" method="post" action="Login.do" >
                    <p class="message" >${mensagem}</p> <br>
                    <input type="text" placeholder="username" name="login"/>
                    <input type="password" placeholder="password" name="senha"/>
                    <input type="hidden" value="requestLogin" name="typeRequest"/>
                    <input class="button" style="width: 100%" type="submit" id="submitData" value="Login"/>
                </form>
            </div>
        </div>

        <script src="resources/js/loginJs.js"></script>

    </body>
</html>
