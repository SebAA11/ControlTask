package CONEXION;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TicketBD {

    public int crearTicket(String titulo, String descripcion, String categoria, String estado, String responsable) {
        int idGenerado = -1;
        try {
            CConexion conexion = new CConexion();
            Connection con = conexion.estableceConexion();

            String sql = "INSERT INTO tickets (titulo, descripcion, categoria, estado, responsable) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, titulo);
            ps.setString(2, descripcion);
            ps.setString(3, categoria);
            ps.setString(4, estado);
            ps.setString(5, responsable);

            int filas = ps.executeUpdate();

            if (filas > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    idGenerado = rs.getInt(1);
                }
                rs.close();
            }

            ps.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al insertar ticket: " + ex.getMessage());
        }

        return idGenerado;
    }
    public static ArrayList<Ticket> obtenerTickets() {
    ArrayList<Ticket> lista = new ArrayList<>();
    try {
        CConexion conexion = new CConexion();
        Connection con = conexion.estableceConexion();

        String sql = "SELECT * FROM tickets";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Ticket ticket = new Ticket(
                rs.getInt("id"),
                rs.getString("titulo"),
                rs.getString("descripcion"),
                rs.getString("categoria"),
                rs.getString("estado"),
                rs.getString("responsable")
            );
            lista.add(ticket);
        }

        rs.close();
        ps.close();
        con.close();
    } catch (SQLException ex) {
        System.out.println("Error al obtener tickets: " + ex.getMessage());
    }

    return lista;
}

}