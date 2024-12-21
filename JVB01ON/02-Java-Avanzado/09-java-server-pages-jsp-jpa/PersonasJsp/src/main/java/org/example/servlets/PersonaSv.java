/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package org.example.servlets;

import org.example.logica.Persona;
import org.example.logica.Controladora;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PersonaSv") // Esta anotación define la ruta del servlet
public class PersonaSv extends HttpServlet {
    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    private Controladora control = new Controladora();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setTelefono(telefono);

        control.crearPersona(persona);

        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
        String consultaApellido = request.getParameter("consultaApellido");
        
        List<Persona> personasCoincidentes = control.filtrarPersonasPorApellido(consultaApellido);

        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultados", personasCoincidentes);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }
}