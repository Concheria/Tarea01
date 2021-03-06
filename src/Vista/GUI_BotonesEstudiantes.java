/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_MantenimientoEstudiantes;

/**
 *
 * @author estudiante
 */
public class GUI_BotonesEstudiantes extends javax.swing.JPanel {

    Controlador_FRM_MantenimientoEstudiantes controlador;
    /**
     * Creates new form GUI_Botones
     */
    public GUI_BotonesEstudiantes() {
        initComponents();
        configInic();
    }

    public void agregarEventosGUI(Controlador_FRM_MantenimientoEstudiantes controlador)
    {
        this.controlador=controlador;
        this.jb_Buscar.addActionListener(controlador);
        this.jb_Agregar.addActionListener(controlador);
        this.jb_Eliminar.addActionListener(controlador);
        this.jb_Modificar.addActionListener(controlador);
    }
    
    public void configInic()
    {
        jb_Agregar.setEnabled(false);
        jb_Eliminar.setEnabled(false);
        jb_Modificar.setEnabled(false);
    }
    
    public void configBusc()
    {
        jb_Modificar.setEnabled(true);
        jb_Eliminar.setEnabled(true);
    }
    
    public void configAgreg()
    {
        jb_Agregar.setEnabled(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Buscar = new javax.swing.JButton();
        jb_Agregar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();

        jb_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jb_Buscar.setActionCommand("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jb_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jb_Agregar.setActionCommand("Agregar");

        jb_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        jb_Modificar.setActionCommand("Modificar");

        jb_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jb_Eliminar.setActionCommand("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Buscar)
                    .addComponent(jb_Agregar)
                    .addComponent(jb_Modificar)
                    .addComponent(jb_Eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Modificar;
    // End of variables declaration//GEN-END:variables
}
