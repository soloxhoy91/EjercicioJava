public class Fruta extends Producto{

    String unidadVenta="";

    public Fruta() {
        this.unidadVenta = "";
        super.nombre="";
        super.precio=0;
    }

    public Fruta(String unidadVenta, String nombre, float precio) {
        this.unidadVenta = unidadVenta;
        super.nombre=nombre;
        super.precio=precio;
    }

    public String getUnidadVenta() {
        return unidadVenta;
    }

    public void setUnidadVenta(String unidadVenta) {
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre +" /// Precio: $"+ precio +" /// Unidad de venta: " + unidadVenta;
    }
}
