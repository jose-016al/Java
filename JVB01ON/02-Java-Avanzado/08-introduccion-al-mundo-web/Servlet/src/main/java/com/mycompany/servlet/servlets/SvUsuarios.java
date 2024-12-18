package com.mycompany.servlet.servlets;

import com.mycompany.servlet.logica.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("23849334A", "Jose", "Martinez", "734835734"));
        listaUsuarios.add(new Usuario("48293812B", "Maria", "Lopez", "647382912"));
        listaUsuarios.add(new Usuario("38472918C", "Carlos", "Garcia", "623847193"));
        listaUsuarios.add(new Usuario("57382947D", "Ana", "Fernandez", "698372819"));
        listaUsuarios.add(new Usuario("83927465E", "Luis", "Rodriguez", "712983746"));
        listaUsuarios.add(new Usuario("29483756F", "Laura", "Sanchez", "691283749"));
        listaUsuarios.add(new Usuario("37482619G", "David", "Perez", "639284756"));
        listaUsuarios.add(new Usuario("18394728H", "Marta", "Gonzalez", "671839245"));
        listaUsuarios.add(new Usuario("29384716J", "Javier", "Diaz", "654738291"));
        listaUsuarios.add(new Usuario("48573912K", "Elena", "Moreno", "629384715"));

        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("mostrarUsuarios.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        System.out.println(dni);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(telefono);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
