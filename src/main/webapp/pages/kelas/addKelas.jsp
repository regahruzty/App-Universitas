<%-- 
    Document   : addKelas
    Created on : Sep 25, 2017, 2:22:18 PM
    Author     : Diani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Form Kelas</h1>
        <!--${pageContext.servletContext.contextPath}-->
        <form action="${pageContext.servletContext.contextPath}/kelas/new" method="post">
            <div>
                <label for="kelasName">Nama Kelas</label>
                <input type="text" name="kelasName" id="kelasName"
            </div>
            <div>
                <label for="kelasAngkatan">Angkatan</label>
                <input type="text" name="kelasAngkatan" id="kelasAngkatan"
            </div>
            <div>
                <button type="submit">Kirim</button>
                <button type="reset">Reset</button>
            </div>
        </form>
    </body>
</html>
