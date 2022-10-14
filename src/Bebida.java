public class Bebida extends Producto
{
    double litros=0;

    public Bebida() {
        this.litros = 0;
        super.nombre="";
        super.precio=0;
    }

    public Bebida(double litros, String nombre, float precio) {
    this.litros = litros;
    super.nombre=nombre;
    super.precio=precio;
}

    public double getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: "+ litros +" /// Precio: $" + precio;
    }
}
