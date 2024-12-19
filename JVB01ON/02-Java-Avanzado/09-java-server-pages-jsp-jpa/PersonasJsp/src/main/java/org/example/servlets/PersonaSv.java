/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package org.example.servlets;

import org.example.logica.Persona;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PersonaSv") // Esta anotación define la ruta del servlet
public class PersonaSv extends HttpServlet {
    private ArrayList<Persona> listaPersonas = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setTelefono(telefono);

        listaPersonas.add(persona);

        // Aquí podrías guardar la lista en algún lugar persistente (base de datos, archivo, etc.)
        // Por simplicidad, se guarda en memoria durante la ejecución del servlet

        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String consultaApellido = request.getParameter("consultaApellido");

        ArrayList<Persona> personasCoincidentes = new ArrayList<>();

        for (Persona persona : listaPersonas) {
            if (persona.getApellido().equalsIgnoreCase(consultaApellido)) {
                personasCoincidentes.add(persona);
            }
        }

        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultados", personasCoincidentes);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }
}