public class Jugada {
    /*static int totalPiedra;
    static int totalTijera;
    static int totalPapel;
    static int turnosHastaPiedra;
    static int turnosHastaPapel;
    static int TurnosHastaTijera;
    de cara a posibles ampliaciones para poder llevar la estadística
     */
    /**
     * Gestiona cada una de las jugadas o turnos dentro del juego.
     * @author Liberto
     * @version 1.0
     */
    int jugadaHecha1;
    int jugadaHecha2;

    /**
     * Constructor de la clase
     * @see Menu
     * @param jugadaHecha1 Valor entero que determina que opción ha escagido el jugador1
     * @param jugadaHecha2 Valor entero que determina que opción ha escagido el jugador2
     */
    public Jugada(int jugadaHecha1, int jugadaHecha2) {
        this.jugadaHecha1 = jugadaHecha1;
        this.jugadaHecha2 = jugadaHecha2;
    }

    /**
     *
     * @return Valor entero que determina quién ha ganado la jugada: 1-->jugador1; 2-->jugador2; 0-->empate
     */
    public int resolver(){
        if (this.jugadaHecha1==jugadaHecha2){
            return 0;
        } else if (jugadaHecha1>jugadaHecha2&&jugadaHecha1!=3) {
            return 1;
        }else if(jugadaHecha2>jugadaHecha1&&jugadaHecha2!=3){
            return 2;
        }else if (jugadaHecha1==3){
            return 2;
        }else{
            return 2;
        }
    }
}
