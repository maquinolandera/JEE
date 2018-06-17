<%-- 
    Document   : alta.jsp
    Created on : 30-abr-2018, 12:15:16
    Author     : Fran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Libros Maravillosos para Gente Fabulosa LIMAPAGENFA </h1>
         
        <form method="post" action = "Controlador?action=datos" name = "formulario" id = "formulario">
            <table border = 1>
                <c:forEach var="libro" items="${libros}">
	

                <tr><td><input type ="text" name = "id" id = "id_${libro.id}" value="${libro.id}"></td>
                    <td><input type ="text" name = "titulo" id = "titulo_${libro.id}" value="${libro.titulo}"></input></td>
                    <td><input type ="text" name = "precio" id = "precio_${libro.id}" value="${libro.precio}"></input></td>
                    <td><input type ="button"   value="modificar" onclick="modificar('${libro.id}')"></input></td>
                    <td><input type ="button"  value="borrar" id ="boton_borrar" onclick="borrar('${libro.id}')" ></input></td>
                    
                </tr>
                </c:forEach> 
                
                    <input type ="hidden" name = "oculto_id" id = "oculto_id">
                    <input type ="hidden" name = "oculto_titulo" id = "oculto_titulo">
                    <input type ="hidden" name = "oculto_precio" id = "oculto_precio">
                   <input type ="hidden" name = "borrar_registro" id = "borrar_registro">
                
            </table>
            
        </form>
                <script type="text/javascript">
                    function modificar(oculto_titulo)
                    {
                      alert(oculto_titulo);
                      document.getElementById("oculto_id").value=oculto_titulo;
                      var tituloAModificar = document.getElementById("titulo_${libro.id}"+oculto_titulo).value;
                      var precioAModificar = document.getElementById("precio_${libro.id}"+oculto_titulo).value;
                      document.getElementById("oculto_titulo").value=tituloAModificar;  
                      document.getElementById("oculto_precio").value=precioAModificar; 
                      document.getElementById("formulario").submit();
                    }
                    function borrar(borrar_registro)
                    {
                         alert(borrar_registro)
                         document.getElementById("borrar_registro").value=borrar_registro;
                         document.getElementById("formulario").submit();
                    }
                 </script>
        <form method="post" action="Controlador?action=alta" name="altaForm" id="altaForm">
            <input type ="text" name="titulo" id="titulo">
            <input type="text" name="precio" id="precio">
            <input type="submit" name="enviar" value="enviar">
            
        </form>
    </body>
</html>
