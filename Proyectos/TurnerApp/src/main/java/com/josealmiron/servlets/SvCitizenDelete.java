package com.josealmiron.servlets;

import com.josealmiron.logica.Appointment;
import com.josealmiron.logica.Controladora;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCitizenDelete", urlPatterns = {"/SvCitizenDelete"})
public class SvCitizenDelete extends HttpServlet {
    
    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.valueOf(request.getParameter("citizenId"));

        List<Appointment> appointments = control.getAppointments();
        
        appointments.stream()
                .filter(a -> a.getCitizen().getId().equals(id))
                .map(Appointment::getId)
                .forEach(control::deleteAppointment);
        
        control.deleteCitizen(id);

        response.sendRedirect("SvCitizen");
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
