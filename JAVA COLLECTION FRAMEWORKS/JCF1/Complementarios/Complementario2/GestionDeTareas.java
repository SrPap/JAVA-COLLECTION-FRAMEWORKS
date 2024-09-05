import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionDeTareas {

    private final ArrayList<Tarea> tareas;

    public GestionDeTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion) {
        Tarea nuevaTarea = new Tarea(descripcion);
        tareas.add(nuevaTarea);
        System.out.println("Tarea agregada con ID " + nuevaTarea.getIdTarea() + ": " + nuevaTarea.getDescripcion());
    }

    public void completarTarea(int idTarea) {
        for (Tarea tarea : tareas) {
            if (tarea.getIdTarea() == idTarea) {
                tarea.marcarComoCompletada();
                System.out.println("Tarea marcada como completada: " + tarea);
                return;
            }
        }
        System.out.println("No se encontró la tarea con el ID " + idTarea);
    }

    public void eliminarTarea(int idTarea) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getIdTarea() == idTarea) {
                System.out.println("Tarea eliminada: " + tareas.get(i));
                tareas.remove(i); // Cambiado de marcar como completada a eliminar
                return;
            }
        }
        System.out.println("No se encontró la tarea con el ID " + idTarea);
    }

    public void mostrarTareasPendientes() {
        System.out.println("\n--- Tareas Pendientes ---");
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                System.out.println("ID " + tarea.getIdTarea() + ": " + tarea.getDescripcion());
            }
        }
    }

    public void mostrarTareasCompletadas() {
        System.out.println("\n--- Tareas Completadas ---");
        for (Tarea tarea : tareas) {
            if (tarea.isCompletada()) {
                System.out.println("ID " + tarea.getIdTarea() + ": " + tarea.getDescripcion());
            }
        }
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GestionDeTareas gestionTareas = new GestionDeTareas();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ DE GESTIÓN DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Completar tarea");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas pendientes");
            System.out.println("5. Mostrar tareas completadas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese la descripción de la tarea: ");
                        String descripcion = scanner.nextLine();
                        gestionTareas.agregarTarea(descripcion);
                    }
                    case 2 -> {
                        System.out.print("Ingrese el ID de la tarea a completar: ");
                        int idTarea = solicitarId();
                        gestionTareas.completarTarea(idTarea);
                    }
                    case 3 -> {
                        System.out.print("Ingrese el ID de la tarea a eliminar: ");
                        int idTarea = solicitarId();
                        gestionTareas.eliminarTarea(idTarea);
                    }
                    case 4 -> gestionTareas.mostrarTareasPendientes();
                    case 5 -> gestionTareas.mostrarTareasCompletadas();
                    case 6 -> {
                        continuar = false;
                        System.out.println("Saliendo del sistema...");
                    }
                    default -> System.out.println("Opción inválida, intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero para seleccionar una opción.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        scanner.close();
    }

    public static int solicitarId() {
        int idTarea = -1;
        while (true) {
            try {
                idTarea = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero válido para el ID.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
        return idTarea;
    }
}

