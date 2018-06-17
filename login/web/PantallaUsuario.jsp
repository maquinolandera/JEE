<%-- 
    Document   : PantallaUsuario
    Created on : 08-abr-2018, 13:53:15
    Author     : Fran
--%>

<%@page import="controlator.UsuarioBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            img{
                width: 150px;
                height: 150px;
            }
        </style>
    </head>
    <body>
        <h1>${usuario}</h1>
        <h2>${password}</h2>
        
        ${password}
        <%
         String usu = (String) request.getAttribute("usuario");
         String pass = (String) request.getAttribute("password");
                
        
        
         
         
        %>
        <a href =" controlador?cerrar=true">cerrar</a>
        <form action = controlador>
        <textarea name =" area"></textarea>
        <input type ="submit" value ="enviar"/>
        </form>
        <img src ="${sesion}" />
        <h2>Sesion: ${datos}</h2>
        
        
    </body>
</html>
