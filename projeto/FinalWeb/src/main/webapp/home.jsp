<!DOCTYPE html>
<%@page import="modelo.Usuario"%>
<%@page import="java.util.List"%>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/estilohm.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
    <script src="script/js.js" defer></script>
    <title>Locadora</title>
</head>

<body>
    <header>
        <nav class="nav-bar">
            <div class="logo">
                <a href="http://localhost/tela_para-java/telinha.html"><img src="img/images-removebg-preview.png"
                        width="100px"></a>
            </div>
            <div class="nav-list">
                <ul>
                    <li class="nav-item"><a href="home.html" class="nav-link" style="color: #03A0C6;">Inicio</a>
                    </li>
                    <li class="nav-item"><a href="servicos.html" class="nav-link" style="color: #03A0C6;">Serviços</a>
                    </li>
                    <li class="nav-item"><a href="contato.html" class="nav-link" style="color: #03A0C6;">Contato</a>
                    </li>

                </ul>
            </div>
<form action="LogoutServlet" method="post">
       <button style="color:blue">sair</button>
       </form>

</nav>
    </header>


    <main class="container">
     
             <%
       List<Usuario> lista = (List<Usuario>)session.getAttribute("lista");
       %>
       
       <div class="tabela">
    
       
       <table border="1">
       <tr>
       <td>usuario</td>
        <td>nome</td>
        <td>email</td>
       </tr>
       
        <%
       for(Usuario usuario:lista){
    	   out.write("<tr>");
    	   out.write("<td>" + usuario.getUsuario() + "</td>");
    	   out.write("<td>" + usuario.getNome() + "</td>");
    	   out.write("<td>" + usuario.getEmail() + "</td>");
       }
       %>
       
       </table>
       
        </div>


    </main>