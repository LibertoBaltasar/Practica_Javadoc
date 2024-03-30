public class Jugada {
    /*static int totalPiedra;
    static int totalTijera;
    static int totalPapel;
    static int turnosHastaPiedra;
    static int turnosHastaPapel;
    static int TurnosHastaTijera;
    de cara a posibles ampliaciones para poder llevar la estadística
     */
    int jugadaHecha1;
    int jugadaHecha2;

    public Jugada(int jugadaHecha1, int jugadaHecha2) {
        this.jugadaHecha1 = jugadaHecha1;
        this.jugadaHecha2 = jugadaHecha2;
    }
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
