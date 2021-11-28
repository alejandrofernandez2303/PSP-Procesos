import java.util.Random;

public class Jugador implements Runnable
{
    Random r = new Random();
    Arbitro arbitroComun;
    int id;
    String nombre;
    int numeroJugador;

    public Jugador(int id, Arbitro arbitroComun, String nombre)
    {
        this.id = id;
        this.arbitroComun = arbitroComun;
        this.nombre = nombre;
    }

    @Override
    public void run()
    {
        while(arbitroComun.jugada == true)
        {

            try
            {
                numeroJugador = r.nextInt((11) - 1);
                arbitroComun.decirNumero(nombre, numeroJugador);
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        notify();
    }
}
