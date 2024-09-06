import java.util.Scanner;

public class CatálogoDeLibrería {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Libreria libreria = new Libreria();
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ DE GESTIÓN DE LIBRERÍA ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catálogo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> AgregarLibro();
                case 2 -> eliminarLibro();
                case 3 -> libreria.mostrarCatalogo();
                case 4 -> {
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Opción inválida, intente nuevamente.");
            }
        }
    }

    private static void AgregarLibro() {
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el número de ISBN del libro: ");
        int ISBN = scanner.nextInt();
        Libro libro = new Libro ( titulo, autor, ISBN);
        libreria.agregarLibro(libro);
    }

    private static void eliminarLibro() {
        System.out.print("Ingrese el número de ISBN del libro a eliminar: ");
        int ISBN = scanner.nextInt();
        libreria.eliminarLibro(ISBN);
    }
}
