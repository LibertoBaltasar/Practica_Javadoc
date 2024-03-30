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
    public static int mostrarMenuJuagada(int jugador){
        Random numeroAleatorio= new Random();
        int eleccion;
        if (jugador ==1) {
            System.out.println("Jugador" + jugador);
        }else{
            System.out.println("Jugador" + jugador);
        }

        System.out.println("Para jugar piedra introduce un 1");
        System.out.println("Para jugar papel introduce un 2");
        System.out.println("Para jugar tijeras introduce un 3");
        eleccion= (numeroAleatorio.nextInt(3)+1);
        switch (eleccion){
            case 1:
                System.out.println("Has elegido piedra");
                break;
            case 2:
                System.out.println("Has elegido papel");
                break;
            case 3:
                System.out.println("Has elegido tijera");
                break;
        }
        return eleccion;
    }
}
