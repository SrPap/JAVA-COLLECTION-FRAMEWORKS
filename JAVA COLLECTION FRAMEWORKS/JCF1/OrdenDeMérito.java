import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenDeMérito {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> listaNotas = new ArrayList<>();

        boolean Salir = false;
    
        System.out.println("Orden de Mérito");
        while (!Salir) { 
        System.out.print("Ingrese una nota: ");
        int Nota = sc.nextInt();

        if (Nota==0) {
            break;
        }
        if (Nota>0 && Nota<11) {
            listaNotas.add(Nota);
        } else {
            System.out.println("Error: ingrese un número de 1 a 10.");

        }

        System.out.println("(Ingreses 0 para salir)");
        System.out.println();
        }
        //       Arraylist en forma de metodo
        // ArrayList<Integer> listaNotas = listaNotas();

        Collections.sort(listaNotas);
        System.out.println("Lista de Notas (descendente): ");
        for (int i = 0; i < listaNotas.size(); i++) {
            System.out.println("- " + listaNotas.get(i));
        }
        Collections.reverse(listaNotas);
        System.out.println("Lista de Notas (ascendente): ");
        for (int i = 0; i < listaNotas.size(); i++) {
            System.out.println("- " + listaNotas.get(i));
        }
    }


    public static ArrayList<Integer> listaNotas() {
        ArrayList<Integer> valores = new ArrayList<>();
        int valor;
    
        System.out.println("Ingrese números enteros. Ingrese 0 para terminar:");
        
        while (true) {
            valor = sc.nextInt();
            if (valor == 0) {
                break;
            }
            if (valor>0 && valor<11) {
                valores.add(valor);
            } else {System.out.println("Error: ingrese un número de 1 a 10.");}
            System.out.println();
        }
        return valores;
    }
    
}


// Orden de mérito
// Desarrolla un programa en Java que emplee un ArrayList para almacenar 
// una serie de notas enteras en el rango del 1 al 10.

// El programa debe permitir al usuario ingresar varios números a la lista, 
// asegurándose de que cada número esté dentro del rango especificado. Luego, 
// ordenará estos números de manera descendente y los imprimirá por pantalla 
// en ambas direcciones.

// Pasos a seguir:

// Inicializa un ArrayList de tipo Integer para almacenar los números enteros.

// Implementa un bucle que solicite al usuario ingresar números enteros uno por 
// uno. Puedes usar un bucle while o for que pregunte al usuario si desea agregar 
// un número en cada iteración.

// En cada iteración del bucle, verifica que el número ingresado esté dentro del 
// rango del 1 al 10 y agrégalo al ArrayList utilizando el método add. Continúa 
// solicitando al usuario que ingrese números hasta que decida no agregar más.

// Después de que el usuario haya ingresado todos los números, utiliza el método 
// sort para ordenar la lista de números de forma descendente.

// Imprime por pantalla la lista ordenada tanto en orden ascendente como descendente.

// Este ejercicio te proporcionará práctica en la manipulación de ArrayLists en 
// Java y te ayudará a comprender la ordenación de elementos de manera ascendente y descendente.