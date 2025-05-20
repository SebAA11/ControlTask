import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import vista.JFMenuTareas;

public class MenuAdmin extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MenuAdmin() {
        setTitle("Menú Administrador");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Paneles
        JPanel panelInicio = new JPanel(new BorderLayout());
        panelInicio.add(new JLabel("Bienvenido, Administrador", JLabel.CENTER), BorderLayout.CENTER);

        JFMenuTareas panelTareas = new JFMenuTareas(); // Tu clase de tickets
        JPanel panelUsuario = new JPanel(new BorderLayout());
        panelUsuario.add(new JLabel("Gestión de Usuarios", JLabel.CENTER), BorderLayout.CENTER);

        // Añadir al contenedor principal
        mainPanel.add(panelInicio, "Inicio");
        mainPanel.add(panelTareas, "Tareas");
        mainPanel.add(panelUsuario, "Usuarios");

        // Botones de navegación
        JPanel panelMenu = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnInicio = new JButton("Inicio");
        JButton btnTareas = new JButton("Tareas");
        JButton btnUsuarios = new JButton("Usuarios");
        JButton btnSalir = new JButton("Cerrar Sesión");

        panelMenu.add(btnInicio);
        panelMenu.add(btnTareas);
        panelMenu.add(btnUsuarios);
        panelMenu.add(btnSalir);

        btnInicio.addActionListener(e -> cardLayout.show(mainPanel, "Inicio"));
        btnTareas.addActionListener(e -> cardLayout.show(mainPanel, "Tareas"));
        btnUsuarios.addActionListener(e -> cardLayout.show(mainPanel, "Usuarios"));
        btnSalir.addActionListener(e -> {
            dispose(); // Cierra esta ventana
            new Login().setVisible(true); // Opcional, si tienes un login
        });

        // Estructura principal
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelMenu, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.CENTER);
    }
}

