package ErikaJuarez_20230598;

import java.util.TreeMap;


public class productos {

    TreeMap<String, Double> tm= new TreeMap<>();

    public void agregarProductos () {
        this.tm = tm;
        tm.put("cable C", 2.50);
        tm.put("Luces led", 12.50);
        tm.put("Teclado", 25.00);
    }

    public void mostrarProductos (){
        System.out.println(tm);
    }
}
