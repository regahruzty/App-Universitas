/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.regahruzty.universitas.controller;

import com.gmail.regahruzty.universitas.dao.MahasiswaDao;
import com.gmail.regahruzty.universitas.model.Mahasiswa;
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
@WebServlet(urlPatterns = {"/mahasiswa/list"})
public class MahasiswaListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.

        MahasiswaDao mahasiswaDao = new MahasiswaDao();
        List<Mahasiswa> listMahasiswa = mahasiswaDao.semuaDataMahasiswa();
        req.setAttribute("listMahasiswa", listMahasiswa);
        req.getRequestDispatcher("/pages/mahasiswa/index.jsp").forward(req, resp);

    }

}
