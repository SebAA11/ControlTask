
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionDB {
    private Connection conectar;
    
    private final String usuario = "root";
    private final String contraseña = "041022";
    private final String bd = "escuela-taller"; // CAMBIAR a la BD correcta
    private final String ip = "127.0.0.1";
    private final String puerto = "3306";
    
    private final String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd+"?useSSL=false&serverTimezone=UTC";

    public Connection estableceConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // usa el driver moderno
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            //System.out.println("Conexión exitosa.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la conexión: " + e.toString());
        }
        return conectar;
    }
}
