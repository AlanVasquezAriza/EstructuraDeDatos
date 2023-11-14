package dijkstra;
import java.util.*;
import javax.swing.JFrame;

public class Dijkstra{
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] graph = {
          /*0  1  2  3  4  5  6  7  8  9*/
      /*0*/{0, 8, 0, 0, 0, 0, 0, 0, 0, 10},
      /*1*/{8, 0, 18, 0, 0, 0, 32, 0, 0, 0},
      /*2*/{0, 18, 0, 14, 0, 18, 0, 18, 0, 8},
      /*3*/{0, 0, 14, 0, 7, 0, 0, 14, 12, 0},
      /*4*/{0, 0, 0, 7, 0, 8, 0, 0, 0, 0},
      /*5*/{0, 0, 18, 0, 8, 0, 5, 0, 0, 0},
      /*6*/{0, 32, 0, 0, 0, 5, 0, 6, 0, 0},
      /*7*/{0, 0, 18, 14, 0, 0, 6, 0, 7, 0},
      /*8*/{0, 0, 0, 12, 0, 0, 0, 7, 0, 3},
      /*9*/{10, 0, 8, 0, 0, 0, 0, 0, 3, 0}
        };

        int startNode = 0;
        dijkstra(graph, startNode);
        
        JFrame frame = new JFrame("Grafo");
        GraficoGrafo grafoPanel = new GraficoGrafo();
        frame.add(grafoPanel);
        frame.setSize(500, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }

    private static void dijkstra(int[][] graph, int startNode) {
        int vertices = graph.length;
        int[] dist = new int[vertices];
        boolean[] visited = new boolean[vertices];

        // Inicializar distancias y conjunto de visitados
        for (int i = 0; i < vertices; i++) {
            dist[i] = INF;
            visited[i] = false;
        }

        // La distancia al nodo de inicio siempre es 0
        dist[startNode] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            // Encontrar el nodo con la distancia mínima no visitada
            int u = minDistance(dist, visited);
            visited[u] = true;

            // Actualizar las distancias de los nodos adyacentes al nodo seleccionado
            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Imprimir las distancias más cortas desde el nodo dado
        printSolution(dist, startNode);
    }

    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF, minIndex = -1;

        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    private static void printSolution(int[] dist, int startNode) {
        System.out.println("Distancias más cortas desde el nodo: " + startNode);
        for (int i = 0; i < dist.length; i++) {
            System.out.println("Nodo " + i + ": " + dist[i]);
        }
    }
}
