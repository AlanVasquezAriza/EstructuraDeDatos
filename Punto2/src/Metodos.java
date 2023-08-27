import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {
    
    //crear un ArrayList bidimensional de enteros vacío 
    ArrayList<ArrayList<Double>> matriz = new ArrayList();
    ArrayList<String> busesRango = new ArrayList();
    ArrayList<Double> media = new ArrayList();

    // Cantidad de buses
    int numBuses = 0;
    int semana = 7;
 
    // Llenar la matriz 
    public void Registro() {

        for (int i = 0; i < 10; i++) {
            // Pide la cantidad de marcas que se registraran
            String nS = JOptionPane.showInputDialog("Ingrese la cantidad de buses que desea ingresar");

            // Verificar que sea un numero
            if (nS != null && nS.matches("[0-9]+")) {
                numBuses = numBuses + (Integer.parseInt(nS));
                break;
            } else {
                JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                i--;
            }
        }

        for (int i = 0; i < numBuses; i++) {
            //para cada bus se añade una nueva fila vacía
            //esto es necesario porque el arrayList se crea vacío
            matriz.add(new ArrayList<>());
            for (int j = 0; j < semana; j++) {

                // Ingresar el valor por semana
                double ganancia = 0;
                for (int k = 0; k < 10; k++) {
                    // Pide la cantidad de marcas que se registraran
                    String nS = JOptionPane.showInputDialog("Ingrese cantidad de ventas del bus " + (i + 1) + " del dia " + (j + 1));
                    // Verificar que sea un numero
                    if (nS != null && nS.matches("[0-9]+")) {
                        ganancia = (Integer.parseInt(nS));
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                        k--;
                    }
                }
                matriz.get(i).add(ganancia);
            }
        }
    }




    // Mostrar la matriz
    public void ListaRegistros() {
        double total = 0;
        for (int i = 0; i < matriz.size(); i++) {
            System.out.print("Bus numero " + (i + 1) + ":   ");
            for (int j = 0; j < matriz.get(i).size(); j++) {
                total = total + matriz.get(i).get(j);
                System.out.print(matriz.get(i).get(j) + "  |  ");
            }
            System.out.print(" Total: " + total);
            System.out.println("");
            total = 0;
        }
    }





    // Mayor valor
    public void MayoresVentas() {

        // Toma como mayor valor al primer valor de la matriz
        double mayorValor = matriz.get(0).get(0);
        int bus = 0;
        int dia = 0;
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                // Verifica los valores que recorre con el mayor valor
                if (matriz.get(i).get(j) >= mayorValor) {
                    mayorValor = matriz.get(i).get(j);
                    bus = i + 1;
                    dia = j + 1;
                }
            }
        }
        System.out.println("Mayor cantidad de ventas fue de " + mayorValor + " el dia " + dia + " por el bus nuemero " + bus);
    }




    // Menor valor
    public void MenoresVentas() {

        // Toma como mayor valor al primer valor de la matriz
        double menorValor = matriz.get(0).get(0);
        int bus = 0;
        int dia = 0;
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                // Verifica los valores que recorre con el mayor valor
                if (matriz.get(i).get(j) <= menorValor) {
                    menorValor = matriz.get(i).get(j);
                    bus = i + 1;
                    dia = j + 1;
                }
            }
        }
        System.out.println("Menor cantidad de ventas fue de " + menorValor + " el dia " + dia + " por el bus nuemero " + bus);
    }




    // Ganancias por rango
    public void VentasPorRango() {

        int min = 0;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            // Pide la cantidad de marcas que se registraran
            String nS = JOptionPane.showInputDialog("Ventas minimas");
            // Verificar que sea un numero
            if (nS != null && nS.matches("[0-9]+")) {
                min = (Integer.parseInt(nS));
                break;
            } else {
                JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            // Pide la cantidad de marcas que se registraran
            String nS = JOptionPane.showInputDialog("Ventas maximas");
            // Verificar que sea un numero
            if (nS != null && nS.matches("[0-9]+")) {
                max = (Integer.parseInt(nS));
                break;
            } else {
                JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                i--;
            }
        }

        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                if (min <= matriz.get(i).get(j) && matriz.get(i).get(j) <= max) {
                    String texto = "Bus numero: " + (i + 1) + " Dia: " + (j + 1) + " Total Ventas: " + matriz.get(i).get(j);
                    busesRango.add(texto);
                }
            }
        }

        System.out.println("Buses entre " + min + " y " + max + " numero de ventas");
        for (int i = 0; i < busesRango.size(); i++) {
            System.out.println(busesRango.get(i));
        }

    }




    // Media diaria
    public void MediaDia() {

        double promedioDiario = 0;
        
        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                promedioDiario = 0;
                for (int j2 = 0; j2 < matriz.size(); j2++) {
                    promedioDiario = promedioDiario + matriz.get(j2).get(j);
                }
                promedioDiario = promedioDiario / matriz.size();
                media.add(promedioDiario);
            }
        }

        // Mostrar los promedios
        for (int i = 0; i < semana; i++) {
            System.out.println("Promedio dia " + (i+1) + ": " + (media.get(i)));
        }
    }




    // Aumento 20% a los que estan bajo la media semanal
    public void AumentoMedia() {

        double promedioSemanal = 0;

        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                promedioSemanal = promedioSemanal + matriz.get(i).get(j);
            }
        }
        promedioSemanal = promedioSemanal / (matriz.size() * semana);
        System.out.println("El promedio semanal es: " + promedioSemanal);

        for (int i = 0; i < matriz.size(); i++) {
            for (int j = 0; j < matriz.get(i).size(); j++) {
                if(matriz.get(i).get(j) < promedioSemanal){
                    double nuevo = (matriz.get(i).get(j) + (matriz.get(i).get(j) * (1 * 0.20)));
                    matriz.get(i).set(j, nuevo);                    
                }else{
                    continue;
                }
            }
        }
                
    }
}