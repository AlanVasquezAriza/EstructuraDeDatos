package HashTableProject;

public class AlgoritmoOrdenamiento {
    
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
    
}
