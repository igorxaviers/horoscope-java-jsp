<%-- 
    Document   : horoscopo
    Created on : 07/03/2021, 10:24:45
    Author     : junior, igor
--%>
<%
    String email = "";
    String user = "";
    if(session.getAttribute("email") == "" || session.getAttribute("email") == null)
    {
        response.sendRedirect("index.jsp");
    }else{
       email = (String) session.getAttribute("email");
       user = (String) session.getAttribute("user");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <link href="css/main.css" rel="stylesheet">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/a8349f7f3a.js" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <main>
            <nav class="navbar navbar-light bg-light shadow-sm">
                <div class="container d-flex align-items-center justify-content-between">
                    <a class="navbar-brand d-flex align-items-center" href="#">
                        <img src="imagens/icon.png" alt="" width="65" height="65" class="d-inline-block align-top">
                        <span class="px-3 fw-bold">Horoscopo</span>
                    </a>
                    <a class="btn botao" href="Servletloggout">Logout <i class="ps-2 fas fa-sign-out-alt"></i></a>
                </div>
            </nav>
            <div class="container pt-5">
                <h5 class="mb-5">Olá <strong><%= user %></strong>, consulte o seu horóscopo de hoje!</h5>
                
                <form method="post" id="formSigno" class="col-6 mx-auto bg-light p-5 rounded-3 text-center shadow-sm">
                    <div class="mb-3">
                        <input type="date" name="data" id="data" class="form-control-lg border-0 shadow-sm w-100">
                        <button type="submit" class="btn botao btn-lg w-50 mt-5 mx-auto"> Previsões <i class="fas fa-long-arrow-alt-right"></i> </button>
                    </div>
                    <img src="" id="imagem" alt="" width="50" height="50"> 
                </form>
                
            </div>
        </main>
        <script defer src="js/signo.js"></script>
    </body>
</html>
