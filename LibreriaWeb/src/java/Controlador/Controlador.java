/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.libreria.LibreriaBo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fran
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      try
      {
       if(request.getParameter("action").equals("alta"))
       {
           LibreriaBo libreriaAlta = new LibreriaBo();
          if(!request.getParameter("titulo").equals("") || !request.getParameter("precio").equals(""))
          {
           String titulo = request.getParameter("titulo");
           String precio = request.getParameter("precio");
           
           libreriaAlta.altaLibro(titulo, precio);
           List libros = libreriaAlta.consultaLibro();
           request.setAttribute("libros", libros);
           
          }
           
       }
       if(request.getParameter("action").equals("datos"))
       {
           LibreriaBo libreriaMod = new LibreriaBo();
           List libros = libreriaMod.consultaLibro();
           
           request.setAttribute("libros", libros);
           if(!request.getParameter("oculto_titulo").equals("")||!request.getParameter("oculto_id").equals("")||!request.getParameter("oculto_precio").equals(""))
           {
               String tit = request.getParameter("oculto_titulo");
               
               String id = request.getParameter("oculto_id");
               String precio = request.getParameter("oculto_precio");
               System.out.println(tit);
               // System.out.println(titprec);
               System.out.println(id);
               libreriaMod.ModificaDAtos(id, tit, precio);
               libros = libreriaMod.consultaLibro();
               request.setAttribute("libros", libros);
                
           }
          
          if(!request.getParameter("borrar_registro").equals(""))
           {
               String borrar_id = request.getParameter("borrar_registro");
               System.out.println("ide borrar "+borrar_id);
               libreriaMod.borrarRegistro(borrar_id);
               libros = libreriaMod.consultaLibro();
               
               request.setAttribute("libros", libros);
           }
           
           
       }
       
           
            

       
       
      }catch(Exception e)
      {
          e.printStackTrace();
      }
    
       request.getRequestDispatcher("alta.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
