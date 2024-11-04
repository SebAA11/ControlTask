package control;

import vista.JFInicioSesionP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlJFInicioSesionP implements ActionListener {

    JFInicioSesionP v;

    public ControlJFInicioSesionP() {
        this.v = new JFInicioSesionP();

        v.bEntrar.addActionListener(this);
        v.bRegistro.addActionListener(this);
        v.bsalir.addActionListener(this);
        v.setVisible(true);
        v.setLocationRelativeTo(v);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.bEntrar) {
            new ControlJFMenuTareas();
            v.dispose();

        }
        if (e.getSource() == v.bRegistro) {
            new ControlJFRegistro();
            v.dispose();
        }
        if (e.getSource() == v.bsalir) {
            System.exit(0);
        }
    }
}
