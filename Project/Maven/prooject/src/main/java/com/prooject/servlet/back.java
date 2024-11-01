package com.prooject.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/back")
public class Back extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String people = request.getParameter("people");
        String days = request.getParameter("days");
        String comments = request.getParameter("comments");

        // Here you would handle the data (e.g., store it in MySQL)

        // Respond back to the user
        response.setContentType("text/html");
        response.getWriter().println("<h2>Thank you for your booking, " + name + "!</h2>");
    }
}
