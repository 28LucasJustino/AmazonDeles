<%-- 
    Document   : cadastro
    Created on : 08/04/2024, 14:22:23
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://kit.fontawesome.com/c5d333bbd9.js" crossorigin="anonymous"></script>
        <link href="styles/cadastro.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Elason</title>
    </head>
    <body>
        <div class="container">
            <div class="form">
                <form action="#">
                    <div class="form-header">
                        <img src="assets/Captura_de_tela_2024-04-08_153808-removebg-preview.png" alt=""/>
                        <div class="title">
                            <h1>Cadastre-se</h1>
                        </div>
                        <div class="login-button">
                            <button><a href="#">Entrar</a></button>
                        </div>
                    </div>
    
                    <div class="cards">
                        <div class="inputs">
                            <label for="nome">Nome</label>
                            <input type="text" name="nome" placeholder="  Digite seu Nome" required><i class="fa-solid fa-user" id="icon"></i>
                        </div>
                        <div class="inputs">
                            <label for="email">Email</label>
                            <input type="email"  name="email"  placeholder="   Digite seu Email" required><i class="fa-solid fa-envelope" id="icon"></i>
                        </div>                           
                        <div class="inputs">
                            <label for="senha">Senha</label>
                            <input type="password" name="senha" placeholder="   Digite sua senha" required><i class="fa-solid fa-unlock" id="icon"></i>
                        </div>
                        <div class="inputs">
                            <label for="confirmarSenha">Confirme sua Senha</label>
                            <input id="confirmarSenha" type="password" name="  confirmarSenha" placeholder="  Digite sua senha novamente" required><i class="fa-solid fa-unlock" id="icon"></i>
                        </div>
                        <div class="inputs">
                            <label for="cpf">CPF</label>
                            <input type="number" name="cpf" placeholder="   Digite seu CPF" required><i class="fa-solid fa-address-card" id="icon"></i>
                        </div> 
                        <div class="inputs">
                            <label for="telefone">Telefone</label>
                            <input type="number" name="telefone" placeholder="   Digite seu Telefone" required><i class="fa-solid fa-phone" id="icon"></i>
                        </div> 
                    </div>
    
                    <div class="gender-inputs">
                            <h6>Gênero</h6>
                        <div class="gender-group">
                            <div class="gender-input">
                                <input id="female" type="radio" name="gender">
                                <label for="female">Feminino</label><i class="fa-solid fa-venus" id="#icon2"></i>
                            </div>
    
                            <div class="gender-input">
                                <input id="male" type="radio" name="gender">
                                <label for="male">Masculino</label><i class="fa-solid fa-mars" id="#icon2"></i>
                            </div>
    
                            <div class="gender-input">
                                <input id="others" type="radio" name="gender">
                                <label for="others">Outros</label><i class="fa-solid fa-transgender" id="#icon2"></i>
                            </div>
    
                            <div class="gender-input">
                                <input id="none" type="radio" name="gender">
                                <label for="none">Prefiro não dizer</label><i class="fa-solid fa-comment-slash" id="#icon2"></i>
                            </div>
                        </div>
                    </div>
    
                    <div class="continue-button">
                        <button class="btnLogin"><a href="#">Continuar</a></button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
