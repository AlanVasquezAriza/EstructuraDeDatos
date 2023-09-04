package algoritmosdeordenamientos;

public class Algoritmos {
    
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
