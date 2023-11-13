package imprimirgrafo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GraficoGrafo extends JPanel {

    private int[][] grafo = {
        {0, 1, 1, 0, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 1, 1},
        {0, 1, 1, 0, 1},
        {0, 0, 1, 1, 0}
    };

    private int numNodos = grafo.length;
    private int radio = 20;
    private Point[] posicionesNodos;
    private int[][] pesosAristas;  // Matriz de pesos de las aristas

    public GraficoGrafo() {
        posicionesNodos = new Point[numNodos];
        posicionesNodos[0] = new Point(100, 100);
        posicionesNodos[1] = new Point(300, 100);
        posicionesNodos[2] = new Point(200, 0);
        posicionesNodos[3] = new Point(100, 300);
        posicionesNodos[4] = new Point(300, 300);

        // Define los pesos de las aristas
        pesosAristas = new int[numNodos][numNodos];
        pesosAristas[0][1] = 1;
        pesosAristas[0][2] = 2;
        pesosAristas[1][3] = 3;
        pesosAristas[2][3] = 4;
        pesosAristas[2][4] = 5;
        pesosAristas[3][4] = 6;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < numNodos; i++) {
            int x = posicionesNodos[i].x;
            int y = posicionesNodos[i].y;

            g2.setColor(Color.BLACK);
            g2.fill(new Ellipse2D.Double(x - radio, y - radio, 2 * radio, 2 * radio));

            g2.setColor(Color.WHITE);
            g2.setFont(new Font("Arial", Font.BOLD, 16));
            String nodoText = Integer.toString(i);
            Rectangle2D bounds = g2.getFontMetrics().getStringBounds(nodoText, g2);
            int textX = x - (int) bounds.getWidth() / 2;
            int textY = y + (int) bounds.getHeight() / 2;
            g2.drawString(nodoText, textX, textY);

            for (int j = i + 1; j < numNodos; j++) {
                if (grafo[i][j] == 1) {
                    int xi = posicionesNodos[i].x;
                    int yi = posicionesNodos[i].y;
                    int xj = posicionesNodos[j].x;
                    int yj = posicionesNodos[j].y;

                    g2.setColor(Color.BLACK);
                    g2.draw(new Line2D.Double(xi, yi, xj, yj));

                    // Etiquetas (pesos) encima de las líneas
                    String peso = Integer.toString(pesosAristas[i][j]);
                    int etiquetaX = (xi + xj) / 2;
                    int etiquetaY = (yi + yj) / 2;
                    g2.setColor(Color.BLUE);
                    g2.setFont(new Font("Arial", Font.PLAIN, 12));
                    Rectangle2D pesoBounds = g2.getFontMetrics().getStringBounds(peso, g2);
                    int pesoX = etiquetaX - (int) pesoBounds.getWidth() / 2;
                    int pesoY = etiquetaY - (int) pesoBounds.getHeight() / 2;
                    g2.drawString(peso, pesoX, pesoY);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grafo");
        GraficoGrafo grafoPanel = new GraficoGrafo();
        frame.add(grafoPanel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
