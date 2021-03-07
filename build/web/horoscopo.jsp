<%-- 
    Document   : horoscopo
    Created on : 07/03/2021, 10:24:45
    Author     : junior
--%>
<%
    if(session.isNew()){
        
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
        <h1>Horoscopo - <% session.getAttribute("email"); %></h1>
    </body>
</html>
