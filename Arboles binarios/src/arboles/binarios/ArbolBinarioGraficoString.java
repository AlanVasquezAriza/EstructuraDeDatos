package arboles.binarios;

import javax.swing.*;
import java.awt.*;

public class ArbolBinarioGraficoString extends JFrame {
//    
    ArbolBinario arbol = new ArbolBinario();
    int tipoDato = 0;
    
    public ArbolBinarioGraficoString(ArbolBinario arbol1, int i) {
        arbol = arbol1;
        tipoDato = i;
    }
    
    public int drawTree(Graphics g, Nodo x, int x0, int x1, int y){

        int m = (x0 + x1) / 2;
        g.setColor(Color.BLUE);
        g.fillOval(m, y, 50, 40);
        g.setColor(Color.lightGray);
        g.setFont(new Font("Arial",Font.BOLD,20));
        String t = "";
        
        if(tipoDato == 1){ //Entero
            t = String.valueOf(x.datoInt);
        }
        else if(tipoDato == 2){ //Cadena
            t = String.valueOf(x.datoString);
        }
        
        g.drawString(t, m+20, y+30);
        if (x.hijoIzquierdo != null) {
            int x2 = drawTree(g, x.hijoIzquierdo,x0,m,y+50);
            g.drawLine(m+25, y+40, x2+25, y+50);
        }
        if (x.hijoDerecho != null) {
            int x2 = drawTree(g, x.hijoDerecho,m,x1,y+50);
            g.drawLine(m+25, y+40, x2+25, y + 50);
        }
        return m;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawTree(g, arbol.getRaiz(), 0, this.getWidth()-25, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
