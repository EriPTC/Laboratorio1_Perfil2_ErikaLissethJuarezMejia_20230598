package ErikaJuarez_20230598;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, Double> tm= new TreeMap<>();
        productos objtreemap = new productos();
        Scanner sc = new Scanner(System.in);

        int menu = sc.nextInt();

        do {
            System.out.println("Bienvenido, que desea hacer?");
            System.out.println("1-Ingresar");
            System.out.println("2-Actualizar");
            System.out.println("3-Eliminar");
            System.out.println("4-Ver productos");
            System.out.println("5-Salir");
            System.out.println("Ingrese una opcion ");
            switch (menu){
                case 1 :
                    System.out.println("Ingresa el producto");
                    String clave = sc.next();
                    System.out.println("ingrese el precio");
                    double valor = sc.nextDouble();
                    tm.put(clave,valor);
                    System.out.println("producto ingresado: " +clave +", " +valor);
                    break;
                case 2 :
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("l");
                    break;
                case 4 :
                    System.out.println(tm);
                    break;
                case 5 :
                    System.out.println("Hasta pronto");
                    break;
            }

        } while (menu !=5);


    }
}