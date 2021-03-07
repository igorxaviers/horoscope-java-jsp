<%-- 
    Document   : horoscopo
    Created on : 07/03/2021, 10:24:45
    Author     : junior
--%>
<%
    String email = "";
    if(session.getAttribute("email") == "" || session.getAttribute("email") == null)
    {
        response.sendRedirect("index.jsp");
    }else{
       email = (String) session.getAttribute("email");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="Servletloggout">Loggout </a>
        <h1>Horoscopo - <%= email %></h1>
    </body>
</html>
