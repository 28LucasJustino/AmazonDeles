<%-- Document : cadastro Created on : 08/04/2024, 14:22:23 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <!DOCTYPE html>
            <html>

            <head>
                <script src="https://kit.fontawesome.com/c5d333bbd9.js" crossorigin="anonymous"></script>
                <link href="styles/cadastro.css" rel="stylesheet" type="text/css" />
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>Elason- Cadastro</title>
            </head>

            <body>
                <main>
                    <div class="container">
                        <div class="form">
                            <form action="cad" method="post">
                                <div class="form-header">
                                    <img src="assets/Captura_de_tela_2024-04-08_153808-removebg-preview.png" alt="" />
                                    <div class="title">
                                        <h1>Cadastre-se</h1>
                                    </div>
                                    <div class="login-button">
                                        <button><a href="./Elazon">Home</a></button>
                                    </div>
                                </div>

                                <div class="cards">
                                    <div class="inputs">
                                        <label for="nome"><i class="fa-solid fa-user" id="icon"></i> Nome</label>
                                        <input type="text" name="nome" placeholder="  Digite seu Nome" required>

                                    </div>
                                    <div class="inputs">
                                        <label for="email"><i class="fa-solid fa-envelope" id="icon"></i> Email</label>
                                        <input type="email" name="email" placeholder="   Digite seu Email" required>

                                    </div>
                                    <div class="inputs">
                                        <label for="senha"><i class="fa-solid fa-unlock" id="icon"></i> Senha</label>
                                        <input type="password" name="senha" placeholder="   Digite sua senha" required>

                                    </div>
                                    <div class="inputs">
                                        <label for="nascimento"> 
                                           Data de Nascimento</label>
                                        <input type="date" name="nascimento" placeholder="   Digite sua Data de Nascimento" required>

                                    </div>
                                    <div class="inputs">
                                        <label for="cpf"><i class="fa-solid fa-address-card" id="icon"></i> CPF</label>
                                        <input  id="cpf" type="text" name="cpf" onkeypress="return numeros(event)" placeholder="   Digite seu CPF" minlength="14" maxlength="14" required >

                                    </div>
                                    <div class="inputs">
                                        <label for="telefone"><i class="fa-solid fa-phone" id="icon"></i>
                                            Telefone</label>
                                        <input id="telefone" type="text" name="telefone" onkeypress="return numeros(event)" placeholder="   Digite seu Telefone"  minlength="14" maxlength="14" required>

                                    </div>
                                </div>

                                <div class="gender-inputs">
                                    <h6>Gênero</h6>
                                    <div class="gender-group">
                                        <div class="gender-input">
                                            <input id="female" type="radio" name="gender">
                                            <label for="female">Feminino</label><i class="fa-solid fa-venus"
                                                id="#iconG"></i>
                                        </div>

                                        <div class="gender-input">
                                            <input id="male" type="radio" name="gender">
                                            <label for="male">Masculino</label><i class="fa-solid fa-mars"
                                                id="#iconG"></i>
                                        </div>

                                        <div class="gender-input">
                                            <input id="others" type="radio" name="gender">
                                            <label for="others">Outros</label><i class="fa-solid fa-transgender"
                                                id="#iconG"></i>
                                        </div>

                                        <div class="gender-input">
                                            <input id="none" type="radio" name="gender">
                                            <label for="none">Prefiro não dizer</label><i
                                                class="fa-solid fa-comment-slash" id="#iconG"></i>
                                        </div>
                                    </div>
                                </div>

                                <div class="continue-button">
                                    <button class="btnLogin">Confirmar</button>
                                </div>
                            </form>
                        </div>
                </main>
            </body>
            <script src="js/inputs.js" type="text/javascript"></script>
            </html>