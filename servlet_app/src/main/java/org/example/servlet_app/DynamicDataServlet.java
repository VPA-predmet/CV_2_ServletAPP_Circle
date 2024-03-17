package org.example.servlet_app;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns ={"/dynamic"} )
public class DynamicDataServlet extends HttpServlet {

    private static final double PI = 3.14159265;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();
        String zadaneCislo = request.getParameter("zadaneCislo");
        double polomer = Double.valueOf(zadaneCislo);
        double obvod = 2 * PI * polomer;
        double obsah = PI * polomer * polomer;
        out.println("<html><body>");
        out.printf("<h1>Zadali ste polomer %s</h1><br>",zadaneCislo);
        out.printf("<h2>Obvod kruznice s polomerom %s je %s </h2><br>",zadaneCislo, obvod);
        out.printf("<h2>Obsah kruznice s polomerom %s je %s </h2><br>",zadaneCislo, obsah);
        out.println("</html></body>");


    }
}