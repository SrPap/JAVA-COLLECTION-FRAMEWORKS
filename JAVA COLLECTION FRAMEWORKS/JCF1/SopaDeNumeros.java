import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SopaDeNumeros {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> valores = leerValores();

        int suma = calcularSuma(valores);
        double promedio = calcularPromedio(valores);
        mostrarResultados(valores, suma, promedio);
    }

    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> valores = new ArrayList<>();
        int valor;

        System.out.println("Ingrese números enteros. Ingrese -99 para terminar:");
        
        while (true) {
            valor = sc.nextInt();
            if (valor == -99) {
                break;
            }
            valores.add(valor);
        }

        return valores;
    }

    public static int calcularSuma(ArrayList<Integer> valores) {
        if (valores.isEmpty()) {
            return 0;
        }
        int suma = 0;
        Iterator<Integer> iterator = valores.iterator();

        while (iterator.hasNext()) {
            suma += iterator.next();
        }

        return suma;
    }

    public static double calcularPromedio(ArrayList<Integer> valores) {
        if (valores.isEmpty()) {
            return 0;
        }
        int suma = calcularSuma(valores);
        return (double) suma / valores.size();
    }

    public static void mostrarResultados(ArrayList<Integer> valores, int suma, double promedio) {
        System.out.println("\nValores ingresados: " + valores);
        System.out.println("Número total de valores ingresados: " + valores.size());
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Promedio de los valores: " + promedio);

        int mayoresQueLaMedia = 0;
        for (int valor : valores) {
            if (valor > promedio) {
                mayoresQueLaMedia++;
                // System.out.println(valor);

            }
        }

        System.out.println("Cantidad de valores mayores que la media: " + mayoresQueLaMedia);
    }
}
//                      Sopa de números
// Desarrolla un programa que solicite al usuario ingresar una 
// serie de valores numéricos enteros desde el teclado y los 
// guarde en un ArrayList de tipo Integer. La lectura de números 
// finalizará cuando se introduzca el valor -99. Este valor no 
// será almacenado en el ArrayList.

// Una vez completada la entrada de datos, el programa mostrará 
// por pantalla el número total de valores ingresados, su suma 
// y su media (promedio). Además, se mostrará cuántos de los valores 
// ingresados son mayores que la media.

// Para abordar esta tarea, asegúrate de desarrollar al menos 
// los siguientes métodos:

// Método leerValores(): Este método solicita por teclado los 
// números y los almacena en el ArrayList. La lectura finaliza
//  cuando se introduce el valor -99. El método devuelve el ArrayList
//   con los valores introducidos.

// Método calcularSuma(): Recibe como parámetro el ArrayList con 
// los valores numéricos y calcula su suma. Utiliza un Iterator 
// para recorrer el ArrayList.

// Método calcularPromedio(): Recibe como parámetro el ArrayList 
// con los valores numéricos y calcula su media. Utiliza un Iterator
//  para recorrer el ArrayList.

// Método mostrarResultados(): Recibe como parámetro el ArrayList, 
// la suma y la media aritmética. Este método muestra por pantalla 
// todos los valores, su suma y su media, y calcula y muestra cuántos
//  números son superiores a la media.