import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Turnero {
    public static Scanner sc = new Scanner(System.in);

    private final ArrayList<Integer> turnos;
    private int ultimoTurnoEmitido;

    public Turnero() {
        this.turnos = new ArrayList<>();
        this.ultimoTurnoEmitido = 0;
    }

    public int asignarTurno() {
        ultimoTurnoEmitido++;
        turnos.add(ultimoTurnoEmitido);
        return ultimoTurnoEmitido;
    }

    public int atenderTurno() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos en espera.");
            return -1;
        }
        return turnos.remove(0);
    }

    public int sortearYAtenderTurno() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos en espera.");
            return -1;
        }
        Random random = new Random();
        int indiceSorteado = random.nextInt(turnos.size());
        return turnos.remove(indiceSorteado); 
    }

    public void mostrarTurnos() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos en espera.");
        } else {
            System.out.println("Turnos en espera: " + turnos);
        }
    }

    public static void main(String[] args) {
        Turnero turnero = new Turnero();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ DEL TURNERO ---");
            System.out.println("1. Asignar nuevo turno");
            System.out.println("2. Atender próximo turno");
            System.out.println("3. Realizar sorteo y atender turno");
            System.out.println("4. Mostrar turnos en espera");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    int nuevoTurno = turnero.asignarTurno();
                    System.out.println("Nuevo turno asignado: " + nuevoTurno);
                }
                case 2 -> {
                    int turnoAtendido = turnero.atenderTurno();
                    if (turnoAtendido != -1) {
                        System.out.println("Atendiendo turno: " + turnoAtendido);
                    }
                }
                case 3 -> {
                    int turnoSorteado = turnero.sortearYAtenderTurno();
                    if (turnoSorteado != -1) {
                        System.out.println("Turno sorteado y atendido: " + turnoSorteado);
                    }
                }
                case 4 -> turnero.mostrarTurnos();
                case 5 -> {
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Opción inválida, intente nuevamente.");
            }
        }

        sc.close();
    }
}

//                              Turnero
// Te han encomendado desarrollar un sistema de asignación de turnos 
// para un servicio al cliente en Java.

// El procedimiento es el siguiente: los clientes obtienen un número 
// de turno al llegar y se colocan en una lista en el orden en que 
// llegaron. Además del servicio habitual, donde se atiende al cliente 
// que ha estado esperando por más tiempo, periódicamente se realiza 
// un sorteo. En este sorteo, se selecciona un número aleatorio y el 
// cliente con ese número es atendido de inmediato.

// Para lograr esto, necesitas:

// Guardar una lista de números de turno en el orden en que fueron 
// emitidos.

// Buscar eficientemente un número de turno específico en la lista 
// cuando se selecciona en el sorteo. Para buscar eficientemente un 
// número de turno específico en la lista cuando se selecciona en el
//  sorteo, debes tener en cuenta cómo manejar la situación cuando 
//  un número ha sido sorteado. En este caso, es importante considerar
//   qué sucede con su posición inicial en la lista. ¿Los datos se
//    mueven o permanecen en su lugar?

// Implementa esta funcionalidad utilizando un ArrayList. Este tipo
//  de lista permite mantener los elementos en el orden de inserción
//   y realizar búsquedas eficientes por índice cuando se realiza 
//   el sorteo.