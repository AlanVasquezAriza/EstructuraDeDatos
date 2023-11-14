package dijkstra;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class GraficoGrafo extends JPanel {

    private int[][] grafo = {
          /*0  1  2  3  4  5  6  7  8  9*/
      /*0*/{0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
      /*1*/{1, 0, 1, 0, 0, 0, 1, 0, 0, 0},
      /*2*/{0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
      /*3*/{0, 0, 1, 0, 1, 0, 0, 1, 1, 0},
      /*4*/{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
      /*5*/{0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
      /*6*/{0, 1, 0, 0, 0, 1, 0, 1, 0, 0},
      /*7*/{0, 0, 1, 1, 0, 0, 1, 0, 1, 0},
      /*8*/{0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
      /*9*/{1, 0, 1, 0, 0, 0, 0, 0, 1, 0}
    };

    private int numNodos = grafo.length;
    private int radio = 20; //Tamaño del nodo
    private Point[] posicionesNodos;
    private int[][] pesosAristas;  // Matriz de pesos de las aristas

    public GraficoGrafo() {
        posicionesNodos = new Point[numNodos];
        posicionesNodos[0] = new Point(300, 100);
        posicionesNodos[1] = new Point(440, 50);
        posicionesNodos[2] = new Point(440, 440);
        posicionesNodos[3] = new Point(360, 600);
        posicionesNodos[4] = new Point(250, 750);
        posicionesNodos[5] = new Point(140, 680);
        posicionesNodos[6] = new Point(65, 590);
        posicionesNodos[7] = new Point(20, 480);
        posicionesNodos[8] = new Point(150, 320);
        posicionesNodos[9] = new Point(220, 210);

        // Define los pesos de las aristas
        pesosAristas = new int[numNodos][numNodos];
        pesosAristas[0][1] = 8;
        pesosAristas[1][0] = 8;
        pesosAristas[1][2] = 18;
        pesosAristas[2][1] = 18;
        pesosAristas[2][3] = 14;
        pesosAristas[3][2] = 14;
        pesosAristas[3][4] = 7;
        pesosAristas[4][3] = 7;
        pesosAristas[4][5] = 8;
        pesosAristas[5][4] = 8;
        pesosAristas[5][6] = 5;
        pesosAristas[6][5] = 5;
        pesosAristas[6][7] = 6;
        pesosAristas[7][6] = 6;
        pesosAristas[7][8] = 7;
        pesosAristas[8][7] = 7;
        pesosAristas[8][9] = 3;
        pesosAristas[9][8] = 3;
        pesosAristas[9][0] = 10;
        pesosAristas[0][9] = 10;
        pesosAristas[1][6] = 32;
        pesosAristas[6][1] = 32;
        pesosAristas[2][9] = 8;
        pesosAristas[9][2] = 8;
        pesosAristas[2][7] = 18;
        pesosAristas[7][2] = 18;
        pesosAristas[2][5] = 18;
        pesosAristas[5][2] = 18;
        pesosAristas[3][7] = 14;
        pesosAristas[7][3] = 14;
        pesosAristas[3][8] = 12;
        pesosAristas[8][3] = 12;
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

            for (int j = 0; j < numNodos; j++) {
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
