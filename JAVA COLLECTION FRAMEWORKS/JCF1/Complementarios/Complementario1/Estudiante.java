
public class Estudiante {
    private String DNI;
    private String nombre;
    private int edad;

    public Estudiante() {
    }

    public Estudiante(String DNI,String nombre,int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

}
