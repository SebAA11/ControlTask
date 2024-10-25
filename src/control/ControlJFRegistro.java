package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.JFRegistro;

public class ControlJFRegistro implements ActionListener {

    JFRegistro v;

    public ControlJFRegistro() {
        this.v = new JFRegistro();
        v.bregistrar.addActionListener(this);
        v.bvolver.addActionListener(this);
        v.setVisible(true);
        v.setLocationRelativeTo(v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.bregistrar) {
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            v.dispose();

        }
        if (e.getSource() == v.bvolver) {
            new ControlJFInicioSesionP();
            v.dispose();
        }
       

    }

}
