/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Fran
 */
@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {

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
        String nombre = request.getParameter("usuario");
        String password = request.getParameter("password");
        if(nombre == null || password == null)
        {
            request.setAttribute("usuario", "");
            request.setAttribute("password", "");
        }
        String usuarioSalida = "pepelotes";
        String passwordSalida = "lota";
       
        if(usuarioSalida.equals(nombre) && passwordSalida.equals(passwordSalida) )
        {
            HttpSession session = (HttpSession)request.getSession();
            UsuarioBean bean = new UsuarioBean(usuarioSalida,"img/imagen.jpg","25","Comentario");
            
            String usu = (String)session.getAttribute("usuario");
            String usu2 = (String)session.getAttribute("nick");
            boolean cerrar = false;
            if(cerrar == true)
            {
                session.invalidate();
                response.sendRedirect("index.jsp");
            }
           
            String comentario = (String)request.getAttribute("area");
            
            System.out.println(comentario);
            usu = bean.getFoto()+" ";
            bean.setComentario(comentario);
            System.out.println(bean.getComentario());
            usu2 = bean.mostrarResultados();
            request.setAttribute("usuario", "Bienvenido "+usuarioSalida);
            request.setAttribute("password", "Zona Usuario");
            session.setAttribute("sesion", usu);
            session.setAttribute("datos", usu2);
            
            
            
            request.getRequestDispatcher("PantallaUsuario.jsp").forward(request, response);
        }else
        {   
            request.setAttribute("usuario", "Usuario Incorrecto");
            request.setAttribute("password", "Password Incorrecto");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
       
        
        
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
