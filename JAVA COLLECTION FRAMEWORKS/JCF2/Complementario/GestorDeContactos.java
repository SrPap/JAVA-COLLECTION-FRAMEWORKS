import java.util.ArrayList;
import java.util.HashSet;

class GestorDeContactos {
    private final ArrayList<Contacto> contactosArrayList;
    private final HashSet<Contacto> contactosHashSet;

    public GestorDeContactos() {
        contactosArrayList = new ArrayList<>();
        contactosHashSet = new HashSet<>();
    }

    // Método para agregar un contacto al ArrayList, evitando duplicados
    public void agregarContactoArrayList(Contacto contacto) {
        if (!contactosArrayList.contains(contacto)) {
            contactosArrayList.add(contacto);
            System.out.println("Contacto agregado al ArrayList.");
        } else {
            System.out.println("El contacto ya existe en el ArrayList.");
        }
    }

    // Método para eliminar un contacto del ArrayList
    public void eliminarContactoArrayList(Contacto contacto) {
        if (contactosArrayList.remove(contacto)) {
            System.out.println("Contacto eliminado del ArrayList.");
        } else {
            System.out.println("El contacto no se encontró en el ArrayList.");
        }
    }

    // Método para agregar un contacto al HashSet, evitando duplicados
    public void agregarContactoHashSet(Contacto contacto) {
        if (contactosHashSet.add(contacto)) {
            System.out.println("Contacto agregado al HashSet.");
        } else {
            System.out.println("El contacto ya existe en el HashSet.");
        }
    }

    // Método para eliminar un contacto del HashSet
    public void eliminarContactoHashSet(Contacto contacto) {
        if (contactosHashSet.remove(contacto)) {
            System.out.println("Contacto eliminado del HashSet.");
        } else {
            System.out.println("El contacto no se encontró en el HashSet.");
        }
    }

    // Método para mostrar los contactos en el ArrayList
    public void mostrarContactosArrayList() {
        System.out.println("Contactos en ArrayList:");
        for (Contacto contacto : contactosArrayList) {
            System.out.println(contacto);
        }
    }

    // Método para mostrar los contactos en el HashSet
    public void mostrarContactosHashSet() {
        System.out.println("Contactos en HashSet:");
        for (Contacto contacto : contactosHashSet) {
            System.out.println(contacto);
        }
    }
}