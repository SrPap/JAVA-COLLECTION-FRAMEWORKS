
class Tarea {
    private static int contador = 0;
    private final int idTarea;
    private final String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        this.idTarea = ++contador;
        this.descripcion = descripcion;
        this.completada = false; 
    }

    public int getIdTarea() {
        return idTarea;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void marcarComoCompletada() {
        this.completada = true;
    }


    public boolean isCompletada() {
        return completada;
    }    
    @Override
    public String toString() {
        return idTarea + ": " + descripcion + " [" + (completada ? "Completada" : "Pendiente") + "]";
    }
}