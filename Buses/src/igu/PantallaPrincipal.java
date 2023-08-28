package igu;

import logica.ManejoBuses;

public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal() {
        initComponents();
    }
    
    ManejoBuses obj = ManejoBuses.getInstancia();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        mostrarRegistros = new javax.swing.JButton();
        mostrarMayores = new javax.swing.JButton();
        mostrarMenores = new javax.swing.JButton();
        mostrarRango = new javax.swing.JButton();
        mostrarDia = new javax.swing.JButton();
        mostrarVeinte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Buses UMB");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Registro");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Lista de registros");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Mayores ventas");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Menores ventas");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Ventas por rango");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Media por dia");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Aumento 20%");

        registrar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 102, 102));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        mostrarRegistros.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mostrarRegistros.setForeground(new java.awt.Color(0, 102, 102));
        mostrarRegistros.setText("Mostrar");
        mostrarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarRegistrosActionPerformed(evt);
            }
        });

        mostrarMayores.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mostrarMayores.setForeground(new java.awt.Color(0, 102, 102));
        mostrarMayores.setText("Mostrar");
        mostrarMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMayoresActionPerformed(evt);
            }
        });

        mostrarMenores.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mostrarMenores.setForeground(new java.awt.Color(0, 102, 102));
        mostrarMenores.setText("Mostrar");
        mostrarMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarMenoresActionPerformed(evt);
            }
        });

        mostrarRango.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mostrarRango.setForeground(new java.awt.Color(0, 102, 102));
        mostrarRango.setText("Mostrar");
        mostrarRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarRangoActionPerformed(evt);
            }
        });

        mostrarDia.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mostrarDia.setForeground(new java.awt.Color(0, 102, 102));
        mostrarDia.setText("Mostrar");
        mostrarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDiaActionPerformed(evt);
            }
        });

        mostrarVeinte.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mostrarVeinte.setForeground(new java.awt.Color(0, 102, 102));
        mostrarVeinte.setText("Mostrar");
        mostrarVeinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarVeinteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarVeinte)
                            .addComponent(mostrarDia)
                            .addComponent(mostrarRango)
                            .addComponent(mostrarMenores)
                            .addComponent(mostrarMayores)
                            .addComponent(mostrarRegistros)
                            .addComponent(registrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(registrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mostrarRegistros))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mostrarMayores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mostrarMenores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mostrarRango))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mostrarDia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mostrarVeinte))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        obj.Registro();
    }//GEN-LAST:event_registrarActionPerformed

    private void mostrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarRegistrosActionPerformed
        obj.ListaRegistros();
    }//GEN-LAST:event_mostrarRegistrosActionPerformed

    private void mostrarRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarRangoActionPerformed
        obj.VentasPorRango();
    }//GEN-LAST:event_mostrarRangoActionPerformed

    private void mostrarMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMayoresActionPerformed
        obj.MayoresVentas();
    }//GEN-LAST:event_mostrarMayoresActionPerformed

    private void mostrarMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarMenoresActionPerformed
        obj.MenoresVentas();
    }//GEN-LAST:event_mostrarMenoresActionPerformed

    private void mostrarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDiaActionPerformed
        obj.MediaDia();
    }//GEN-LAST:event_mostrarDiaActionPerformed

    private void mostrarVeinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarVeinteActionPerformed
        obj.AumentoMedia();
    }//GEN-LAST:event_mostrarVeinteActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton mostrarDia;
    private javax.swing.JButton mostrarMayores;
    private javax.swing.JButton mostrarMenores;
    private javax.swing.JButton mostrarRango;
    private javax.swing.JButton mostrarRegistros;
    private javax.swing.JButton mostrarVeinte;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
