import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static int mostrarConSalida(Scanner teclado){
        int eleccion;
        do {
            System.out.println("Introduce 1 para jugar");
            System.out.println("Introduce 0 para salir");
            eleccion = teclado.nextInt();
        }while(eleccion != 0 && eleccion != 1 && eleccion != 2);
        return eleccion;
    }
    public static int mostraSinSalida(Scanner teclado){
        int eleccion;
        do {
            System.out.println("Introduce 1 para jugar");
            System.out.println("Introduce 2 para ver estadísticas");
            eleccion = teclado.nextInt();
        }while(eleccion != 1 && eleccion != 2);
        return eleccion;
    }
    public static int mostrarMenuJuagada(int jugador){
        Random numeroAleatorio= new Random();
        if (jugador ==1) {
            System.out.println("Jugador" + 1);
        }else{
            System.out.println("Jugador" + 2);
        }

        System.out.println("Para jugar piedra introduce un 1");
        System.out.println("Para jugar papel introduce un 2");
        System.out.println("Para jugar tijeras introduce un 3");
        return (numeroAleatorio.nextInt(3)+1);
    }
}
