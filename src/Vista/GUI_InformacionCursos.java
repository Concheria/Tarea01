/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_MantenimientoCursos;

/**
 *
 * @author daniel
 */
public class GUI_InformacionCursos extends javax.swing.JPanel {
    Controlador_FRM_MantenimientoCursos controlador;
    /**
     * Creates new form InformacionCursos
     */
    public GUI_InformacionCursos() {
        initComponents();
        configInic();
    }
    
        public void configInic()
    {
        jtf_Creditos.setEnabled(false);
        jtf_Nombre.setEnabled(false);
    }
    
    public void configEnab()
    {       
        jtf_Creditos.setEnabled(true);
        jtf_Nombre.setEnabled(true);
    }
    
    public void agregarEventosGUI(Controlador_FRM_MantenimientoCursos controlador)
    {
        this.jb_Buscar.addActionListener(controlador);
        this.controlador = controlador;
    }
    
    public String[] getInformacionEscrita()
    {
        String[] arreglo;
        
        arreglo = new String[3];
        
        arreglo[0] = jtf_Siglas.getText();
        arreglo[1] = jtf_Nombre.getText();
        arreglo[2] = jtf_Creditos.getText();
        
        return arreglo;
    }
    
    public String getSiglasEscritas()
    {
        String siglas;
        
        siglas = jtf_Siglas.getText();
        
        return siglas;
    }

    public void fillFields(String siglas, String nombre, int creditos)
    {
        String creditosStr = ""+creditos;
        
        this.jtf_Siglas.setText(siglas);
        this.jtf_Nombre.setText(nombre);
        this.jtf_Creditos.setText(creditosStr);
    }
    
    public void clearFields()
    {        
        this.jtf_Siglas.setText("");
        this.jtf_Nombre.setText("");
        this.jtf_Creditos.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Siglas = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Creditos = new javax.swing.JLabel();
        jtf_Creditos = new javax.swing.JTextField();
        jtf_Nombre = new javax.swing.JTextField();
        jtf_Siglas = new javax.swing.JTextField();
        jb_Buscar = new javax.swing.JButton();

        jl_Siglas.setText("Siglas");

        jl_Nombre.setText("Nombre");

        jl_Creditos.setText("Créditos");

        jtf_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_NombreActionPerformed(evt);
            }
        });

        jtf_Siglas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_SiglasKeyPressed(evt);
            }
        });

        jb_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jb_Buscar.setActionCommand("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Creditos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_Creditos))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Nombre)
                            .addComponent(jl_Siglas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_Siglas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_Buscar))
                            .addComponent(jtf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Buscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_Siglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Siglas))
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jtf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Creditos)
                    .addComponent(jtf_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_NombreActionPerformed
    
    private void jtf_SiglasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_SiglasKeyPressed
        if(evt.getKeyCode() == 10)
        {
            controlador.buscar();
        }
    }//GEN-LAST:event_jtf_SiglasKeyPressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JLabel jl_Creditos;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_Siglas;
    private javax.swing.JTextField jtf_Creditos;
    private javax.swing.JTextField jtf_Nombre;
    private javax.swing.JTextField jtf_Siglas;
    // End of variables declaration//GEN-END:variables
}
