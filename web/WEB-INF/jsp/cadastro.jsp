<%-- 
    Document   : cadastro
    Created on : 08/04/2024, 14:22:23
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="styles/cadastro.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/c5d333bbd9.js" crossorigin="anonymous"></script>
        <link href="styles/cadastro.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Elason</title>
    </head>
    <body>
        <header>
            <img src="assets/Captura_de_tela_2024-04-08_153808-removebg-preview.png" alt=""/>
    </header>
     <main>
            <div class="cadastro">
                <div class="card-cadastro">
                    <h1>Cadastro</h1>
                    <div class="inputs">
                        <label for="nome">Nome</label>
                        <input type="text" name="nome" placeholder="Nome"><i class="fa-solid fa-user" id="icon"></i>
                    </div>
                    <div class="inputs">
                        <label for="email">Email</label>
                        <input type="email"  name="email"  placeholder="Email"><i class="fa-solid fa-envelope" id="icon"></i>
                    </div>                           
                    <div class="inputs">
                        <label for="senha">Senha</label>
                        <input type="password" name="senha" placeholder="Senha"><i class="fa-solid fa-unlock" id="icon"></i>
                    </div>
                    <div class="inputs">
                        <label for="cpf">CPF</label>
                        <input type="number" name="cpf" placeholder="CPF"><i class="fa-solid fa-address-card" id="icon"></i>
                    </div> 
                    <div class="inputs">
                        <label for="telefone">Telefone</label>
                        <input type="number" name="telefone" placeholder="Telefone"><i class="fa-solid fa-phone" id="icon"></i>
                    </div> 

                    <div class="card-gender">
                        <h6>Gênero</h6>
                        <div class="gender-input">
                            <input id="female" type="radio" name="gender">
                            <label for="female">Feminino</label>
                        </div>

                        <div class="gender-input">
                            <input id="male" type="radio" name="gender">
                            <label for="male">Masculino</label>
                        </div>

                        <div class="gender-input">
                            <input id="others" type="radio" name="gender">
                            <label for="others">Outros</label>
                        </div>

                        <div class="gender-input">
                            <input id="none" type="radio" name="gender">
                            <label for="none">Prefiro não dizer</label>
                        </div>
                    </div>
                </div>
 
                        <button class="btnLogin">Confirmar</button>
                </div>
            </div>
    </main>    
    </body>
</html>
