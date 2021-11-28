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
        synchronized (arbitroComun)
        {
            while(arbitroComun.jugada == true)
            {
                numeroJugador = r.nextInt((11) - 1);
                arbitroComun.decirNumero(nombre, numeroJugador);
                arbitroComun.notify();

                /*try
                {
                    numeroJugador = r.nextInt((11) - 1);
                    arbitroComun.decirNumero(nombre, numeroJugador);
                    arbitroComun.notify();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }*/
            }
            //arbitroComun.wait();
            try
            {
                arbitroComun.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
