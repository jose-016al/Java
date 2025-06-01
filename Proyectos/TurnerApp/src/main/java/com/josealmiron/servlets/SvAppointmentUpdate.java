package com.josealmiron.servlets;

import com.josealmiron.logica.Appointment;
import com.josealmiron.logica.Controladora;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvAppointmentUpdate", urlPatterns = {"/SvAppointmentUpdate"})
public class SvAppointmentUpdate extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.valueOf(request.getParameter("appointmentId"));
        
        Appointment appointment = control.getAppointment(id);

        request.getSession().setAttribute("appointmentEdit", appointment);

        response.sendRedirect("updateAppointment.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String status = request.getParameter("status");
        String description = request.getParameter("description");

        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalTime localTime = LocalTime.parse(time);

        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);

        Appointment appointment = (Appointment) request.getSession().getAttribute("appointmentEdit");
        appointment.setAssignedDate(dateTime);
        appointment.setStatus(status);
        appointment.setDescription(description);

        control.editAppointment(appointment);

        response.sendRedirect("SvAppointment");
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
