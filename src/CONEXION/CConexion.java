
package CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CConexion {
    Connection conectar;
    
    String usuario = "root";
    String contraseña = "kmilo";
    String bd = "inicio";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
    try {
        
        Class.forName("com.mysql.jdbc.Driver");
        conectar = DriverManager.getConnection(cadena,usuario,contraseña);
        //JOptionPane.showMessageDialog(null,"Se conecto correctamente a la base de datos");
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"problemas en la conexion"+ e.toString());
    }
    return conectar;
    }

   
}
