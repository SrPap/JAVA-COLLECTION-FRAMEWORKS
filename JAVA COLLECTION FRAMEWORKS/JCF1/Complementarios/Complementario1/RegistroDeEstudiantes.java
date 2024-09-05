import java.util.ArrayList;

public class RegistroDeEstudiantes {
    private static ArrayList<Estudiante> estudiantes;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public RegistroDeEstudiantes() {
        RegistroDeEstudiantes.estudiantes = new ArrayList();
    }

    public void agregarEstudiante(String documento, String nombre, int edad) {
        if (!validarDocumento(documento)) {
            System.out.println("Error: El documento debe contener exactamente 8 dígitos y solo números.");
            return;
        }
        if (dniExiste(documento)) {
            System.out.println("El DNI ya está registrado. Ingrese un DNI diferente.");
            return;
        }

        if (!validarNombre(nombre)) {
            System.out.println("Error: El nombre solo debe contener letras.");
            return;
        }

        if (edad < 0) {
            System.out.println("Error: La edad no puede ser negativa.");
            return;
        }

        Estudiante nuevoEstudiante = new Estudiante(documento, nombre, edad);
        estudiantes.add(nuevoEstudiante);
        System.out.println("Estudiante agregado: " + nuevoEstudiante.getNombre());
    }

    private boolean validarDocumento(String documento) {
        return documento.matches("\\d{8}");
    }
    public boolean dniExiste(String documento) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getDNI().equals(documento)) {
                return true;
            }
        }
        return false;
    }

    private boolean validarNombre(String nombre) {
        return nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+");
    }

    public void eliminarEstudiante(String documento) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getDNI().equals(documento)) {
                System.out.println("Estudiante eliminado: " + estudiantes.get(i).getNombre());
                estudiantes.remove(i);
                return;
            }
        }
        System.out.println("No se encontró un estudiante con el documento " + documento);
    }

    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\n--- Lista de Estudiantes Registrados ---");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i+1) + ". " + estudiantes.get(i).getNombre() + "     Edad: " + estudiantes.get(i).getEdad() + "        DNI: " + estudiantes.get(i).getDNI());
            }
        }
    }

    public void buscarEstudiantePorDocumento(String documento) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getDNI().equals(documento)) {
                System.out.println("Estudiante encontrado: " + estudiante.getNombre() + "    Edad: " + estudiante.getEdad());
                return;
            }
        }
        System.out.println("No se encontró un estudiante con el documento " + documento);
    }
}


// Desarrolla un programa en Java que permita gestionar un 
// registro de estudiantes. Cada estudiante estará representado
//  por su nombre y su edad. El programa deberá permitir
//   al usuario agregar nuevos estudiantes al registro, 
//   eliminar estudiantes existentes y mostrar la lista 
//   completa de estudiantes registrados. Además, se deberá 
//   implementar una función para buscar un estudiante por 
//   su nombre.

// Pasos a seguir:

// Inicializa un ArrayList para almacenar objetos de tipo 
// Estudiante, donde Estudiante es una clase que contiene 
// los atributos: documento de identidad (del tipo String), 
// nombre (del tipo String) y la edad (del tipo Integer).

// Implementa un menú que permita al usuario seleccionar 
// entre las siguientes opciones: agregar estudiante, eliminar 
// estudiante, mostrar lista de estudiantes y buscar estudiante 
// por nombre.

// Cada vez que el usuario elija agregar un estudiante, 
// solicita por teclado el documento, el nombre y la edad 
// del estudiante y añádelo al ArrayList.

// Para eliminar un estudiante, solicita por teclado el 
// documento del estudiante a eliminar y elimina el objeto 
// correspondiente del ArrayList.

// Implementa una función para mostrar la lista completa de 
// estudiantes registrados, mostrando todos los datos de cada
//  estudiante.

// Finalmente, implementa una función para buscar un estudiante
//  por su documento. Si se encuentra, muestra su nombre y edad; 
//  de lo contrario, muestra un mensaje indicando que el estudiante 
//  no está registrado.