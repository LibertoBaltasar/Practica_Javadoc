import java.util.Scanner;

public class Menu {
    public static int mostrar(Scanner teclado){
        int eleccion;
        do {
            System.out.println("Introduce 1 para jugar");
            System.out.println("Introduce 2 para ver estadísticas");
            System.out.println("Introduce 0 para salir");
            eleccion = teclado.nextInt();
        }while(eleccion != 0 && eleccion != 1 && eleccion != 2);
        return eleccion;
    }
    public static void estadisticas(){

    }
}
