import java.util.Random;

public class Partida {
    int puntuacionJugador1;
    int puntuacionJugador2;
    static int contadorTurnos=0;
    final int turnosTotales;
    Jugada jugada;
    public Partida(int turnosTotales) {
        this.turnosTotales=turnosTotales;
        puntuacionJugador1=0;
        puntuacionJugador2=0;
    }

    public void jugar(){
        do {
            int eleccion1;
            int eleccion2;


            do {
                eleccion1=Menu.mostrarMenuJuagada(1);
            } while (eleccion1 != 1 || eleccion1 != 2 || eleccion1 != 3);

            do {

                eleccion2= Menu.mostrarMenuJuagada(2);
            } while (eleccion2 != 1 || eleccion2 != 2 || eleccion2 != 3);
            jugada= new Jugada(eleccion1,eleccion2);
            if (jugada.resolver()==1){
                this.puntuacionJugador1++;
            }else{
                this.puntuacionJugador2++;
            }
            contadorTurnos++;
        }while(turnosTotales<=contadorTurnos);
        
    }
}
