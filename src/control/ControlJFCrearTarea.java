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

            String titulo = vista.tTitulo.getText();
            String descripcion = vista.tDescripcion.getText();
            String complejidad = String.valueOf(vista.cComplejidad.getSelectedItem());
            String estado = String.valueOf(vista.cEstado.getSelectedItem());
            String responsable = String.valueOf(vista.cResponsable.getSelectedItem());

           
FormularioDatos datos = new FormularioDatos(titulo, descripcion, complejidad, estado, responsable);

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