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
import org.json.JSONObject;

import util.Horoscopo;
import util.Signo;


/**
 *
 * @author junior, igorr
 */
@WebServlet(name = "ServletGetHoroscope", urlPatterns = {"/ServletGetHoroscope"})
public class ServletGetHoroscope extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        String dados[] = {""};
        String data="";
        String dataSplit[] = new String[3];
        String signo;
        int dia, mes;
        boolean flag;
        try
        {
            data = request.getParameter("data");
            dataSplit = data.split("-");
            dia = Integer.parseInt(dataSplit[2]); 
            mes = Integer.parseInt(dataSplit[1]);
            signo = Signo.getSigno(dia, mes);
            flag = false;
            RandomAccessFile arq = new RandomAccessFile(request.getServletContext().getRealPath("")+"//horoscopo.txt","r");
            do
            {
                dados = arq.readLine().split("#");
                if(dados[0].equalsIgnoreCase(signo))
                    flag = true;
            }while(arq.getFilePointer()<arq.length() || flag!=true);
            arq.close();  
        }
        catch (IOException e) {
            System.out.println(e);
        }


        try (PrintWriter out = response.getWriter()) {
            JSONObject obj = new JSONObject();
            obj.put("signo", dados[0]);
            obj.put("imagem", dados[1]);
            obj.put("previsao", dados[2]);
            out.print(obj);
//            Horoscopo h = new Horoscopo(dados[0], dados[1], dados[2]);
            // out.print(h.getSigno());
            // out.print(h.getImagem());
            // out.print(h.getPrevisao());

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
