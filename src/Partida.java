public class Partida {
    static int puntuacionJugador1;
    static int puntuacionJugador2;
    static int turnosTotales;
    public static void jugar(){
        turnosTotales++;
        int eleccion1;
        int eleccion2;
        Jugada jugada1;
        Jugada jugada2;

        // TODO: 29/03/2024 Jugada--->clase abstracta que tiene como concretas"piedra papel o tijera 
        do {
            System.out.println("Jugador1");
            System.out.println("Para jugar piedra introduce un 1");
            System.out.println("Para jugar papel introduce un 2");
            System.out.println("Para jugar tijeras introduce un 3");
        }while(eleccion1 != 0 && eleccion1 != 1 && eleccion1 != 2);
        // TODO: 29/03/2024 añadir constructor y la opcion de pasar por teclado
        do {
            System.out.println("Jugador2");
            System.out.println("Para jugar piedra introduce un 1");
            System.out.println("Para jugar papel introduce un 2");
            System.out.println("Para jugar tijeras introduce un 3");
        }while(eleccion2 != 0 && eleccion2 != 1 && eleccion2 != 2);
        
        
    }
}
