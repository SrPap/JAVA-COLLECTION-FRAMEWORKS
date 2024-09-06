import java.util.Scanner;

class ListaDeInvitados {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RegistroDeInvitados Invitados = new RegistroDeInvitados();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ DE REGISTRO DE INVITADOS ---");
            System.out.println("1. Agregar invitados");
            System.out.println("2. Eliminar invitados");
            System.out.println("3. Mostrar lista de invitados");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción: ");
            System.out.println();

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1 -> {

                        System.out.print("Ingrese el nombre del invitado: ");
                        String nombre = scanner.nextLine();

                        Invitados.agregarInvitado(nombre);
                    }
                    case 2 -> {
                        System.out.print("Ingrese el nombre del invitado: ");
                        String nombre = scanner.nextLine();

                        Invitados.eliminarInvitado(nombre);
                    }
                    case 3 -> Invitados.mostrarInvitados();
                    case 4 -> {
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
// Además, crea en el programa principal un menú de opciones 
// que permita al usuario llevar a cabo las siguientes acciones,
//  invocando a sus métodos correspondientes:

// Agregar invitados ingresando su nombre.

// Eliminar invitados ingresando  su nombre.

// Mostrar la lista actual de invitados.

// Es importante asegurarse de que el programa no permita
//  duplicados en la lista, ya que el HashSet se encargará 
//  de mantenerla única.