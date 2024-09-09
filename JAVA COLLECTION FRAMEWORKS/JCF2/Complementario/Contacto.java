import java.util.Objects;

class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto() {
    }
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    @Override
    public String toString() {
        return "Contacto: " +
                "   nombre='" + nombre + '\'' + ", telefono='" + telefono + '\'' + ", email='" + email + '\'';
    }
}