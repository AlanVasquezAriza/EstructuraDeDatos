package igu;

import logica.LeerArreglos;

public class TablaComparativa extends javax.swing.JFrame {
    
    int num;
    
    public TablaComparativa() {
        initComponents();
    }
    
    public TablaComparativa(int numero) {
        initComponents();
        num = numero;
    }
    
    LeerArreglos objeto = new LeerArreglos();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tamaño = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        burbujaSort = new javax.swing.JLabel();
        insercionSort = new javax.swing.JLabel();
        seleccionSort = new javax.swing.JLabel();
        shellSort = new javax.swing.JLabel();
        quickSort = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mostrar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        mostrar.setForeground(new java.awt.Color(0, 153, 153));
        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("Tiempo con:");

        tamaño.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tamaño.setForeground(new java.awt.Color(0, 102, 153));
        tamaño.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Burbuja");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Insercion");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Seleccion");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Shell");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Quick");

        burbujaSort.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        burbujaSort.setForeground(new java.awt.Color(0, 102, 153));
        burbujaSort.setText("0");

        insercionSort.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        insercionSort.setForeground(new java.awt.Color(0, 102, 153));
        insercionSort.setText("0");

        seleccionSort.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        seleccionSort.setForeground(new java.awt.Color(0, 102, 153));
        seleccionSort.setText("0");

        shellSort.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        shellSort.setForeground(new java.awt.Color(0, 102, 153));
        shellSort.setText("0");

        quickSort.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        quickSort.setForeground(new java.awt.Color(0, 102, 153));
        quickSort.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(burbujaSort, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(insercionSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seleccionSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shellSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quickSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tamaño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mostrar)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(burbujaSort))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(insercionSort))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(seleccionSort))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(shellSort))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(quickSort))
                .addGap(18, 18, 18)
                .addComponent(mostrar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        tamaño.setText(String.valueOf(num) + " elementos");
        
        burbujaSort.setText(String.valueOf(objeto.burbujaSortNumeros(num)));
        insercionSort.setText(String.valueOf(objeto.insercionSortNumeros(num)));
        seleccionSort.setText(String.valueOf(objeto.seleccionSortNumeros(num)));
        shellSort.setText(String.valueOf(objeto.shellSortNumeros(num)));
        quickSort.setText(String.valueOf(objeto.quickSortNumeros(num)));
    }//GEN-LAST:event_mostrarActionPerformed

    public int opcion(int numero){
        return numero;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel burbujaSort;
    private javax.swing.JLabel insercionSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton mostrar;
    private javax.swing.JLabel quickSort;
    private javax.swing.JLabel seleccionSort;
    private javax.swing.JLabel shellSort;
    private javax.swing.JLabel tamaño;
    // End of variables declaration//GEN-END:variables
}
