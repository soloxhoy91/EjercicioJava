import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static final int ES_MAYOR = 2;
    public static final int ES_MENOR = 1;

    public static void main(String[] args) {
        ArrayList<Producto> lista = cargarProductos();
        Producto productoMayor = new Producto();
        Producto productoMenor = new Producto();


        for (Producto aux : lista) {
            System.out.println(aux.toString());
        }
        System.out.println("=============================");


        for (int i = 0; i < lista.size(); i++) {
            if (i == 0) {
                productoMayor = lista.get(i);
                productoMenor = lista.get(i);
                continue;
            }
            Producto productoComparado=lista.get(i);

            int comparacion = productoMayor.compareTo(productoComparado);

            if (comparacion == ES_MAYOR) {
                productoMayor = productoComparado;

            }

            comparacion = productoMenor.compareTo(productoComparado);

            if (comparacion == ES_MENOR) {
                productoMenor = productoComparado;
            }

        }


        System.out.println("Producto más caro: " + productoMayor.getNombre());
        System.out.println("Producto más barato: " + productoMenor.getNombre());

    }

    public static ArrayList<Producto> cargarProductos() {

        ArrayList<Producto> l1 = new ArrayList<>();
        Bebida b1 = new Bebida(1.5, "Coca-Cola Zero", 20);
        Bebida b2 = new Bebida(1.5, "Coca-Cola", 18);
        HigienePersonal hp1 = new HigienePersonal(500, "Shampoo Sedal", 19);
        Fruta f1 = new Fruta("kilo", "Frutilla", 64);

        l1.add(b1);
        l1.add(b2);
        l1.add(hp1);
        l1.add(f1);

        return l1;
    }

    //public static Producto productoCaro(ArrayList<Producto> lista){

    //}
}