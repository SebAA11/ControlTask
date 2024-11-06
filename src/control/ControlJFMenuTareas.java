package control;

import vista.JFMenuTareas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlJFMenuTareas implements ActionListener {

    JFMenuTareas vista;

    public ControlJFMenuTareas() {
        this.vista = new JFMenuTareas();
        vista.bHacerPedido.addActionListener(this);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.bHacerPedido) {
            new ControlJFCrearTarea();
            vista.dispose();
        }

    }
    
}
