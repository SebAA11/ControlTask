  package modelo;

public class FormularioDatos {

    private String titulo;
    private String descripcion;
    private String tipoPapa;


    public FormularioDatos(String titulo, String descripcion, String tipoPapa) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipoPapa = tipoPapa;
      
    }

   // public String obtenerDatos() {
     //   String detalleVenta = "";
       // if (alDetal) {
        //    detalleVenta += "Al detal\n";
        //}
        //if (deBulto) {
        //    detalleVenta += "De bulto\n";
       // }
        //if (!alDetal && !deBulto) {
         //   detalleVenta += "No se seleccionó detalle de venta\n";
        //}

        //return "Producto: " + producto + "\n"
         //       + "Cantidad: " + cantidad + "\n"
         //       + "Tipo de papa: " + tipoPapa + "\n"
         //       + "Método de entrega: " + metodoEntrega + "\n"
         //       + "Detalle de Venta:\n" + detalleVenta;
    //}
}