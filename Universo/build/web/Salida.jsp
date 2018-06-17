<%-- 
    Document   : Salida
    Created on : 14-abr-2018, 12:23:42
    Author     : Fran
--%>


<%@page import="SistemaSolar.Sol"%>
<%@page import="java.util.List"%>
<%@page import="SistemaSolar.Planeta"%>
<%@page import="SistemaSolar.Sistema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sistema Solar creado</h1>
           <%
            Sistema sistema = (Sistema)request.getAttribute("sistema");
            out.print("<h1>SISTEMA: "+sistema.getNombre()+"</h1>");
            List<Planeta> planetas = sistema.getPlanetas(); 
            List<Sol> estrella = sistema.getEstrella();
            for(Planeta p : planetas)
            {
                if(p == null)
                {
                    out.println("nulo");
                }else
                {
                    out.print("<h2>nombre Planeta: "+p.getNombre()+"</h2>");
                    out.print("<p>Temperatura: "+p.getTemperatura()+"</p>");
                    out.print("<p>Agua: "+p.isTieneAgua()+"</p>");
                    out.print("<p>Temperatura: "+p.isTieneOxigeno()+"</p>");
                    out.print("<p>Habitado; "+p.isHabitado()+"</p>");
                    out.println("<h4>********************************************</h4>");
                    
                    
                }
                
            }
            for(Sol s: estrella)
            {
                out.print("<h2>nombre Sol; "+s.getNombre()+"</h2>");
            }
        %>
        
    </body>
</html>
