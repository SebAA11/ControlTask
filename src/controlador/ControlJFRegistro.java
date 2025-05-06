package controlador;

  /**package control;

import javax.swing.*;
import vista.JFRegistro;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControlJFRegistro implements ActionListener {

    JFRegistro vista;

    public ControlJFRegistro() {
        this.vista = new JFRegistro();
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.bRegistrar) {
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            vista.dispose();

        }
        if (e.getSource() == vista.bRegreso) {
            new ControlJFInicioSesion();
            vista.dispose();
        }
       

    }

}
   */