import java.util.HashSet;
import java.util.Iterator;

public class Libreria {
    HashSet<Libro> libreria;

    public Libreria () {
        libreria = new HashSet<>();
    }


    public boolean agregarLibro(Libro libro) {
        if (libreria.contains(libro)) {
            System.out.println("El libro ya está en el catálogo.");
            return false;
        }
        libreria.add(libro);
        System.out.println("Libro agregado al catálogo: " + libro.getTitulo());
        return true;
    }

    public boolean eliminarLibro(int ISBN) {
        Iterator<Libro> iterator = libreria.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getISBN() == ISBN) {
                iterator.remove();
                System.out.println("Libro eliminado: " + libro.getTitulo());
                return true;
            }
        }
        System.out.println("No se encontró un libro con el ISBN: " + ISBN);
        return false;
    }

    public void mostrarCatalogo() {
        if (libreria.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("\n--- Catálogo de Libros ---");
            for (Libro libro : libreria) {
                System.out.println(libro);
            }
        }
    }
}
