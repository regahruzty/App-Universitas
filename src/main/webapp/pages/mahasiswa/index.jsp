<%-- 
    Document   : index
    Created on : Sep 26, 2017, 10:42:06 AM
    Author     : Diani
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Daftar Mahasiswa</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Kode</th>
                    <th>Nim</th>
                    <th>Nama</th>
                    <th>Kelas</th>
                    <th>Jurusan</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${listMahasiswa}" var="mhs">
                <tr>
                    <td>${mhs.id}</td>
                    <td>${mhs.nim}</td>
                    <td>${mhs.nama}</td>
                    <td>${mhs.kelas}</td>
                    <td>${mhs.jurusan}</td>
                    <td></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
