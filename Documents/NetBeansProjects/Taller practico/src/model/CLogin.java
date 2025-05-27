
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.MenuRegistro;

public class CLogin {
    
    public void validaUsuario(JTextField usuario, JPasswordField contraseña, javax.swing.JFrame loginFrame){
    
               try {
            ResultSet rs=null; 
            PreparedStatement ps= null;
            
            model.ConexionDB objetoConexion  = new model.ConexionDB();
            
            String consulta= "select * from Usuarios where Usuarios.ingresoUsuario= (?) and Usuarios.ingresoContraseña=(?);";
            ps=objetoConexion.estableceConexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contraseña.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            
            rs = ps.executeQuery();
            
            if (rs.next()){
                
                String nombreUsuario = rs.getString("ingresoUsuario");
                JOptionPane.showMessageDialog(null, "El usuario es correcto");
                MenuRegistro objetoMenu = new MenuRegistro(nombreUsuario);
                objetoMenu.setVisible(true);
                loginFrame.dispose();  
                

            }else{
            JOptionPane.showMessageDialog(null, "El usuario es incorrecto, vuelva a intentar");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+ e.toString());
        
        }
    
    }
}


