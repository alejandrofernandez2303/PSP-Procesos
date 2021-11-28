import java.util.Random;

public class Productor implements Runnable
{
    Cola colaComun;

    public Productor(Cola colaComun)
    {
        this.colaComun = colaComun;
    }

    @Override
    public void run()
    {
        Random r = new Random();
        int numeroAle = r.nextInt(30) + 1;
        try
        {
            colaComun.set(numeroAle);
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
