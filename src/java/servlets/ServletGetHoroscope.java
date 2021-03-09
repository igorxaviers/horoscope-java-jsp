/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.Signo;

/**
 *
 * @author junior, igorr
 */
@WebServlet(name = "ServletGetHoroscope", urlPatterns = {"/ServletGetHoroscope"})
public class ServletGetHoroscope extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String data = request.getParameter("data");
        int dia = Integer.parseInt(data.split("-")[2]); 
        int mes = Integer.parseInt(data.split("-")[1]);
        String signo = Signo.getSigno(dia, mes);
        boolean flag = false;
        String dados[];
        try {
            RandomAccessFile arq = new RandomAccessFile(request.getServletContext().getRealPath("")+"//horoscopo.txt","r");
            while(arq.getFilePointer()<arq.length() && flag!=true)
            {
                dados = arq.readLine().split("#");      
                if(dados[0].equalsIgnoreCase(signo))
                    flag = true;
            }
            arq.close();  
        } catch (Exception e) {
            System.out.println(e);
        }


        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletGetHoroscope</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + dia+mes + "</h1>");
            out.println("<h1>" + signo +"</h1>");
            // out.println("<h1>" + dados +"</h1>");
            out.println("</body>");
            out.println("</html>");
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
