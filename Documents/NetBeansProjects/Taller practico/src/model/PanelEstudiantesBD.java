package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class PanelEstudiantesBD {
    
    public void insertarEstudiante(String codigo, String nombre) {
        ConexionDB con = new ConexionDB();
        Connection conexion = con.estableceConexion();

        String sql = "INSERT INTO estudiante (codigo, nombre) VALUES (?, ?)";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, codigo);
            stmt.setString(2, nombre);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar estudiante: " + e.toString());
        }
    }

    public void cargarEstudiantes(DefaultTableModel modelo) {
        ConexionDB con = new ConexionDB();
        Connection conexion = con.estableceConexion();

        String sql = "SELECT * FROM estudiante";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                modelo.addRow(new Object[]{codigo, nombre});
            }
        } catch (Exception e) {
            System.out.println("Error al cargar estudiantes: " + e.toString());
        }
    }
}
