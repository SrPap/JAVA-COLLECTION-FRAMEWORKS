
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        GestorDeContactos gestor = new GestorDeContactos();
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar contacto al ArrayList");
            System.out.println("2. Eliminar contacto del ArrayList");
            System.out.println("3. Agregar contacto al HashSet");
            System.out.println("4. Eliminar contacto del HashSet");
            System.out.println("5. Mostrar contactos del ArrayList");
            System.out.println("6. Mostrar contactos del HashSet");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1 -> {
                    gestor.agregarContactoArrayList(crearContacto(scanner));
                    gestor.mostrarContactosArrayList();
                }
                case 2 -> {
                    gestor.eliminarContactoArrayList(crearContactoParaEliminar(scanner));
                    gestor.mostrarContactosArrayList();
                }
                case 3 -> {
                    gestor.agregarContactoHashSet(crearContacto(scanner));
                    gestor.mostrarContactosHashSet();
                }
                case 4 -> {
                    gestor.eliminarContactoHashSet(crearContactoParaEliminar(scanner));
                    gestor.mostrarContactosHashSet();
                }
                case 5 -> gestor.mostrarContactosArrayList();
                case 6 -> gestor.mostrarContactosHashSet();
                case 7 -> salir = true;
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        scanner.close();
    }

    // Método auxiliar para crear un nuevo contacto
    private static Contacto crearContacto(Scanner scanner) {
        System.out.println("Ingrese el nombre del contacto:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el número de teléfono del contacto:");
        String telefono = scanner.nextLine();
        System.out.println("Ingrese el correo electrónico del contacto:");
        String email = scanner.nextLine();

        return new Contacto(nombre, telefono, email);
    }

    // Método auxiliar para crear un contacto sólo con el nombre para eliminar
    private static Contacto crearContactoParaEliminar(Scanner scanner) {
        System.out.println("Ingrese el nombre del contacto a eliminar:");
        String nombre = scanner.nextLine();

        // Para eliminar solo es necesario el nombre, los demás campos pueden estar vacíos
        return new Contacto(nombre, "", "");
    }
}