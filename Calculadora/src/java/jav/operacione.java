/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * 
 */
@WebServlet(name = "operacione", urlPatterns = {"/operacione"})
public class operacione extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            oper numeros=new oper();
            // Se reciben los parametros del html
            numeros.setNum1(Integer.parseInt(request.getParameter("num1")));
            numeros.setNum2(Integer.parseInt(request.getParameter("num2")));
            
            // De acuerdo al parametro de operacion se efectua la misma
            if (request.getParameter("sum") != null)
            {
                // Se despliegan los resultados
                out.println("<h3>" + "La suma de ambos numeros es: " + (numeros.getNum1() + numeros.getNum2())
                + "</h3>");
            }
            else
                if (request.getParameter("res") != null)
                {
                    out.println("<h3>" + "La resta de ambos numeros es: " + (numeros.getNum1() - numeros.getNum2())
                    + "</h3>");
                }
                else
                    if (request.getParameter("mul") != null)
                    {
                        out.println("<h3>" + "La multiplicacion de ambos numeros es: " + (numeros.getNum1() * numeros.getNum2())
                        + "</h3>");
                    }
                    else
                        if (request.getParameter("div") != null)
                        {
                            out.println("<h3>" + "La division de ambos numeros es: " + (numeros.getNum1() / numeros.getNum2())
                            + "</h3>");
                        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
