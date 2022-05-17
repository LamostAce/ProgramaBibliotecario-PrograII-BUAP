/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalpii;

import java.awt.BorderLayout;
import static proyectofinalpii.PanelPrincipal.previewPanel;
import CONTROL.*;
import modelado.*;

/**
 *
 * @author crack
 */
public class AddLibro extends javax.swing.JPanel {

    /**
     * Creates new form AddLibro
     */
    public AddLibro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxNombreLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxEdicion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxEditorial = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 4, 35));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Libro");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jtxtId.setText("Ingrese ID del libro.");
        jtxtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxtIdMousePressed(evt);
            }
        });
        jtxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdActionPerformed(evt);
            }
        });
        add(jtxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 124, 189, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jtxNombreLibro.setText("Ingrese el nombre del libro.");
        jtxNombreLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxNombreLibroMousePressed(evt);
            }
        });
        jtxNombreLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNombreLibroActionPerformed(evt);
            }
        });
        add(jtxNombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 188, 189, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autor");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jtxAutor.setText("Ingrese autor.");
        jtxAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxAutorMousePressed(evt);
            }
        });
        jtxAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxAutorActionPerformed(evt);
            }
        });
        add(jtxAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 260, 189, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edición");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jtxEdicion.setText("Ingrese la edición.");
        jtxEdicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxEdicionMousePressed(evt);
            }
        });
        jtxEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEdicionActionPerformed(evt);
            }
        });
        add(jtxEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 124, 241, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editorial");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jtxEditorial.setText("Ingrese la editorial.");
        jtxEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtxEditorialMousePressed(evt);
            }
        });
        jtxEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEditorialActionPerformed(evt);
            }
        });
        add(jtxEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 188, 241, -1));

        jPanel1.setBackground(new java.awt.Color(35, 35, 91));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Agregar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NUEVO LIBRO");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdActionPerformed

    private void jtxNombreLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNombreLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNombreLibroActionPerformed

    private void jtxAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxAutorActionPerformed

    private void jtxEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEdicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEdicionActionPerformed

    private void jtxEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEditorialActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
                
        //SNIPPET DE CÓDIGO QUE OBTIENE LOS DATOS DE LOS INPUTS Y LOS AÑADE AL ALMACÉN.
        int    IdLibro = Integer.parseInt(jtxtId.getText());
        String NombreLibro = jtxNombreLibro.getText();
        String Edicion = jtxEdicion.getText();
        String Autor = jtxAutor.getText();
        String Editorial = jtxEditorial.getText();
        Libro NewLibro = new Libro(IdLibro, true, NombreLibro, Autor, Edicion, Editorial);
        Main.Storage.Libros.add(NewLibro);
        System.out.println(Main.Storage.Libros.peekLast());
        //------------------------------------------------------

        //ESTE CODIGO REGRESA A LA LISTA DE USUARIOS
        Libros p1 = new Libros();
        p1.setSize(750, 430);
        p1.setLocation(0, 0);

        previewPanel.removeAll();
        previewPanel.add(p1, BorderLayout.CENTER);
        previewPanel.revalidate();
        previewPanel.repaint();
        //----------------------------------------------
    }//GEN-LAST:event_jPanel1MousePressed

    private void jtxtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtIdMousePressed
       if(jtxtId.getText().equals("Ingrese ID del libro."))
        jtxtId.setText("");
    }//GEN-LAST:event_jtxtIdMousePressed

    private void jtxNombreLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxNombreLibroMousePressed
        if(jtxNombreLibro.getText().equals("Ingrese el nombre del libro."))
        jtxNombreLibro.setText("");
    }//GEN-LAST:event_jtxNombreLibroMousePressed

    private void jtxAutorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxAutorMousePressed
    if(jtxAutor.getText().equals("Ingrese autor."))
        jtxAutor.setText("");
    }//GEN-LAST:event_jtxAutorMousePressed

    private void jtxEdicionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxEdicionMousePressed
        if(jtxEdicion.getText().equals("Ingrese la edición."))
        jtxEdicion.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEdicionMousePressed

    private void jtxEditorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxEditorialMousePressed
        if(jtxEditorial.getText().equals("Ingrese la editorial."))
        jtxEditorial.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEditorialMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxAutor;
    private javax.swing.JTextField jtxEdicion;
    private javax.swing.JTextField jtxEditorial;
    private javax.swing.JTextField jtxNombreLibro;
    private javax.swing.JTextField jtxtId;
    // End of variables declaration//GEN-END:variables
}