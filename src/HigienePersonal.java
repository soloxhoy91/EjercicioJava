public class HigienePersonal extends Producto{
    int contenido=0;

    public HigienePersonal() {
        this.contenido = 0;
        super.nombre="";
        super.precio=0;
    }

    public HigienePersonal(int contenido, String nombre, float precio) {
        this.contenido = contenido;
        super.nombre=nombre;
        super.precio=precio;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre +" /// Contenido: "+ contenido +"ml /// Precio: $" + precio ;
    }
}
