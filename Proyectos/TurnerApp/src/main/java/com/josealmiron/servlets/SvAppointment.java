package com.josealmiron.servlets;

import com.josealmiron.logica.Appointment;
import com.josealmiron.logica.Controladora;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvAppointment", urlPatterns = {"/SvAppointment"})
public class SvAppointment extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String dateParam = request.getParameter("date");
        String statusParam = request.getParameter("status");

        List<Appointment> appointments = control.getAppointments().stream()
                .sorted(Comparator.comparing(Appointment::getAssignedDate))
                .collect(Collectors.toList());

        request.getSession().setAttribute("appointments", appointments);

        // Filtrar por fecha si esta presente
        Optional<LocalDate> optionalDate = Optional.ofNullable(dateParam)
                .filter(param -> !param.isEmpty())
                .map(param -> LocalDate.parse(param, DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        // Filtrar por fecha y status si estan presentes
        List<Appointment> filteredAppointments = appointments.stream()
                .filter(a -> optionalDate.map(date -> a.getAssignedDate().toLocalDate().equals(date)).orElse(true)) 
                .filter(a -> Optional.ofNullable(statusParam)
                .filter(param -> !param.isEmpty())
                .map(param -> a.getStatus().equalsIgnoreCase(param))
                .orElse(true)) 
                .collect(Collectors.toList());

        request.getSession().setAttribute("appointments", filteredAppointments);
        request.getRequestDispatcher("appointment.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String date = request.getParameter("date");
        String time = request.getParameter("time");
        Long citizen = Long.valueOf(request.getParameter("citizen"));
        String description = request.getParameter("description");

        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalTime localTime = LocalTime.parse(time);

        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);

        Appointment appointment = new Appointment();
        appointment.setAssignedDate(dateTime);
        appointment.setStatus("En Espera");
        appointment.setDescription(description);

        control.createAppointment(appointment, citizen);

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
