import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RegistroDeEstudiantes registro = new RegistroDeEstudiantes();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ DE REGISTRO DE ESTUDIANTES ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Mostrar lista de estudiantes");
            System.out.println("4. Buscar estudiante por documento");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el documento del estudiante: ");
                        String documento = scanner.nextLine();
                        System.out.print("Ingrese el nombre del estudiante: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la edad del estudiante: ");
                        int edad = scanner.nextInt();
                        registro.agregarEstudiante(documento, nombre, edad);
                    }
                    case 2 -> {
                        System.out.print("Ingrese el documento del estudiante a eliminar: ");
                        String documento = scanner.nextLine();
                        registro.eliminarEstudiante(documento);
                    }
                    case 3 -> registro.mostrarEstudiantes();
                    case 4 -> {
                        System.out.print("Ingrese el documento del estudiante a buscar: ");
                        String documento = scanner.nextLine();
                        registro.buscarEstudiantePorDocumento(documento);
                    }
                    case 5 -> {
                        continuar = false;
                        System.out.println("Saliendo del sistema...");
                    }
                    default -> System.out.println("Opción inválida, intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Intente nuevamente.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }

        scanner.close();
    }
}

