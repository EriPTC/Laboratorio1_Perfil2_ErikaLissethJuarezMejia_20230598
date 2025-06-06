package ErikaJuarez_20230598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, que desea hacer?");
        System.out.println("1-Ingresar");
        System.out.println("2-Actualizar");
        System.out.println("3-Eliminar");
        System.out.println("4-Salir");
        System.out.println("Ingrese una opcion ");
        int menu = sc.nextInt();

        do {
            switch (menu){
                case 1 :
                    System.out.println("H");
                break;
                case 2 :
                    System.out.println( "o");
                    break;
                case 3 :
                    System.out.println("l");
                    break;
                case 4 :
                    System.out.println("Hasta pronto");
                    break;
            }

        } while (menu !=4);



    }
}