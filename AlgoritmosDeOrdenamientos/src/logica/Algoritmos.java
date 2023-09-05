package logica;

public class Algoritmos {
    
    //Burbuja Sort
    public void burbujaSort(int array []){
        int aux;
        boolean cambios = false;
        
        while(true){
            cambios = false;
            for(int i=1;i<array.length;i++){
                if(array[i]<array[i-1]){
                    aux = array[i];
                    array[i] = array[i-1];
                    array[i-1] = aux;
                    
                    cambios=true;
                }
            }
            if (cambios==false){
                break;
            }
        }
    }
    
    //Insercion Sort
    public void insercionSort(int array []){
        int p, j;
        int aux;
        for (p = 1; p < array.length; p++){ // desde el segundo elemento hasta
            aux = array[p];           // el final, guardamos el elemento y
            j = p - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < array[j])){ // mientras queden posiciones y el                                
                // valor de aux sea menor que los
                array[j + 1] = array[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            array[j + 1] = aux;       // colocamos aux en su sitio
        }
    }
    
    //Seleccion Sort
    public void seleccionSort(int array []){
        for(int i=0;i<array.length;i++){
            int menor = i;
            for(int j=i+1;j<array.length;j++){
                if(array[menor]>array[j]){
                    menor = j;
                }
            }
            int aux = array[i];
            array[i] = array[menor];
            array[menor] = aux;
        }
    }
    
    //Shell Sort
    public void shellSort(int array []){
        int salto, aux, i;
        boolean cambios;
  
        for (salto = array.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < array.length; i++)   // se da una pasada
                {
                    if (array[i - salto] > array[i]) {       // y si están desordenados
                        aux = array[i];                  // se reordenan
                        array[i] = array[i - salto];
                        array[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
    }
    
    //Quick Sort
    public void quickSort(int array [], int primer, int ultimo){
        //mostrarArray(array);
        int i, j, pivote, aux;
        i = primer;
        j = ultimo;
        pivote = array[(primer + ultimo)/2];
        
        while(i<=j){
            while(array[i]<pivote){
                i++;
            }
            while(array[j]>pivote){
                j--;
            }
            
            //Se hace el intercambio cuando los dos ciclos while pasados pararon, lo que significa que los numeros no van ahi
            if(i<=j){
                aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        }
        
        if(primer<j){
            quickSort(array, primer, j);
        }
        if(i<ultimo){
            quickSort(array, i, ultimo);
        }
        
    }
    
    public void mostrarArray(int array []){
        for(int i : array){
            System.out.print(i + "  ");
        }
        System.out.println();
    }
    
}
