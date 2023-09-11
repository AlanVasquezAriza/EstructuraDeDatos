package com.mycompany.cinemax;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Pelicula {

    // Instancias
    int numPeliculas = 15;
    Hashtable<Integer, Integer> Peliculas = new Hashtable<>();

    // Constructor
    public Pelicula() {
        for (int i = 0; i < numPeliculas; i++) {
            int numeroPersonas = (int) (Math.random() * 40 + 1);  // De 1 a 40 personas
            Peliculas.put(i, numeroPersonas);
        }
    }

    // Metodos
}
