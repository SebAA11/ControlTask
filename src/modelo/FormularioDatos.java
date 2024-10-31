  package modelo;

public class FormularioDatos {

    private String titulo;
    private String descripcion;
    private String complejidad;
    private String estado;
    private String responsable;

    public FormularioDatos(String titulo, String descripcion, String complejidad, String estado, String responsable) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.complejidad = complejidad;
        this.estado = estado;
        this.responsable = responsable;
      
    }

    // Metodo para obtener los datos  de creación de tarea formateados en un string
    public String obtenerDatos() {
        String detalleTarea = "";

        // Agregar información de complejidad, estado y responsable
        detalleTarea += "Complejidad: " + complejidad + "\n";
        detalleTarea += "Estado: " + estado + "\n";
        detalleTarea += "Responsable: " + responsable + "\n";

        return "Título: " + titulo + "\n"
                + "Descripción: " + descripcion + "\n"
                + "Detalle de Tarea:\n" + detalleTarea;
    }
}