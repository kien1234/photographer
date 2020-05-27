/*
* GalleryControl.java
*
* All Right Reserved
* Copyright (c) 2019 FPT University
 */
package controller;

import dao.GalleryDAO;
import dao.PictureDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Gallery;
import model.Picture;

/**
 * GalleryControl.<br>
 *
 * <pre>
 * Class GalleryControl lấy dữ liệu từ database thông qua class GalleryDAO, PictureDAO
 * và đẩy dữ liệu lên Gallery.jsp để hiển thị lên trình duyệt. Trong class này sẽ tiến hành
 * các xử lí dưới đây.
 *
 * . ProcessRequest.
 * . DoGet.
 * . DoPost.
 *
 *
 * </pre>
 *
 * @author FU Kiennthe130540
 * @version 1.0
 */
public class GalleryControl extends HttpServlet {

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
            GalleryDAO galleryDAO = new GalleryDAO();
            PictureDAO pictureDAO = new PictureDAO();
            int id = Integer.parseInt((String) request.getParameter("id"));
            //Lấy ra từ database 1 list galleries và lưu vào biến galleries
            List<Gallery> galleries = galleryDAO.getGalleries();
            //Lấy ra từ database 1 list pictures theo id và lưu vào biến pictures
            List<Picture> pictures = pictureDAO.getPicturesByGalleryId(id);
            request.setAttribute("id", id);
            request.setAttribute("status", id);
            request.setAttribute("galleries", galleries);
            request.setAttribute("pictures", pictures);
            //Đẩy dữ liệu lên Gallery.jsp
            request.getRequestDispatcher("Gallery.jsp").forward(request, response);
        } catch (IOException | SQLException ex) {
            request.setAttribute("error", ex.getMessage());
            //Đẩy dữ liệu lên error.jsp
            request.getRequestDispatcher("error.jsp").forward(request, response);
            Logger.getLogger(GalleryControl.class.getName()).log(Level.SEVERE, null, ex);
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
