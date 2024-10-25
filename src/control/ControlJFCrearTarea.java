package control;

import modelo.FormularioDatos;
import vista.JFCrearTarea;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlJFCrearTarea implements ActionListener {

    JFCrearTarea vista;

    public ControlJFCrearTarea() {
        this.vista = new JFCrearTarea(); 
        vista.bCrear.addActionListener(this);
        vista.bCancelar.addActionListener(this);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.bCrear) {

            String titulo = vista.tProducto.getText();
            String descripcion = vista.tCantidad.getText();
            String tipoPapa = vista.cTipoPapa.getSelectedItem().toString();

           
FormularioDatos datos = new FormularioDatos(titulo, descripcion, tipoPapa);

            JOptionPane.showMessageDialog(vista,
                    datos.obtenerDatos(),
                    "Datos del Formulario", JOptionPane.INFORMATION_MESSAGE);

            vista.dispose();
        }

        if (e.getSource() == vista.bCancelar) {
            vista.dispose();
        }
    }
}