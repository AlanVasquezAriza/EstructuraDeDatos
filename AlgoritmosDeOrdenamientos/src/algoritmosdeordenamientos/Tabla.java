package algoritmosdeordenamientos;

public class Tabla extends javax.swing.JFrame {

    public Tabla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opciones = new javax.swing.JLabel();
        mil = new javax.swing.JButton();
        cincoMil = new javax.swing.JButton();
        diezMil = new javax.swing.JButton();
        cienMil = new javax.swing.JButton();
        unMillon = new javax.swing.JButton();
        diezMillones = new javax.swing.JButton();
        otro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opciones.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        opciones.setForeground(new java.awt.Color(0, 102, 153));
        opciones.setText("Opciones");

        mil.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mil.setForeground(new java.awt.Color(0, 153, 153));
        mil.setText("1.000");

        cincoMil.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cincoMil.setForeground(new java.awt.Color(0, 153, 153));
        cincoMil.setText("5.000");

        diezMil.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        diezMil.setForeground(new java.awt.Color(0, 153, 153));
        diezMil.setText("10.000");

        cienMil.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cienMil.setForeground(new java.awt.Color(0, 153, 153));
        cienMil.setText("100.000");

        unMillon.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        unMillon.setForeground(new java.awt.Color(0, 153, 153));
        unMillon.setText("1.000.000");

        diezMillones.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        diezMillones.setForeground(new java.awt.Color(0, 153, 153));
        diezMillones.setText("10.000.000");

        otro.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        otro.setForeground(new java.awt.Color(0, 153, 153));
        otro.setText("Otro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mil, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cincoMil, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(diezMil, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diezMillones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unMillon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cienMil, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(otro))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(opciones)
                                .addGap(9, 9, 9)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(opciones)
                .addGap(18, 18, 18)
                .addComponent(mil)
                .addGap(18, 18, 18)
                .addComponent(cincoMil)
                .addGap(18, 18, 18)
                .addComponent(diezMil)
                .addGap(18, 18, 18)
                .addComponent(cienMil)
                .addGap(18, 18, 18)
                .addComponent(unMillon)
                .addGap(18, 18, 18)
                .addComponent(diezMillones)
                .addGap(18, 18, 18)
                .addComponent(otro)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cienMil;
    private javax.swing.JButton cincoMil;
    private javax.swing.JButton diezMil;
    private javax.swing.JButton diezMillones;
    private javax.swing.JButton mil;
    private javax.swing.JLabel opciones;
    private javax.swing.JButton otro;
    private javax.swing.JButton unMillon;
    // End of variables declaration//GEN-END:variables
}
