package com.josealmiron.servlets;

import com.josealmiron.logica.Citizen;
import com.josealmiron.logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SvCitizenUpdate", urlPatterns = {"/SvCitizenUpdate"})
public class SvCitizenUpdate extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Long id = Long.valueOf(request.getParameter("citizenId"));

        Citizen citizen = control.getCitizen(id);

        request.getSession().setAttribute("citizenEdit", citizen);

        response.sendRedirect("updateCitizen.jsp");
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
            request.getRequestDispatcher("/updateCitizen.jsp").forward(request, response);
            return;
        }

        Citizen citizen = (Citizen) request.getSession().getAttribute("citizenEdit");
        citizen.setName(name);
        citizen.setSurname(surname);
        citizen.setEmail(email);
        citizen.setPhone(phone);

        control.editCitizen(citizen);

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
