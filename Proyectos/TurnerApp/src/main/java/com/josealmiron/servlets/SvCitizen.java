package com.josealmiron.servlets;

import com.josealmiron.logica.Citizen;
import com.josealmiron.logica.Controladora;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCitizen", urlPatterns = {"/SvCitizen"})
public class SvCitizen extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Citizen> citizens = control.getCitizens().stream()
                .sorted(Comparator.comparing(Citizen::getName).thenComparing(Citizen::getSurname))
                .collect(Collectors.toList());
        request.getSession().setAttribute("citizens", citizens);

        request.getRequestDispatcher("citizen.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        if (!control.validateCitizen(name, surname, email, phone)) {
            request.setAttribute("error", "Datos inválidos. Verifica los campos ingresados.");
            request.getRequestDispatcher("/newCitizen.jsp").forward(request, response);
            return;
        }

        Citizen citizen = new Citizen();
        citizen.setName(name);
        citizen.setSurname(surname);
        citizen.setEmail(email);
        citizen.setPhone(phone);

        control.createCitizen(citizen);

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
