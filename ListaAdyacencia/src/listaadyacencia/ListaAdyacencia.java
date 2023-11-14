package listaadyacencia;

import java.util.*;

class Graph {
    private final Map<Integer, List<Node>> adjacencyList;

    public static class Node {
        int destination;
        int weight;

        Node(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    void addEdge(int source, int destination, int weight) {
        adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(new Node(destination, weight));
    }

    void dijkstra(int startNode) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        Map<Integer, Integer> distanceMap = new HashMap<>();

        minHeap.add(new Node(startNode, 0));
        distanceMap.put(startNode, 0);

        while (!minHeap.isEmpty()) {
            Node current = minHeap.poll();

            for (Node neighbor : adjacencyList.getOrDefault(current.destination, Collections.emptyList())) {
                int newDistance = current.weight + neighbor.weight;
                if (!distanceMap.containsKey(neighbor.destination) || newDistance < distanceMap.get(neighbor.destination)) {
                    distanceMap.put(neighbor.destination, newDistance);
                    minHeap.add(new Node(neighbor.destination, newDistance));
                }
            }
        }

        printSolution(distanceMap);
    }

void floydWarshall() {
    int vertices = adjacencyList.size();
    int[][] dist = new int[vertices+1][vertices+1];

    for (int i = 0; i < vertices; i++) {
        Arrays.fill(dist[i], Integer.MAX_VALUE / 2); // Usando Integer.MAX_VALUE / 2 para evitar desbordamiento de enteros
        dist[i][i] = 0;
    }

    for (int source : adjacencyList.keySet()) {
        for (Node neighbor : adjacencyList.getOrDefault(source, Collections.emptyList())) {
            dist[source][neighbor.destination] = neighbor.weight;
        }
    }

    for (int k = 0; k < vertices; k++) {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (dist[i][k] != Integer.MAX_VALUE / 2 && dist[k][j] != Integer.MAX_VALUE / 2) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
    }

    printFloydWarshallSolution(dist);
}

    private void printFloydWarshallSolution(int[][] dist) {
        int vertices = dist.length;

        System.out.println("Matriz de distancias mínimas (Floyd-Warshall):");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (dist[i][j] == Integer.MAX_VALUE / 2) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(dist[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    private void printSolution(Map<Integer, Integer> distanceMap) {
        System.out.println("Distancias más cortas desde el nodo de inicio:");
        for (Map.Entry<Integer, Integer> entry : distanceMap.entrySet()) {
            System.out.println("Nodo " + entry.getKey() + ": " + entry.getValue());
        }
    }
    
    int findMaxDistanceBetweenNodes(int startNode, int endNode) {
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> distanceMap = new HashMap<>();
        int[] maxDistance = { Integer.MIN_VALUE };

        findMaxDistanceBetweenNodesDFS(startNode, endNode, 0, visited, distanceMap, maxDistance);

        return (maxDistance[0] == Integer.MIN_VALUE) ? -1 : maxDistance[0];
    }

    private void findMaxDistanceBetweenNodesDFS(int current, int endNode, int currentDistance, Set<Integer> visited, Map<Integer, Integer> distanceMap, int[] maxDistance) {
        if (current == endNode) {
            maxDistance[0] = Math.max(maxDistance[0], currentDistance);
            return;
        }

        visited.add(current);
        distanceMap.put(current, currentDistance);

        for (Node neighbor : adjacencyList.getOrDefault(current, Collections.emptyList())) {
            if (!visited.contains(neighbor.destination)) {
                findMaxDistanceBetweenNodesDFS(neighbor.destination, endNode, currentDistance + neighbor.weight, visited, distanceMap, maxDistance);
            }
        }

        visited.remove(current);
    }
    
    
}

public class ListaAdyacencia {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 3);
        graph.addEdge(1, 4, 2);
        graph.addEdge(2, 4, 2);
        graph.addEdge(2, 3, 2);
        graph.addEdge(3, 6, 5);
        graph.addEdge(3, 5, 3);
        graph.addEdge(4, 3, 3);
        graph.addEdge(5, 4, 1);
        graph.addEdge(5, 6, 1);
        graph.addEdge(5, 7, 2);
        graph.addEdge(6, 8, 1);
        graph.addEdge(7, 5, 2);
        graph.addEdge(7, 6, 3);
        graph.addEdge(7, 8, 5);
        
        System.out.println("El costo maximo entre 0 y 8 es: " + graph.findMaxDistanceBetweenNodes(0,8));

        int startNode = 0;
        graph.dijkstra(startNode);

        System.out.println("\n--- Floyd-Warshall Algoritmo ---\n");
        graph.floydWarshall();
    }
}