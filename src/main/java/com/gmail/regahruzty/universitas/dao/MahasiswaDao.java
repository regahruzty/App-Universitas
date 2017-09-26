/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gmail.regahruzty.universitas.dao;

import com.gmail.regahruzty.universitas.konfig.KonfigDB;
import com.gmail.regahruzty.universitas.model.Jurusan;
import com.gmail.regahruzty.universitas.model.Kelas;
import com.gmail.regahruzty.universitas.model.Mahasiswa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diani
 */
public class MahasiswaDao {

    public List<Mahasiswa> semuaDataMahasiswa() {
        List<Mahasiswa> listMahasiswa = new ArrayList<>();

        String sql = "Select mhs.id as id_mahasiswa, \n"
                + "mhs.nim as nim_mahasiswa, \n"
                + "mhs.nama as nama_mahasiswa, \n"
                + "kelas.id as id_kelas, \n"
                + "kelas.nama as nama_kelas, \n"
                + "kelas.angkatan as angkatan_kelas, \n"
                + "jur.id as id_jurusan, \n"
                + "jur.nama as nama_jurusan, \n"
                + "from \n"
                + "universitas.mahasiswa mhs join universitas.kelas kelas on (mhs.kelas = kelas.id) \n"
                + "join universitas.jurusan jur on (mhs.jurusan = jur.id)";

        try {
            Connection connection = KonfigDB.getDataSource().getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id_mahasiswa"));
                mhs.setNim(rs.getInt("nim_mahasiswa"));
                mhs.setNama(rs.getString("nama_mahasiswa"));

                Jurusan jur = new Jurusan();
                jur.setId(rs.getInt("id_jurusan"));
                jur.setNama(rs.getString("nama_jurusan"));
                mhs.setJurusan(jur);

                Kelas kelas = new Kelas();
                kelas.setId(rs.getInt("id_kelas"));
                kelas.setNama(rs.getString("nama_kelas"));
                kelas.setAngkatan(rs.getInt("angkatan_kelas"));
                mhs.setKelas(kelas);

                listMahasiswa.add(mhs);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException error) {
            error.printStackTrace();
        }
        return listMahasiswa;

    }

}
