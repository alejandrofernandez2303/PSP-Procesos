import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int numeroArbi = r.nextInt((11) - 1);
        Arbitro arbitroComun = new Arbitro(numeroArbi);

        Thread jugador1 = new Thread(new Jugador(1, arbitroComun, "Jugador 1"));
        Thread jugador2 = new Thread(new Jugador(2, arbitroComun, "Jugador 2"));

        jugador1.start();
        jugador2.start();
    }
}
