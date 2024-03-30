public class Partida {
    int puntuacionJugador1;
    int puntuacionJugador2;
    int contadorTurnos=0;
    final int turnosTotales;
    Jugada jugada;
    public Partida(int turnosTotales) {
        this.turnosTotales=turnosTotales;
        puntuacionJugador1=0;
        puntuacionJugador2=0;
    }

    public void jugar(){
        int resultado;
        do {
            int eleccion1;
            int eleccion2;
            do {
                eleccion1=Menu.mostrarMenuJuagada(1);
            } while (eleccion1 != 1 && eleccion1 != 2 && eleccion1 != 3);

            do {

                eleccion2= Menu.mostrarMenuJuagada(2);
            } while (eleccion2 != 1 && eleccion2 != 2 && eleccion2 != 3);
            jugada= new Jugada(eleccion1,eleccion2);
            resultado= jugada.resolver();
            if (resultado==1){
                this.puntuacionJugador1++;
            }else if(resultado==2){
                this.puntuacionJugador2++;
            }
            contadorTurnos++;
            this.mensajeEstadoPartida();
        }while(turnosTotales>contadorTurnos);
        this.mensajeVictoria();
        
    }
    public void mensajeEstadoPartida(){
        System.out.println("---------------------------------");
        System.out.println("Puntuación jugador1:" + this.puntuacionJugador1);
        System.out.println("Puntuación jugador2:" + this.puntuacionJugador2);
        System.out.println("Turnos restantes"+ (turnosTotales-contadorTurnos));
    }
    public void mensajeVictoria(){
        if (this.puntuacionJugador1>puntuacionJugador2){
            System.out.println("Gana el jugador1");
        }else if(this.puntuacionJugador1<puntuacionJugador2){
            System.out.println("Gana el jugador2");
        }else{
            System.out.println("¡¡¡¡Empate!!!!");
        }
    }
}