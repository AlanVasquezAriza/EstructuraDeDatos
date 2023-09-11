package com.mycompany.cinemax;
import java.util.ArrayList;
import java.util.Hashtable;

public class Sala {

    // Instancias
    int numSalas = 7;
    int numPeliculas = 15;
    int salaMasVisitada = 0;
    int peliculaMasVista = 0;
    int totalPersonasSala = 0;
    int totalPersonasPelicula = 0;
    ArrayList<Integer> personasSala = new ArrayList<>();
    ArrayList<Integer> personasPelicula = new ArrayList<>();
    Hashtable<Integer, Object> Salas = new Hashtable<>();
    Pelicula pelicula = new Pelicula();
    
    // Constructor
    
    public Sala(){
        for (int i = 0; i < numSalas; i++) {
            Salas.put(i, new Pelicula());
        }
    }
    
    // Metodos
    
    
    public void mostraRegistro(){
        for (int i = 0; i < numSalas; i++) {
            System.out.println();
            System.out.println("Sala numero " + (i + 1));
            System.out.println();
            for (int j = 0; j < numPeliculas; j++) {
                Object objeto = Salas.get(i);
                System.out.print("Pelicula " + (j + 1) + ": " + ((Pelicula)objeto).Peliculas.get(j) + "   ");
            }
            System.out.println();
        }
    }

    
    
    public void mostraRegistroTabla(){
        for (int i = 0; i < numSalas; i++) {
            System.out.println();
            System.out.println("Sala numero " + (i + 1));
            System.out.println();
            for (int j = 0; j < numPeliculas; j++) {
                Object objeto = Salas.get(i);
                System.out.print(((Pelicula)objeto).Peliculas.get(j) + "  |  ");
            }
            System.out.println();
        }
    }

    
    
    public void totalPersonasSala(){
        System.out.println();
        for (int i = 0; i < numSalas; i++) {
            totalPersonasSala = 0;
            for (int j = 0; j < numPeliculas; j++) {
                Object objeto = Salas.get(i);
                totalPersonasSala += ((Pelicula)objeto).Peliculas.get(j);
            }
            personasSala.add(totalPersonasSala);
            
        }

        for (int i = 0; i < numSalas; i++) {
            System.out.println("Total de personas en la sala " + (i+1) + ": " + personasSala.get(i));
        }
    }

    
    
    public void totalPersonasPelicula(){
        System.out.println();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j <numPeliculas; j++) {
                totalPersonasPelicula = 0;
                for (int j2 = 0; j2 < numSalas; j2++) {
                    Object objeto = Salas.get(j2);
                    totalPersonasPelicula += ((Pelicula)objeto).Peliculas.get(j);
                }
                personasPelicula.add(totalPersonasPelicula);
            }
        }
        
        for (int i = 0; i < numPeliculas; i++) {
            System.out.println("Total de personas en la pelicula " + (i+1) + ": " + personasPelicula.get(i));
        }
    }
    
    
    
    public void peliculaMasVista(){
        int peli = 0;
        
        for (int i = 0; i < personasPelicula.size(); i++){
            int numpeli = personasPelicula.get(i);
            if(numpeli >= peliculaMasVista){
                peliculaMasVista = numpeli;
                peli = i + 1;
            }
        }
        System.out.println();
        System.out.println("La pelicula mas vista fue la nº " + peli);
        System.out.println();
    }
    
    
    
    public void salaMasVisitada(){
        int sala = 0;
        
        for (int i = 0; i < personasSala.size(); i++){
            int numsala = personasSala.get(i);
            if(numsala >= salaMasVisitada){
                salaMasVisitada = numsala;
                sala = i + 1;
            }
        }
        System.out.println();
        System.out.println("La sala con mas vistas fue la nº " + sala);
        System.out.println();
    }
}
