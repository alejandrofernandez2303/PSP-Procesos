public class Arbitro
{
    int numeroArbi;
    int numeroActual = numeroArbi;
    boolean jugada = true;

    public Arbitro(int numeroPiensa)
    {
        this.numeroArbi = numeroPiensa;
    }

    synchronized  void decirNumero(String nombre, int numeroJugador)
    {
        if(numeroArbi == numeroJugador)
        {
            System.out.println("El jugador " + nombre + " ha dicho el numero " + numeroJugador);
            System.out.println("El jugador " + nombre + " ha ganado");
            jugada = false;
        }
        else
        {
            System.out.println("El jugador " + nombre + " ha dicho el numero " + numeroJugador);
            System.out.println("El jugador " + nombre + " ha fallado");
        }
    }
}
