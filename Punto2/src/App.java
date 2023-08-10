import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        int n = 0;

        for (int i = 0; i < 10; i++) {
            // Pide la cantidad de marcas que se registraran
            String nS = JOptionPane.showInputDialog("Ingrese la cantidad de autos que desea ingresar");
    
            // Verificar que sea un numero
            if (nS != null && nS.matches("[0-9]+")) {
                n = Integer.parseInt(nS);
                break;
            }else{
                JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                i--;
                continue;
            }
        }


        // Precios de los vehiculos
        int[][] PrecioVehiculos = new int[n][5];
        // Se usara como label de la matriz vehiculo - columna
        String[] NombreVehiculos = new String[n];
        // Se usara como label de la matriz año - fila
        int[] AñoVehiculo = {2018, 2019, 2020, 2021, 2022};

        //--------------------------------------------------Ingresar las marcas de los vehiculos--------------------------------------------------
        for (int i = 0; i < NombreVehiculos.length; i++) {
            String NombreVehiculo = JOptionPane.showInputDialog("Ingrese la marca del vehiculo " + (i + 1));
            NombreVehiculos[i] = NombreVehiculo;
        }

        //--------------------------------------------------Ingresar los precios de las marcas con los años--------------------------------------------------
        for (int i = 0; i < PrecioVehiculos.length; i++) {
            for (int j = 0; j < PrecioVehiculos[i].length; j++) {
                
                for (int k = 0; k < 10; k++) {
                    // Pide el precio de los vehiculos
                    String precioS = JOptionPane.showInputDialog("Ingrese el precio del vehiculo " + NombreVehiculos[i] + " en el año " + AñoVehiculo[j]);
        
                    // Verificar que sea un numero
                    if (precioS != null && precioS.matches("[0-9]+")) {
                        int precio = Integer.parseInt(precioS);
                        PrecioVehiculos[i][j] = precio;
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                        k--;
                        continue;
                    }
                }
            }
        }


        //--------------------------------------------------MENU--------------------------------------------------
        while (true) { 
            
            int caso = 0;
            
            // Valida que se coloque un numero 
            for (int i = 0; i < 4; i++) {
                String casoS = JOptionPane.showInputDialog("1. Mostrar autos \n2. Autos mas baratos \n3. Vehiculos por rango de precio \n4. Salir");
                if(casoS != null && casoS.matches("[0-9]+")){
                    caso = Integer.parseInt(casoS);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                    i--;
                    continue;
                }
            }

            // En el caso que el usuario desee salir del programa
            if(caso == 4){
                JOptionPane.showMessageDialog(null, "Adios");
                break;
            }

            switch (caso) {

                // --------------------------------------------------Mostrar tabla--------------------------------------------------
                case 1: 

                    System.out.print("AÑO   ");

                    for (int i = 0; i < AñoVehiculo.length; i++) {
                        System.out.print(AñoVehiculo[i] + "  ");
                    }

                    System.out.println();

                    for (int i = 0; i < NombreVehiculos.length; i++) {
                        System.out.print(NombreVehiculos[i] + "   ");
                        for (int j = 0; j < PrecioVehiculos[i].length; j++) {
                            System.out.print(PrecioVehiculos[i][j] + "$ | ");
                        }
                        System.out.println();
                    }
                    break;

                // --------------------------------------------------Buscar el auto mas barato del año--------------------------------------------------
                case 2:
                    
                    for (int i = 0; i < 4; i++) {
                    String casoS = JOptionPane.showInputDialog("1. 2018 \n2. 2019 \n3. 2020 \n4. 2021 \n5. 2022");
                        if(casoS != null && casoS.matches("[0-9]+")){
                            caso = Integer.parseInt(casoS);
                            break;
                        }else{
                            JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                            i--;
                            continue;
                        }
                    }

                    int Valorminimo = PrecioVehiculos[0][0];
                    int vehiculo = 0;

                    switch (caso) {

                        case 1:
                    
                            for (int i = 0; i < PrecioVehiculos.length; i++) {
                                if (PrecioVehiculos[i][0] < Valorminimo) {
                                    Valorminimo = PrecioVehiculos[i][0];
                                    vehiculo = i;
                                }
                            }
                           JOptionPane.showMessageDialog(null, "El vehiculo mas barato del 2018 fue: " + NombreVehiculos[vehiculo]);
                            break;

                        case 2:
                    
                            for (int i = 0; i < PrecioVehiculos.length; i++) {
                                if (PrecioVehiculos[i][1] < Valorminimo) {
                                    Valorminimo = PrecioVehiculos[i][1];
                                    vehiculo = i;
                                }
                            }
                           JOptionPane.showMessageDialog(null, "El vehiculo mas barato del 2019 fue: " + NombreVehiculos[vehiculo]);
                            break;

                        case 3:

                            for (int i = 0; i < PrecioVehiculos.length; i++) {
                                if (PrecioVehiculos[i][2] < Valorminimo) {
                                    Valorminimo = PrecioVehiculos[i][2];
                                    vehiculo = i;
                                }
                            }
                           JOptionPane.showMessageDialog(null, "El vehiculo mas barato del 2020 fue: " + NombreVehiculos[vehiculo]);
                            break;

                        case 4:

                            for (int i = 0; i < PrecioVehiculos.length; i++) {
                                if (PrecioVehiculos[i][3] < Valorminimo) {
                                    Valorminimo = PrecioVehiculos[i][3];
                                    vehiculo = i;
                                }
                            }
                           JOptionPane.showMessageDialog(null, "El vehiculo mas barato del 2021 fue: " + NombreVehiculos[vehiculo]);
                            break;

                        case 5:

                            for (int i = 0; i < PrecioVehiculos.length; i++) {
                                if (PrecioVehiculos[i][4] < Valorminimo) {
                                    Valorminimo = PrecioVehiculos[i][4];
                                    vehiculo = i;
                                }
                            }
                           JOptionPane.showMessageDialog(null, "El vehiculo mas barato del 2022 fue: " + NombreVehiculos[vehiculo]);
                            break;

                        default:

                            JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");

                            break;
                    }

                    break;
                
                // --------------------------------------------------Buscar el auto entre el rango de precio--------------------------------------------------
                case 3:

                    int minimo = 0;
                    int maximo = 0;

                    for (int i = 0; i < 4; i++) {
                    String minimoString = JOptionPane.showInputDialog("Valor minimo: ");
                        if(minimoString != null && minimoString.matches("[0-9]+")){
                            minimo = Integer.parseInt(minimoString);
                            break;
                        }else{
                            JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                            i--;
                            continue;
                        }
                    }

                    for (int i = 0; i < 4; i++) {
                    String maximoString = JOptionPane.showInputDialog("Valor maximo: ");
                        if(maximoString != null && maximoString.matches("[0-9]+")){
                            maximo = Integer.parseInt(maximoString);
                            break;
                        }else{
                            JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");
                            i--;
                            continue;
                        }
                    }

                    System.out.println("Vehiculos entre " + minimo + " y " + maximo + ":");
                    for (int i = 0; i < PrecioVehiculos.length; i++) {
                        for (int j = 0; j < PrecioVehiculos[i].length; j++) {
                            if(PrecioVehiculos[i][j] > minimo && PrecioVehiculos[i][j] < maximo){
                                System.out.println("Marca: " + NombreVehiculos[i] + " - Año: " + AñoVehiculo[j]);
                            }
                        }
                    }

                    break;

                default:

                    JOptionPane.showMessageDialog(null, "El dato digitado no es valido, por favor intentelo de nuevo");

                    break;
            }
        }
    }
}