import java.util.ArrayList;
import java.util.Scanner; 


public class ListaDeCiudades {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> listaCiudades = new ArrayList<>();

        boolean Salir = false;
    
        while (!Salir) { 
        System.out.println("Lista de Ciudades");
        System.out.print("Ingrese el nombre de una ciudad: ");
        String ciudad = sc.nextLine();
        String salir = "0";
        if (ciudad.equalsIgnoreCase(salir)) {
            break;
        }

        listaCiudades.add(ciudad);
        System.out.println();

        System.out.println("Ciudades ingresadas: " + listaCiudades);
        System.out.println("(Ingreses 0 para salir)");
        System.out.println();

        }

        System.out.println("Lista de Ciudades: ");
        for (int i = 0; i < listaCiudades.size(); i++) {
            System.out.println((i+1) + ". " + listaCiudades.get(i));
        }
    }
}



// Lista de ciudades
// Desarrolla un programa en Java que haga uso de una lista de 
// tipo ArrayList para almacenar un conjunto de nombres de ciudades. El objetivo es 
//permitir al usuario ingresar nombres de ciudades y luego mostrar la lista completa de ciudades ingresadas.

// Pasos a seguir:

// Inicializa un ArrayList de tipo String para almacenar los 
// nombres de las ciudades.

// Implementa un bucle que solicite al usuario ingresar nombres de 
// ciudades uno por uno. Puedes usar un bucle while o un bucle for que pregunte 
//al usuario si desea agregar una ciudad en cada iteración.

// En cada iteración del bucle, solicita al usuario que ingrese el 
// nombre de una ciudad y agrega ese nombre al ArrayList utilizando el método add.

// Continúa solicitando al usuario que ingrese nombres de ciudades 
// hasta que decida no agregar más.

// Finalmente, muestra por consola la lista completa de ciudades
//  almacenadas en el ArrayList.

// Esta actividad te permitirá practicar la manipulación de ArrayLists
//  en Java, así como también te brindará la oportunidad de repasar cómo 
//  interactuar con datos ingresados por el usuario.