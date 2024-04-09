<%-- 
    Document   : login
    Created on : 08/04/2024, 14:22:09
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/login.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/c5d333bbd9.js" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Elazon</title>
    </head>
    <body>
        <header>
            <img src="assets/Captura_de_tela_2024-04-08_153808-removebg-preview.png" alt=""/>
    </header>
     <main>
            <div class="login">
                <div class="card-login">
                    <h1>Login</h1>
                    <div class="inputs">
                        <label for="email">Email</label>
                        <input type="email"  name="email"  placeholder="Email"><i class="fa-solid fa-user" id="icon"></i>
                    </div>                           
                    <div class="inputs">
                        <label for="senha">Senha</label>
                        <input type="password" name="senha" placeholder="Senha"><i class="fa-solid fa-lock" id="icon"></i>
                    </div>
                        <button class="btnLogin">Confirmar</button>
                </div>
            </div>
    </main>
    </body>
</html>
