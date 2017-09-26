/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.regahruzty.universitas.controller;

import com.gmail.regahruzty.universitas.dao.KelasDao;
import com.gmail.regahruzty.universitas.model.Kelas;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Diani
 */

@WebServlet(urlPatterns = {"/kelas/list"})
public class KelasListController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        KelasDao kelasDao = new KelasDao();
        List<Kelas> dataKelas = kelasDao.semuaDataKelas();
        
        req.setAttribute("listKelas", dataKelas); 
        req.getRequestDispatcher("/pages/kelas/index.jsp").forward(req, resp);
    }
    
    
}
