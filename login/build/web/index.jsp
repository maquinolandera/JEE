<%-- 
    Document   : index
    Created on : 08-abr-2018, 13:26:33
    Author     : Fran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method = "post" action = "controlador">
            <input type ="text" name ="usuario">
            <input type ="text" name ="password">
            <input type ="submit" value ="enviar">
        </form>
        ${usuario}
        ${password}
        
       
    </body>
</html>
