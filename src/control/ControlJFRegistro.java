package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.JFRegistro;

public class ControlJFRegistro implements ActionListener {

    JFRegistro v;

    public ControlJFRegistro() {
        this.v = new JFRegistro();
        
        v.setVisible(true);
        v.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.bRegistrar) {
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            v.dispose();

        }
        if (e.getSource() == v.bRegreso) {
            new ControlJFInicioSesion();
            v.dispose();
        }
       

    }

}
