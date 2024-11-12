
package CONEXION;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import vista.JFMenuTareas;

public class CLogin {
    
    public void validaUsuario(JTextField usuario, JPasswordField contraseña){
    
        try {
            ResultSet rs=null; 
            PreparedStatement ps= null;
            
            CONEXION.CConexion objetoConexion  = new CONEXION.CConexion();
            
            String consulta= "select * from Usuarios where Usuarios.ingresoUsuario= (?) and Usuarios.ingresoContraseña=(?);";
            ps=objetoConexion.estableceConexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contraseña.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            
            rs = ps.executeQuery();
            
            if (rs.next()){
                
                JOptionPane.showMessageDialog(null, "El usuario es correcto");
                JFMenuTareas objetoMenu = new JFMenuTareas();
                objetoMenu.setVisible(true);
                

            }else{
            JOptionPane.showMessageDialog(null, "El usuario es incorrecto, vuelva a intentar");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+ e.toString());
        
        }
    }
    
}
