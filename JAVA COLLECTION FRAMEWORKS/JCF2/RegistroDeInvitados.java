import java.util.HashSet;
import java.util.Scanner; 

public class RegistroDeInvitados {
    public static Scanner sc = new Scanner(System.in);

    static HashSet<String> nombresInvitados;

    public RegistroDeInvitados() {
        nombresInvitados = new HashSet<>();
    }
    public void agregarInvitado (String nombre) {
        nombresInvitados.add(nombre);
        if (nombresInvitados.contains(nombre)) {
            System.out.println("El invitado ya ha sido agregado.");

        } else {
            nombresInvitados.add(nombre);
            System.out.println("El invitado fue agregado.");
        }
    }
    public void eliminarInvitado (String nombre) {
        if (nombresInvitados.contains(nombre)) {
            nombresInvitados.remove(nombre);
            System.out.println("El invitado fue eliminado.");
        } else {
            System.out.println("El invitado no esta en la lista.");
        }
    }


    public void mostrarInvitados () {
            System.out.println("Lista de invitados:");
            int i = 0;
        if (nombresInvitados.isEmpty()) {
            System.out.println("--------------La lista de invitados esta vacia--------------");
            System.out.println();
        } else {
        for (Object invitado : nombresInvitados) {
            System.out.println((i+1) + ". " + invitado);
            i++;
        }
        System.out.println();
        }
    }
}

// Crea una clase llamada RegistroDeInvitados que contenga un 
// HashSet para almacenar los nombres de los invitados.

// Implementa un método llamado agregarInvitado que reciba como
//  parámetro el nombre de un invitado y lo agregue al HashSet.

// Implementa un método llamado eliminarInvitado que reciba como
//  parámetro el nombre de un invitado y lo elimine del HashSet,
//   en caso de que exista.

// Implementa un método llamado mostrarInvitados que imprima por
//  pantalla la lista de invitados.