package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class PanelCursosBD {

    ConexionDB con = new ConexionDB();

    public void insertarCurso(String codigo, String nombre, String docente) {
        try {
            Connection cn = con.estableceConexion();
            PreparedStatement ps = cn.prepareStatement("INSERT INTO curso (codigo, nombre, docente) VALUES (?, ?, ?)");
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, docente);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cargarCursos(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        try {
            Connection cn = con.estableceConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM curso");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("nombre"), rs.getString("docente")});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
