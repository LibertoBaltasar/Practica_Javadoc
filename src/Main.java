import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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