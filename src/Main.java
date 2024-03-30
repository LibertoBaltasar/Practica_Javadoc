import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int condicion;
        Scanner teclado=new Scanner(System.in);
        do {
            condicion = Menu.mostrar(teclado);
            if (condicion==1) {
                Partida.jugar();
            } else if (condicion==2) {
                Menu.estadisticas();
            }

        }while(condicion!=0);
    }
}