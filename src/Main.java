import java.util.Scanner;
/**
 * Clase principal que ejecuta el juego.
 * @author Liberto
 * @version 1.0
 */
public class Main {
    /**
     * Método principal que ejecuta el juego.
     */
    public static void main(String[] args) {
        int condicion;
        Scanner teclado=new Scanner(System.in);
        do {
            condicion = Menu.mostrarConSalida(teclado);
            if (condicion==1) {
                System.out.println("¿Cuántos turnos quieres jugar?");
                int turnosTotales=teclado.nextInt();
                Partida partida1=new Partida(turnosTotales);
                partida1.jugar();
            }
        }while(condicion!=0);
    }
}