import java.util.HashMap;
import java.util.Scanner;

public class GestionCodigosPostales {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, String> codigosPostales = new HashMap<>();

        codigosPostales.put("28001", "Madrid");
        codigosPostales.put("08001", "Barcelona");
        codigosPostales.put("41001", "Sevilla");
        codigosPostales.put("29001", "Málaga");
        codigosPostales.put("50001", "Zaragoza");
        codigosPostales.put("46001", "Valencia");
        codigosPostales.put("48001", "Bilbao");
        codigosPostales.put("03001", "Alicante");
        codigosPostales.put("37001", "Salamanca");
        codigosPostales.put("15001", "La Coruña");

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Mostrar los datos existentes");
            System.out.println("2. Ingresar una nueva ciudad con su código postal");
            System.out.println("3. Buscar ciudad por código postal");
            System.out.println("4. Eliminar tres ciudades");
            System.out.println("5. Actualizar ciudad por código postal");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ciudades y sus códigos postales:");
                    for (HashMap.Entry<String, String> entry : codigosPostales.entrySet()) {
                        System.out.println("Código Postal: " + entry.getKey() + " - Ciudad: " + entry.getValue());
                    }
                }

                case 2 -> {
                    System.out.print("Ingrese el código postal: ");
                    String nuevoCodigoPostal = scanner.nextLine();
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    String nuevaCiudad = scanner.nextLine();
                    codigosPostales.put(nuevoCodigoPostal, nuevaCiudad);
                    System.out.println("Ciudad agregada exitosamente.");
                }

                case 3 -> {
                    System.out.print("Ingrese el código postal: ");
                    String codigoPostalBusqueda = scanner.nextLine();
                    if (codigosPostales.containsKey(codigoPostalBusqueda)) {
                        System.out.println("La ciudad asociada al código postal " + codigoPostalBusqueda + " es " + codigosPostales.get(codigoPostalBusqueda));
                    } else {
                        System.out.println("No se encontró ninguna ciudad con ese código postal.");
                    }
                }

                case 4 -> {
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Ingrese el código postal de la ciudad que desea eliminar: ");
                        String codigoPostalEliminar = scanner.nextLine();
                        if (codigosPostales.containsKey(codigoPostalEliminar)) {
                            codigosPostales.remove(codigoPostalEliminar);
                            System.out.println("Ciudad eliminada exitosamente.");
                        } else {
                            System.out.println("No se encontró ninguna ciudad con ese código postal.");
                        }
                    }
                }

                case 5 -> {
                    System.out.print("Ingrese el código postal de la ciudad que desea actualizar: ");
                    String codigoPostalActualizar = scanner.nextLine();
                    if (codigosPostales.containsKey(codigoPostalActualizar)) {
                        System.out.print("Ingrese el nuevo nombre de la ciudad: ");
                        String nuevaCiudadActualizada = scanner.nextLine();
                        codigosPostales.put(codigoPostalActualizar, nuevaCiudadActualizada);
                        System.out.println("Ciudad actualizada exitosamente.");
                    } else {
                        System.out.println("No se encontró ninguna ciudad con ese código postal.");
                    }
                }

                case 6 -> salir = true;

                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
