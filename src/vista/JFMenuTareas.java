package vista;

import javax.swing.table.DefaultTableModel;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;


public class JFMenuTareas extends JFrame {

    public JFMenuTareas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        tDescripcion.setLineWrap(true);
        tTitulo.setLineWrap(true);
        
  
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableMenu = new javax.swing.JTable();
        BMover = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cComplejidad = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cEstado = new javax.swing.JComboBox<>();
        cResponsable = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        bCrear = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tTitulo = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(81, 204, 249));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLICK.png"))); // NOI18N
        jButton1.setText("Taskboard");
        jButton1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButton1.setMaximumSize(new java.awt.Dimension(600, 519));
        jButton1.setMinimumSize(new java.awt.Dimension(600, 519));
        jButton1.setPreferredSize(new java.awt.Dimension(318, 222));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ControlTask.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(466, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 780));

        jPanel6.setBackground(new java.awt.Color(102, 204, 255));

        JTableMenu.setBackground(new java.awt.Color(102, 204, 255));
        JTableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Por hacer", "En progreso", "Terminado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTableMenu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JTableMenuAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                JTableMenuAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JTableMenu.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                JTableMenuVetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(JTableMenu);

        BMover.setBackground(new java.awt.Color(102, 204, 255));
        BMover.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BMover.setForeground(new java.awt.Color(255, 255, 255));
        BMover.setText("Mover Tarea");
        BMover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BMover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMoverActionPerformed(evt);
            }
        });

        BEliminar.setBackground(new java.awt.Color(255, 0, 51));
        BEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BEliminar.setText("Eliminar");
        BEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(BMover, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("TASKBOARD", jPanel2);

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setText("COMPLEJIDAD:");

        cComplejidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cComplejidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Bajo", "Medio", "Alto" }));
        cComplejidad.setToolTipText("EL GRADO DE COMPLEJIDAD CONSIDERADO PARA SU TAREA");
        cComplejidad.setBorder(new javax.swing.border.MatteBorder(null));
        cComplejidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setText("ESTADO:");

        cEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Por hacer", "En progreso", "Terminado" }));
        cEstado.setToolTipText("ESTADO INICIAL DE SU TAREA");
        cEstado.setBorder(new javax.swing.border.MatteBorder(null));
        cEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEstadoActionPerformed(evt);
            }
        });

        cResponsable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cResponsable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Responsable 1", "Responsable 2" }));
        cResponsable.setToolTipText("RESPONSABLE");
        cResponsable.setBorder(new javax.swing.border.MatteBorder(null));
        cResponsable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cResponsableActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setText("RESPONSABLE:");

        bCrear.setBackground(new java.awt.Color(204, 255, 204));
        bCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCrear.setForeground(new java.awt.Color(0, 153, 0));
        bCrear.setText("Crear");
        bCrear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel.setText("TITULO:");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setText("DESCRIPCION:");

        tDescripcion.setColumns(20);
        tDescripcion.setRows(5);
        tDescripcion.setToolTipText("DESCRIPCION DE SU TAREA");
        tDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(tDescripcion);

        tTitulo.setColumns(20);
        tTitulo.setRows(5);
        tTitulo.setToolTipText("TITULO DE LA TAREA A CREAR");
        tTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tTitulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tTituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tTitulo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(cComplejidad, 0, 112, Short.MAX_VALUE)))
                        .addGap(341, 341, 341))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(bCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cComplejidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addGap(64, 64, 64)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(81, 81, 81)
                        .addComponent(bCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(233, 233, 233))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CREAR TAREA", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 980, 750));

        jLabel20.setBackground(new java.awt.Color(172, 4, 4));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_Login.jpg"))); // NOI18N
        jLabel20.setIconTextGap(5);
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEstadoActionPerformed

    private void cResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cResponsableActionPerformed

    private void BMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMoverActionPerformed
        // TODO add your handling code here:
    DefaultTableModel tblModel = (DefaultTableModel) JTableMenu.getModel();
    int selectedRow = JTableMenu.getSelectedRow();
    int selectedColumn = JTableMenu.getSelectedColumn();

    if (selectedRow == -1 || selectedColumn == -1 || JTableMenu.getValueAt(selectedRow, selectedColumn) == null) {
        JOptionPane.showMessageDialog(null, "Seleccione una tarea para mover.");
        return;
    }
      // Verificación de que la celda seleccionada contiene una tarea (no está vacía)
        Object tareaObj = tblModel.getValueAt(selectedRow, selectedColumn);
        if (tareaObj == null || tareaObj.toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La celda seleccionada está vacía. Por favor, seleccione una tarea válida.");
            return;
        }

 // Convertimos el objeto a String (si la celda no está vacía)
        String tarea = tareaObj.toString();
        String[] opciones = {"Por hacer", "En progreso", "Terminado"};
        
        // Mostrar ventana de selección de columna
        String nuevaColumna = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione a qué columna mover la tarea:",
                "Mover Tarea",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[selectedColumn]  // Columna actual como predeterminada
        );
 

    if (nuevaColumna == null) return;

    int targetColumn = 0;
    switch (nuevaColumna) {
        case "En progreso":
            targetColumn = 1;
            break;
        case "Terminado":
            targetColumn = 2;
            break;
    }

    if (selectedColumn != targetColumn) {
        JTableMenu.setValueAt(null, selectedRow, selectedColumn);
        JTableMenu.setValueAt(tarea, selectedRow, targetColumn);
        JOptionPane.showMessageDialog(null, "La tarea ha sido movida exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "La tarea ya está en la columna seleccionada.");
    }
    }//GEN-LAST:event_BMoverActionPerformed

    private void JTableMenuVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_JTableMenuVetoableChange
      
    }//GEN-LAST:event_JTableMenuVetoableChange

    private void JTableMenuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTableMenuAncestorAdded

    
       
    }//GEN-LAST:event_JTableMenuAncestorAdded

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        // TODO add your handling code here:
        if(tTitulo.getText().equals("")||tDescripcion.getText().equals("")||cComplejidad.getSelectedItem().equals("Seleccione")||cEstado.getSelectedItem().equals("Seleccione")||cResponsable.getSelectedItem().equals("Seleccione")){
             JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
        }else{
             String data = tTitulo.getText() + " - " + tDescripcion.getText() + " - " + cComplejidad.getSelectedItem() + " - " + cEstado.getSelectedItem() + " - " + cResponsable.getSelectedItem();
           
           int columnIndex = 0; // Por defecto, "Por hacer"
    String estado = cEstado.getSelectedItem().toString();
    if (estado.equals("En progreso")) {
        columnIndex = 1;
    } else if (estado.equals("Terminado")) {
        columnIndex = 2;
    }
    
    // Obtenemos el modelo de la tabla
    DefaultTableModel tblModel = (DefaultTableModel) JTableMenu.getModel();
    
    // Añadimos una nueva fila si no existe suficiente espacio en la tabla
    if (tblModel.getRowCount() == 0 || tblModel.getRowCount() <= tblModel.getRowCount()) {
        tblModel.addRow(new Object[]{"", "", ""}); // Agrega una fila vacía con tres columnas
    }
    
    // Asignamos el valor a la celda específica de la columna adecuada
    tblModel.setValueAt(data, tblModel.getRowCount() - 1, columnIndex);
    
    JOptionPane.showMessageDialog(this, "Se creó la tarea exitosamente.");
            
            tTitulo.setText("");
            tDescripcion.setText("");
            cComplejidad.setSelectedItem("");
            cEstado.setSelectedItem("");
            cResponsable.setSelectedItem("");
        }
    }//GEN-LAST:event_bCrearActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)  JTableMenu.getModel();
        
        if(JTableMenu.getSelectedRowCount()==1){
            
            tblModel.removeRow(JTableMenu.getSelectedRow());
             }else{
            if(JTableMenu.getRowCount()==0){
                
                JOptionPane.showMessageDialog(this, "La tabla esta vacia.");
            }else{
                JOptionPane.showMessageDialog(this, "Porfavor selecciona la tarea a eliminar.");
            }
            
            
        }
    }//GEN-LAST:event_BEliminarActionPerformed

    private void JTableMenuAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTableMenuAncestorMoved
        // TODO add your handling code here:
        
        JTableMenu.getTableHeader().setReorderingAllowed(false);
    }//GEN-LAST:event_JTableMenuAncestorMoved

    private void tTituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tTituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tTituloAncestorAdded

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
            java.util.logging.Logger.getLogger(JFMenuTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuTareas().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BMover;
    private javax.swing.JTable JTableMenu;
    public javax.swing.JButton bCrear;
    public javax.swing.JComboBox<String> cComplejidad;
    public javax.swing.JComboBox<String> cEstado;
    public javax.swing.JComboBox<String> cResponsable;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea tDescripcion;
    private javax.swing.JTextArea tTitulo;
    // End of variables declaration//GEN-END:variables
}
