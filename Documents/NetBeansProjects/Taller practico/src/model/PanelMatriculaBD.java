package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class PanelMatriculaBD {

    ConexionDB con = new ConexionDB();

    public void insertarMatricula(String estudiante, String curso, double nota) {
        try {
            Connection cn = con.estableceConexion();
            PreparedStatement ps = cn.prepareStatement("INSERT INTO matricula (estudiante, curso, nota) VALUES (?, ?, ?)");
            ps.setString(1, estudiante);
            ps.setString(2, curso);
            ps.setDouble(3, nota);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cargarMatriculas(DefaultTableModel modelo) {
        modelo.setRowCount(0);
        try {
            Connection cn = con.estableceConexion();
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM matricula");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("estudiante"),
                    rs.getString("curso"),
                    rs.getDouble("nota")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
