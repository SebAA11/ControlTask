package control;
import javax.swing.*;

import vista.JFMenuTareas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class ControlJFMenuTareas implements ActionListener {
    JFMenuTareas vista;

    public ControlJFMenuTareas() {
        this.vista = new JFMenuTareas();
   
        vista.setVisible(true);
        vista.setLocationRelativeTo(vista);
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        
        }

    }
    

  
   
   


