package CONEXION; // Usa el mismo paquete de TicketBD o ajústalo

public class Ticket {
    private int id;
    private String titulo;
    private String descripcion;
    private String categoria;
    private String estado;
    private String responsable;

    public Ticket(int id, String titulo, String descripcion, String categoria, String estado, String responsable) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.responsable = responsable;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public String getCategoria() { return categoria; }
    public String getEstado() { return estado; }
    public String getResponsable() { return responsable; }
}
