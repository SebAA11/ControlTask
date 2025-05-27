package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class PanelDocentesBD {

    ConexionDB con = new ConexionDB();

    public void insertarDocente(String codigo, String nombre) {
        try {
            Connection cn = con.estableceConexion();
            PreparedStatement ps = cn.prepareStatement("INSERT INTO docente (codigo, nombre) VALUES (?, ?)");
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cargarDocentes(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        try {
            Connection cn = con.estableceConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM docente");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("codigo"), rs.getString("nombre")});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
