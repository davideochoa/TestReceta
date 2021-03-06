/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testreceta;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class NewJFrame extends javax.swing.JFrame {
    WebResource_ExistenciaExterna WR_EE = new WebResource_ExistenciaExterna();
    
    public NewJFrame() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JB_ObtenerExistencias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA_ListadoExistencias = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTF_IdSurtidor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTF_Clave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTF_Cantidad = new javax.swing.JTextField();
        JB_Agregar = new javax.swing.JButton();
        JB_Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente WEB SERVICE RESTful");

        JB_ObtenerExistencias.setText("Obtener Existencias");
        JB_ObtenerExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ObtenerExistenciasActionPerformed(evt);
            }
        });

        JTA_ListadoExistencias.setColumns(20);
        JTA_ListadoExistencias.setLineWrap(true);
        JTA_ListadoExistencias.setRows(5);
        jScrollPane1.setViewportView(JTA_ListadoExistencias);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar/Buscar Registro"));

        jLabel1.setText("Id Surtidor:");

        JTF_IdSurtidor.setToolTipText("Clave del Surtidor (entero sin signo)");

        jLabel2.setText("Clave:");

        JTF_Clave.setToolTipText("Texto que represente una clave de medicamento");

        jLabel3.setText("Cantidad:");

        JTF_Cantidad.setToolTipText("Cantidad del producto (entero sin signo)");

        JB_Agregar.setText("AGREGAR");
        JB_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AgregarActionPerformed(evt);
            }
        });

        JB_Buscar.setText("BUSCAR");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTF_IdSurtidor)
                                    .addComponent(JTF_Clave, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(JTF_Cantidad)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JB_Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JB_Buscar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTF_IdSurtidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JTF_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_Buscar)
                    .addComponent(JB_Agregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JB_ObtenerExistencias)
                        .addGap(40, 40, 40)))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_ObtenerExistencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarListado(List<RegistroExistenciaCLI> bitacora){
        JTA_ListadoExistencias.removeAll();
        JTA_ListadoExistencias.setText("");
        
        for(RegistroExistenciaCLI p: bitacora) {             
            JTA_ListadoExistencias.append(p.getIdSurtidor()+" : "+
                                            p.getClave()+" : "+
                                            p.getCantidad()+" : "+
                                            new SimpleDateFormat("dd/MM/yyyy  -  HH:mm:ss").format(p.getFecha())+"\n");      
            System.out.println(p.getIdSurtidor()+" : "+p.getClave()+" : "+p.getCantidad()+" : "+new SimpleDateFormat("dd/MM/yyyy  -  HH:mm:ss").format(p.getFecha()));
        }
    }
    
    private void JB_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AgregarActionPerformed
        try {
            int IdSurtidor = Integer.parseInt(JTF_IdSurtidor.getText());
            String clave = JTF_Clave.getText();
            int cantidad = Integer.parseInt(JTF_Cantidad.getText());

            RegistroExistenciaCLI re = new RegistroExistenciaCLI();
            re.setIdSurtidor(IdSurtidor);
            re.setClave(clave);
            re.setCantidad(cantidad);

            List<RegistroExistenciaCLI>bitacora = WR_EE.agregarExistencia(re);

            mostrarListado(bitacora);
        }
        catch(NumberFormatException er){}
        
        JTF_IdSurtidor.setText("");
        JTF_Clave.setText("");
        JTF_Cantidad.setText("");
    }//GEN-LAST:event_JB_AgregarActionPerformed

    private void JB_ObtenerExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ObtenerExistenciasActionPerformed
        List<RegistroExistenciaCLI> bitacora = WR_EE.listarExistencia();
        
        mostrarListado(bitacora);
    }//GEN-LAST:event_JB_ObtenerExistenciasActionPerformed

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        RegistroExistenciaCLI re = new RegistroExistenciaCLI();
        
        int IdSurtidor = 0;
        String clave = "";
        
        try {
            IdSurtidor = Integer.parseInt(JTF_IdSurtidor.getText());
        }
        catch(NumberFormatException er){
            IdSurtidor = 0;
        }   
        
        try {
            clave = JTF_Clave.getText();
        }
        catch(NullPointerException er){
            clave = "X";
        }  
        
        if(clave.length() == 0)
            clave = "X";
        

        List<RegistroExistenciaCLI> bitacora = WR_EE.buscarExistencia(IdSurtidor,clave);

        mostrarListado(bitacora);
        
        JTF_IdSurtidor.setText("");
        JTF_Clave.setText("");
        JTF_Cantidad.setText("");
    }//GEN-LAST:event_JB_BuscarActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Agregar;
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_ObtenerExistencias;
    private javax.swing.JTextArea JTA_ListadoExistencias;
    private javax.swing.JTextField JTF_Cantidad;
    private javax.swing.JTextField JTF_Clave;
    private javax.swing.JTextField JTF_IdSurtidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
