import java.util.Random;

public class Consumidor implements Runnable
{
    Cola colaComun;

    public Consumidor(Cola colaComun)
    {
        this.colaComun = colaComun;
    }

    @Override
    public void run()
    {
        int numero;
        while(true)
        {
            try
            {
                numero = colaComun.get();
                if(numero != -1)
                {
                    System.out.println("El Consumidor " + Thread.currentThread().getName() + " consume " + numero);
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
