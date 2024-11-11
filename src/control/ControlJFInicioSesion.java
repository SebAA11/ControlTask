package control;

import vista.JFInicioSesionP;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControlJFInicioSesion implements ActionListener {

    JFInicioSesionP v;

    public ControlJFInicioSesion() {
        this.v = new JFInicioSesionP();

        v.bInicio.addActionListener(this);
        v.bRegistro.addActionListener(this);
        v.bSalir.addActionListener(this);
        v.setVisible(true);
        v.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.bInicio) {
            new ControlJFMenuTareas();
            v.dispose();

        }
        if (e.getSource() == v.bRegistro) {
            new ControlJFRegistro();
            v.dispose();
        }
        if (e.getSource() == v.bSalir) {
            System.exit(0);
        }
    }
}
