package ejercicio9;

import java.util.Random;

public class Productor implements Runnable
{
    Cola colaCompartida;
    Random r = new Random();
    public Productor(Cola colaCompartida)
    {
        this.colaCompartida = colaCompartida;
    }

    @Override
    public void run()
    {
        while(true)
        {
            int numAProducir = r.nextInt(30) + 1;
            colaCompartida.put(numAProducir, Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}