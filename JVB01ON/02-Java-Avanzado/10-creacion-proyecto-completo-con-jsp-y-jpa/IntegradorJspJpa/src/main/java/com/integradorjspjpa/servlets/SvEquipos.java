package com.integradorjspjpa.servlets;

import com.integradorjspjpa.logica.Controladora;
import com.integradorjspjpa.logica.Equipo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roque
 */
@WebServlet(name = "SvEquipos", urlPatterns = {"/SvEquipos"})
public class SvEquipos extends HttpServlet {
    Controladora controlLogica = new Controladora();
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Se obtienen los equipos desde la BD
        List<Equipo> listEquipos = controlLogica.traerEquipos();
        
        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("equipos", listEquipos);
        
        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Tomo datos del JSP
        String nombre = request.getParameter("nombre_equipo");
        String ciudad = request.getParameter("ciudad_equipo");
        
        //Crea un nuevo objeto Equipo
        Equipo equipo = new Equipo();
        equipo.setNombre(nombre);
        equipo.setCiudad(ciudad);
        
        //Se persiste el equipo en la BD
        controlLogica.crearEquipo(equipo);
        
        
        response.sendRedirect("index.jsp");  
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
