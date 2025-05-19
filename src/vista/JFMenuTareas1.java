package vista;

import controlador.ControladorJFMenuTareas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFMenuTareas1 extends JFrame {
    controlador.ControladorJFMenuTareas ControladorJFMenuTareas= new ControladorJFMenuTareas();
    
        public JFMenuTareas1() {
        initComponents();
       
    }
    public JFMenuTareas1(String nombreUsuario) {
        initComponents();
        jLabelNombreUsuario.setText("Bienvenido, " + nombreUsuario);
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        bCrearT.setFocusPainted(false);
        bForms.setFocusPainted(false);
        bTicket.setFocusPainted(false);
        bUsuario.setFocusPainted(false);
       
          // Colores para el hover
        Color colorSalir = new Color (255,255,255);
        Color colorDefault = new Color(40, 44, 92);  // Color por defecto del texto
        Color colorHover = new Color(0, 212, 216);   // Color al hacer hover

        // Agregar el efecto hover a los botones
    addHoverEffect(bTicket, colorDefault, colorHover, "/Imagenes/verTickets.png", "/Imagenes/verTicketsHover.png");
    addHoverEffect(bCrearT, colorDefault, colorHover, "/Imagenes/agregarTarea.png", "/Imagenes/agregarTareaHover.png");
    addHoverEffect(bForms, colorDefault, colorHover, "/Imagenes/Forms.png", "/Imagenes/FormsHover.png");
    addHoverEffect(bUsuario, colorDefault, colorHover, "/Imagenes/usuario.png", "/Imagenes/usuarioHover.png");
    addHoverEffect(bSalir6, colorSalir, colorSalir, "/Imagenes/salir.png", "/Imagenes/salirHover.png");
    }
    
public void agregarTicketVisual(JPanel contenedor, String titulo, String estado, String responsable, String descripcion, String categoria) {
    JPanel ticket = new JPanel();
    ticket.setLayout(new BoxLayout(ticket, BoxLayout.Y_AXIS));
    ticket.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    ticket.setBackground(Color.WHITE);
    ticket.setAlignmentX(Component.LEFT_ALIGNMENT);
    ticket.setMaximumSize(new Dimension(1080, 100)); // Ajusta según tu diseño

    JLabel lblTitulo = new JLabel("📎 Titulo: " + titulo);
    JLabel lblDetalles = new JLabel("📂 Categoria: " + categoria + "  ||  👤  Responsable: " + responsable + "  ||  💹  Estado: " + estado);
    JLabel lblExtra = new JLabel("📃 Descripcion: " + descripcion);

    // Panel para los botones
    JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton BMover = new JButton("Mover a...");
    JButton BEliminar = new JButton("Eliminar");

    // Funcionalidad para botón MOVER
    BMover.addActionListener(e -> {
        String[] opciones = {"Abierto", "En progreso", "Cerrado"};
        String nuevoEstado = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione el nuevo estado:",
            "Mover ticket",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            estado
        );

        if (nuevoEstado != null && !nuevoEstado.equals(estado)) {
            contenedor.remove(ticket); // Elimina del panel actual

            // Agrega al nuevo panel según el estado
            if (nuevoEstado.equals("Abierto")) {
                agregarTicketVisual(JPanelAbierto, titulo, nuevoEstado, responsable, descripcion, categoria);
            } else if (nuevoEstado.equals("En progreso")) {
                agregarTicketVisual(JPanelProgreso, titulo, nuevoEstado, responsable, descripcion, categoria);
            } else if (nuevoEstado.equals("Cerrado")) {
                agregarTicketVisual(JPanelCerrado, titulo, nuevoEstado, responsable, descripcion, categoria);
            }

            contenedor.revalidate();
            contenedor.repaint();
        }
    });

    // Funcionalidad para botón ELIMINAR
    BEliminar.addActionListener(e -> {
        int confirm = JOptionPane.showConfirmDialog(
            null,
            "¿Está seguro de eliminar este ticket?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION
        );
        if (confirm == JOptionPane.YES_OPTION) {
            contenedor.remove(ticket);
            contenedor.revalidate();
            contenedor.repaint();
        }
    });

    // Agrega los botones al panel de botones
    panelBotones.add(BMover);
    panelBotones.add(BEliminar);

    // Agrega los componentes al ticket
    ticket.add(lblTitulo);
    ticket.add(lblDetalles);
    ticket.add(lblExtra);
    ticket.add(panelBotones);

    // Agrega el ticket al contenedor
    contenedor.add(ticket);
    contenedor.revalidate();
    contenedor.repaint();

}
    // Método para agregar el efecto hover a los botones
