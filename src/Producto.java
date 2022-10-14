public class Producto implements Comparable {
    String nombre="";
    float precio=0;

    public Producto() {
        this.nombre = "";
        this.precio=0;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Object p1) {
        if(p1 instanceof Producto)
        {
            if(this.precio<((Producto) p1).precio){
                return 2;
            }
            else{
                return 1;
            }
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "///" + ", Precio: $" + precio;
    }
}
