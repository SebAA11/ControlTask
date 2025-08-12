import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import vista.JFMenuTareas;

public class MenuUsuario extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MenuUsuario() {
        setTitle("Menú Usuario");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel panelInicio = new JPanel(new BorderLayout());
        panelInicio.add(new JLabel("Bienvenido, Usuario", JLabel.CENTER), BorderLayout.CENTER);

        JFMenuTareas panelTareas = new JFMenuTareas();

        mainPanel.add(panelInicio, "Inicio");
        mainPanel.add(panelTareas, "Tareas");

        JPanel panelMenu = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnInicio = new JButton("Inicio");
        JButton btnTareas = new JButton("Tareas");
        JButton btnSalir = new JButton("Cerrar Sesión");

        panelMenu.add(btnInicio);
        panelMenu.add(btnTareas);
        panelMenu.add(btnSalir);

        btnInicio.addActionListener(e -> cardLayout.show(mainPanel, "Inicio"));
        btnTareas.addActionListener(e -> cardLayout.show(mainPanel, "Tareas"));
        btnSalir.addActionListener(e -> {
            dispose();
            new Login().setVisible(true);
        });

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelMenu, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);
    }
}