private void addHoverEffect(JButton button, Color colorDefault, Color colorHover, String iconDefault, String iconHover) {
    button.addMouseListener(new MouseAdapter() {
        
        @Override
        public void mouseEntered(MouseEvent e) {
            button.setForeground(colorHover);  // Cambiar color del texto
            button.setBorder(BorderFactory.createMatteBorder(0, 3, 0, 0, colorHover));  // Borde izquierdo
            button.setIcon(new ImageIcon(getClass().getResource(iconHover))); // Cambiar icono al hacer hover
        }

        @Override
        public void mouseExited(MouseEvent e) {
            button.setForeground(colorDefault);  // Restaurar color del texto
            button.setBorder(BorderFactory.createEmptyBorder());  // Eliminar borde
            button.setIcon(new ImageIcon(getClass().getResource(iconDefault))); // Restaurar icono original
        }
     
              
    });
    
}
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        JPanelMenu = new javax.swing.JPanel();
        bTicket = new javax.swing.JButton();
        bUsuario = new javax.swing.JButton();
        bCrearT = new javax.swing.JButton();
        bForms = new javax.swing.JButton();
        bSalir6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanelCard = new javax.swing.JPanel();
        JPanelUsuario = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNombreUsuario = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        JPanelForms = new javax.swing.JPanel();
        JPanelCrearT = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tDescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        cCategoria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cEstado = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cResponsable = new javax.swing.JComboBox<>();
        bCrear = new javax.swing.JButton();
        tTitulo = new javax.swing.JTextField();
        JPanelTicket = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JPanelPrincipalTickets = new javax.swing.JPanel();
        JPanelAbierto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPanelProgreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JPanelCerrado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 212, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        JPanelMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(40, 44, 92)));
        JPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bTicket.setBackground(new java.awt.Color(255, 255, 255));
        bTicket.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        bTicket.setForeground(new java.awt.Color(40, 44, 92));
        bTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verTickets.png"))); // NOI18N
        bTicket.setText("Tickets");
        bTicket.setBorder(null);
        bTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bTicket.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bTicket.setIconTextGap(6);
        bTicket.setMargin(new java.awt.Insets(1, 1, 1, 1));
        bTicket.setMaximumSize(new java.awt.Dimension(600, 519));
        bTicket.setMinimumSize(new java.awt.Dimension(600, 519));
        bTicket.setPreferredSize(new java.awt.Dimension(318, 222));
        bTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTicketActionPerformed(evt);
            }
        });
        JPanelMenu.add(bTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 220, 40));

        bUsuario.setBackground(new java.awt.Color(255, 255, 255));
        bUsuario.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        bUsuario.setForeground(new java.awt.Color(40, 44, 92));
        bUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        bUsuario.setText("Usuario");
        bUsuario.setBorder(null);
        bUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bUsuario.setIconTextGap(6);
        bUsuario.setMargin(new java.awt.Insets(1, 1, 1, 1));
        bUsuario.setMaximumSize(new java.awt.Dimension(600, 519));
        bUsuario.setMinimumSize(new java.awt.Dimension(600, 519));
        bUsuario.setPreferredSize(new java.awt.Dimension(318, 222));
        bUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bUsuarioMouseClicked(evt);
            }
        });
        bUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuarioActionPerformed(evt);
            }
        });
        JPanelMenu.add(bUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 220, 40));

        bCrearT.setBackground(new java.awt.Color(255, 255, 255));
        bCrearT.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        bCrearT.setForeground(new java.awt.Color(40, 44, 92));
        bCrearT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarTarea.png"))); // NOI18N
        bCrearT.setText("  Crear una tarea");
        bCrearT.setBorder(null);
        bCrearT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCrearT.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bCrearT.setIconTextGap(6);
        bCrearT.setMargin(new java.awt.Insets(1, 1, 1, 1));
        bCrearT.setMaximumSize(new java.awt.Dimension(600, 519));
        bCrearT.setMinimumSize(new java.awt.Dimension(600, 519));
        bCrearT.setPreferredSize(new java.awt.Dimension(318, 222));
        bCrearT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearTActionPerformed(evt);
            }
        });
        JPanelMenu.add(bCrearT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, 40));

        bForms.setBackground(new java.awt.Color(255, 255, 255));
        bForms.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        bForms.setForeground(new java.awt.Color(40, 44, 92));
        bForms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Forms.png"))); // NOI18N
        bForms.setText("Forms");
        bForms.setBorder(null);
        bForms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bForms.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bForms.setIconTextGap(6);
        bForms.setMargin(new java.awt.Insets(1, 1, 1, 1));
        bForms.setMaximumSize(new java.awt.Dimension(600, 519));
        bForms.setMinimumSize(new java.awt.Dimension(600, 519));
        bForms.setPreferredSize(new java.awt.Dimension(318, 222));
        bForms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFormsActionPerformed(evt);
            }
        });
        JPanelMenu.add(bForms, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, 40));

        bSalir6.setBackground(new java.awt.Color(255, 255, 255));
        bSalir6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        bSalir6.setForeground(new java.awt.Color(255, 255, 255));
        bSalir6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        bSalir6.setBorder(null);
        bSalir6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSalir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalir6ActionPerformed(evt);
            }
        });
        JPanelMenu.add(bSalir6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, 70, 70));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ControlTask.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JPanelMenu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 170));

        jPanel2.add(JPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 760));

        jPanelCard.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCard.setLayout(new java.awt.CardLayout());

        JPanelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        JPanelUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(40, 44, 92)));
        JPanelUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(40, 44, 92));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 212, 216)));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil-del-usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(76, 76, 76))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );

        JPanelUsuario.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 410, 560));

        jPanel1.setBackground(new java.awt.Color(0, 212, 216));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(40, 44, 92)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ControlTask.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 152));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 44, 92));
        jLabel2.setText("Usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 212, 216));
        jSeparator1.setForeground(new java.awt.Color(40, 44, 92));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 325, 10));

        jLabelNombreUsuario.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        jLabelNombreUsuario.setForeground(new java.awt.Color(40, 44, 92));
        jPanel1.add(jLabelNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 230, 25));

        bSalir.setBackground(new java.awt.Color(255, 106, 101));
        bSalir.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        bSalir.setForeground(new java.awt.Color(204, 0, 0));
        bSalir.setText("Cerrar Sesión");
        bSalir.setBorder(null);
        bSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        jPanel1.add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 110, 30));

        JPanelUsuario.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 440, 560));

        jPanelCard.add(JPanelUsuario, "card3");

        JPanelForms.setBackground(new java.awt.Color(255, 255, 255));
        JPanelForms.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(40, 44, 92)));
        JPanelForms.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelCard.add(JPanelForms, "card2");

        JPanelCrearT.setBackground(new java.awt.Color(255, 255, 255));
        JPanelCrearT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(40, 44, 92)));
        JPanelCrearT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(40, 44, 92));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setAlignmentY(1.0F);
        JPanelCrearT.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 790, 20));

        jLabel.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel.setForeground(new java.awt.Color(40, 44, 92));
        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Titulo.png"))); // NOI18N
        jLabel.setText("Titulo:");
        JPanelCrearT.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(40, 44, 92));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Descripcion.png"))); // NOI18N
        jLabel12.setText("Descripción:");
        JPanelCrearT.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        tDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        tDescripcion.setColumns(20);
        tDescripcion.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        tDescripcion.setForeground(new java.awt.Color(40, 44, 92));
        tDescripcion.setRows(5);
        tDescripcion.setToolTipText("Descripción breve de su ticket");
        tDescripcion.setBorder(null);
        tDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(tDescripcion);

        JPanelCrearT.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 800, 190));

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(40, 44, 92));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Categoria.png"))); // NOI18N
        jLabel8.setText("Categoria:");
        JPanelCrearT.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        cCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cCategoria.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        cCategoria.setForeground(new java.awt.Color(40, 44, 92));
        cCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Falla de acceso a aplicativos", "Novedades técnicas", "Error en el agendamiento de la visita", "Cancelar orden de visita", "Modificar dirección de visita", "Cambio de estado de la orden", "Registrar números adicionales", "Reactivar orden del cliente" }));
        cCategoria.setToolTipText("Seleccione la categoria de su ticket");
        cCategoria.setBorder(null);
        cCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCategoriaActionPerformed(evt);
            }
        });
        JPanelCrearT.add(cCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 790, -1));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(40, 44, 92));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estado.png"))); // NOI18N
        jLabel9.setText("Estado:");
        JPanelCrearT.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        cEstado.setBackground(new java.awt.Color(255, 255, 255));
        cEstado.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        cEstado.setForeground(new java.awt.Color(40, 44, 92));
        cEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Abierto", "En progreso", "Cerrado" }));
        cEstado.setToolTipText("Seleccione el estado inicial de su ticket");
        cEstado.setBorder(null);
        cEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEstadoActionPerformed(evt);
            }
        });
        JPanelCrearT.add(cEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 790, -1));

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(40, 44, 92));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Responsable.png"))); // NOI18N
        jLabel11.setText("Asignado a:");
        JPanelCrearT.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 30));

        cResponsable.setBackground(new java.awt.Color(255, 255, 255));
        cResponsable.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        cResponsable.setForeground(new java.awt.Color(40, 44, 92));
        cResponsable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Responsable 1", "Responsable 2", "Responsable 3", "Responsable 4" }));
        cResponsable.setToolTipText("Seleccione el responsable del ticket");
        cResponsable.setBorder(null);
        cResponsable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cResponsableActionPerformed(evt);
            }
        });
        JPanelCrearT.add(cResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 790, -1));

        bCrear.setBackground(new java.awt.Color(204, 255, 204));
        bCrear.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        bCrear.setForeground(new java.awt.Color(0, 153, 0));
        bCrear.setText("Crear");
        bCrear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });
        JPanelCrearT.add(bCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, 120, 30));

        tTitulo.setBackground(new java.awt.Color(255, 255, 255));
        tTitulo.setFont(new java.awt.Font("Nirmala UI", 0, 15)); // NOI18N
        tTitulo.setForeground(new java.awt.Color(40, 44, 92));
        tTitulo.setBorder(null);
        tTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTituloActionPerformed(evt);
            }
        });
        JPanelCrearT.add(tTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 790, 30));

        jPanelCard.add(JPanelCrearT, "card4");

        JPanelTicket.setBackground(new java.awt.Color(255, 255, 255));
        JPanelTicket.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(40, 44, 92)));
        JPanelTicket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setRowHeaderView(null);
        jScrollPane2.setViewportView(JPanelPrincipalTickets);

        JPanelPrincipalTickets.setBackground(new java.awt.Color(255, 255, 255));
        JPanelPrincipalTickets.setForeground(new java.awt.Color(255, 255, 255));
        JPanelPrincipalTickets.setLayout(new javax.swing.BoxLayout(JPanelPrincipalTickets, javax.swing.BoxLayout.Y_AXIS));

        JPanelAbierto.setBackground(new java.awt.Color(0, 212, 216));
        JPanelAbierto.setLayout(new javax.swing.BoxLayout(JPanelAbierto, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 44, 92));
        jLabel1.setText("● Abierto");
        jLabel1.setMaximumSize(new java.awt.Dimension(1056, 21));
        jLabel1.setPreferredSize(new java.awt.Dimension(66, 200));
        JPanelAbierto.add(jLabel1);

        JPanelPrincipalTickets.add(JPanelAbierto);

        JPanelProgreso.setBackground(new java.awt.Color(0, 212, 216));
        JPanelProgreso.setLayout(new javax.swing.BoxLayout(JPanelProgreso, javax.swing.BoxLayout.Y_AXIS));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 44, 92));
        jLabel3.setText("● En progreso");
        jLabel3.setMaximumSize(new java.awt.Dimension(1056, 21));
        JPanelProgreso.add(jLabel3);

        JPanelPrincipalTickets.add(JPanelProgreso);

        JPanelCerrado.setBackground(new java.awt.Color(0, 212, 216));
        JPanelCerrado.setLayout(new javax.swing.BoxLayout(JPanelCerrado, javax.swing.BoxLayout.Y_AXIS));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(40, 44, 92));
        jLabel4.setText("● Cerrado");
        jLabel4.setMaximumSize(new java.awt.Dimension(1056, 21));
        JPanelCerrado.add(jLabel4);

        JPanelPrincipalTickets.add(JPanelCerrado);

        jScrollPane2.setViewportView(JPanelPrincipalTickets);

        JPanelTicket.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1060, 760));

        jPanelCard.add(JPanelTicket, "card5");

        jPanel2.add(jPanelCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1070, 760));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 760));
        jPanel2.getAccessibleContext().setAccessibleName("");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTicketActionPerformed
        // TODO add your handling code here:
        ControladorJFMenuTareas.hide_panel(JPanelTicket, JPanelUsuario, JPanelForms, JPanelCrearT);
        JPanelTicket.setVisible(true);
        
    }//GEN-LAST:event_bTicketActionPerformed

    private void bCrearTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearTActionPerformed
        // TODO add your handling code here:
        ControladorJFMenuTareas.hide_panel(JPanelTicket, JPanelUsuario, JPanelForms, JPanelCrearT);
        JPanelCrearT.setVisible(true);
        
        
    }//GEN-LAST:event_bCrearTActionPerformed

    private void bFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFormsActionPerformed
        // TODO add your handling code here:         
        ControladorJFMenuTareas.hide_panel(JPanelTicket, JPanelUsuario, JPanelForms, JPanelCrearT);
        JPanelForms.setVisible(true);
        
    
    }//GEN-LAST:event_bFormsActionPerformed

    private void bUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuarioActionPerformed
        // TODO add your handling code here:    
        ControladorJFMenuTareas.hide_panel(JPanelTicket, JPanelUsuario, JPanelForms, JPanelCrearT);
        JPanelUsuario.setVisible(true);
        
    }//GEN-LAST:event_bUsuarioActionPerformed

    private void bSalir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalir6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bSalir6ActionPerformed

    private void bUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bUsuarioMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_bUsuarioMouseClicked

    private void cEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEstadoActionPerformed

    private void cResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cResponsableActionPerformed

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        // TODO add your handling code here:
if (tTitulo.getText().equals("") ||
    tDescripcion.getText().equals("") ||
    cCategoria.getSelectedItem().equals("Seleccione") ||
    cEstado.getSelectedItem().equals("Seleccione") ||
    cResponsable.getSelectedItem().equals("Seleccione")) {

    JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");

} else {
    String titulo = tTitulo.getText().trim();
    String descripcion = tDescripcion.getText().trim();
    String categoria = cCategoria.getSelectedItem().toString();
    String estado = cEstado.getSelectedItem().toString();
    String responsable = cResponsable.getSelectedItem().toString();

    // Insertar visualmente en el panel correspondiente
    if (estado.equalsIgnoreCase("Abierto")) {
        agregarTicketVisual(JPanelAbierto, titulo, estado, responsable, descripcion, categoria);
    } else if (estado.equalsIgnoreCase("En progreso")) {
        agregarTicketVisual(JPanelProgreso, titulo, estado, responsable, descripcion, categoria);
    } else if (estado.equalsIgnoreCase("Cerrado")) {
        agregarTicketVisual(JPanelCerrado, titulo, estado, responsable, descripcion, categoria);
    }

    JOptionPane.showMessageDialog(this, "Se creó la tarea exitosamente.");

    // Limpiar campos
    tTitulo.setText("");
    tDescripcion.setText("");
    cCategoria.setSelectedIndex(0);
    cEstado.setSelectedIndex(0);
    cResponsable.setSelectedIndex(0);
}
    }//GEN-LAST:event_bCrearActionPerformed

    private void tTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTituloActionPerformed

    private void cCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCategoriaActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
        // Abre la ventana de inicio de sesión
    JFInicioSesionP inicioSesion = new JFInicioSesionP();
    inicioSesion.setVisible(true);
    inicioSesion.setLocationRelativeTo(null); // centra la ventana

    // Cierra la ventana actual (el menú)
    this.dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    /**
     * @param args the command line arguments
     */
      
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMenuTareas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuTareas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuTareas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuTareas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuTareas1().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelAbierto;
    private javax.swing.JPanel JPanelCerrado;
    private javax.swing.JPanel JPanelCrearT;
    private javax.swing.JPanel JPanelForms;
    public javax.swing.JPanel JPanelMenu;
    private javax.swing.JPanel JPanelPrincipalTickets;
    private javax.swing.JPanel JPanelProgreso;
    private javax.swing.JPanel JPanelTicket;
    private javax.swing.JPanel JPanelUsuario;
    public javax.swing.JButton bCrear;
    public javax.swing.JButton bCrearT;
    public javax.swing.JButton bForms;
    public javax.swing.JButton bSalir;
    public javax.swing.JButton bSalir6;
    public javax.swing.JButton bTicket;
    public javax.swing.JButton bUsuario;
    public javax.swing.JComboBox<String> cCategoria;
    public javax.swing.JComboBox<String> cEstado;
    public javax.swing.JComboBox<String> cResponsable;
    private javax.swing.JInternalFrame jInternalFrame1;
    public javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCard;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea tDescripcion;
    private javax.swing.JTextField tTitulo;
    // End of variables declaration//GEN-END:variables
}
