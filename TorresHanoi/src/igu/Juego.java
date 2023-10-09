package igu;

import javax.swing.JOptionPane;
import logica.Pilas;

public class Juego extends javax.swing.JFrame {

    int discos = 0;
    
    Pilas pila1 = new Pilas();
    Pilas pila2 = new Pilas();
    Pilas pila3 = new Pilas();
    
    public Juego() {
        initComponents();
    }
    
    public Juego(int cantidadDiscos) {
        discos = cantidadDiscos;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textTorre1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textTorre2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textTorre3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        moverA = new javax.swing.JButton();
        moverB = new javax.swing.JButton();
        moverC = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textTorre1.setColumns(20);
        textTorre1.setRows(5);
        jScrollPane1.setViewportView(textTorre1);

        textTorre2.setColumns(20);
        textTorre2.setRows(5);
        jScrollPane2.setViewportView(textTorre2);

        textTorre3.setColumns(20);
        textTorre3.setRows(5);
        jScrollPane3.setViewportView(textTorre3);

        jLabel1.setText("Torre A");

        jLabel2.setText("Torre B");

        jLabel3.setText("Torre C");

        moverA.setText("Mover");
        moverA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverAActionPerformed(evt);
            }
        });

        moverB.setText("Mover");
        moverB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverBActionPerformed(evt);
            }
        });

        moverC.setText("Mover");
        moverC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverCActionPerformed(evt);
            }
        });

        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addGap(202, 202, 202)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(moverA)
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iniciar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(moverB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(moverC)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moverA)
                    .addComponent(moverB)
                    .addComponent(moverC))
                .addGap(18, 18, 18)
                .addComponent(iniciar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarTexto(){
        textTorre1.setText(pila1.mostrarNumerales(pila1));
        textTorre2.setText(pila2.mostrarNumerales(pila2));
        textTorre3.setText(pila3.mostrarNumerales(pila3));
    }
    
    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        for(int i=discos;i>0;i--){
            pila1.push(i);
        }
        
        mostrarTexto();
        
    }//GEN-LAST:event_iniciarActionPerformed

    private void moverAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverAActionPerformed
        
        int peekTorreA = 0, torre = 0;
        
        try{       
            peekTorreA = pila1.peek(pila1);
            torre = Integer.parseInt(JOptionPane.showInputDialog("A donde quiere mover el disco " + peekTorreA + "\n1. Torre B \n2. Torre C"));
        }
        catch(Exception e){
            System.out.println("Error");
        }
        
        switch(torre){
            case 1:
                
                int peekTorreB = pila2.peek(pila2);
                System.out.println(peekTorreB + " soy 0");
                
                if(peekTorreB > peekTorreA || peekTorreB == 0){
                    pila1.pop(pila1);
                    pila2.push(peekTorreA);
                }
                else{
                    System.out.println("El valor es mas grande que el peek de la torre B");
                }
                
                break;
            case 2:
                
                int peekTorreC = pila3.peek(pila3);
                System.out.println(peekTorreC);
                
                if(peekTorreC > peekTorreA || peekTorreC == 0){
                    pila1.pop(pila1);
                    pila3.push(peekTorreA);
                }
                else{
                    System.out.println("El valor es mas grande que el peek de la torre C");
                }
                
                break;
        }
        
        mostrarTexto();
        
    }//GEN-LAST:event_moverAActionPerformed

    private void moverBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverBActionPerformed
        
        int peekTorreB = 0, torre = 0; 
        
        try{
            peekTorreB = pila2.peek(pila2);
            torre = Integer.parseInt(JOptionPane.showInputDialog("A donde quiere mover el disco " + peekTorreB + "\n1. Torre A \n2. Torre C"));
        }
        catch(Exception e){
            System.out.println("Error");
        }
        
        switch(torre){
            case 1:
                
                int peekTorreA = pila1.peek(pila1);
                System.out.println(peekTorreA);
                
                if(peekTorreA > peekTorreB || peekTorreA == 0){
                    pila2.pop(pila2);
                    pila1.push(peekTorreB);
                }
                else{
                    System.out.println("El valor es mas grande que el peek de la torre A");
                }
                
                break;
            case 2:
                
                int peekTorreC = pila3.peek(pila3);
                System.out.println(peekTorreC);
                
                if(peekTorreC > peekTorreB || peekTorreC == 0){
                    pila2.pop(pila2);
                    pila3.push(peekTorreB);
                }
                else{
                    System.out.println("El valor es mas grande que el peek de la torre C");
                }
                
                break;
        }
        
        mostrarTexto();
        
    }//GEN-LAST:event_moverBActionPerformed

    private void moverCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverCActionPerformed
        
        int peekTorreC = 0, torre = 0;
        
        try{
            peekTorreC = pila3.peek(pila3);
            torre = Integer.parseInt(JOptionPane.showInputDialog("A donde quiere mover el disco " + peekTorreC + "\n1. Torre A \n2. Torre B"));
        }
        catch(Exception e){
            System.out.println("Error");
        }
        
        switch(torre){
            case 1:
                
                int peekTorreA = pila1.peek(pila1);
                System.out.println(peekTorreA);
                
                if(peekTorreA > peekTorreC || peekTorreA == 0){
                    pila3.pop(pila3);
                    pila1.push(peekTorreC);
                }
                else{
                    System.out.println("El valor es mas grande que el peek de la torre A");
                }
                
                break;
            case 2:
                
                int peekTorreB = pila2.peek(pila2);
                System.out.println(peekTorreB);
                
                if(peekTorreB > peekTorreC || peekTorreB == 0){
                    pila3.pop(pila3);
                    pila2.push(peekTorreC);
                }
                else{
                    System.out.println("El valor es mas grande que el peek de la torre B");
                }
                
                break;
        }
        
        mostrarTexto();
        
    }//GEN-LAST:event_moverCActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton moverA;
    private javax.swing.JButton moverB;
    private javax.swing.JButton moverC;
    private javax.swing.JTextArea textTorre1;
    private javax.swing.JTextArea textTorre2;
    private javax.swing.JTextArea textTorre3;
    // End of variables declaration//GEN-END:variables
}
