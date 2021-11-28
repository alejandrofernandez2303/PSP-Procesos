package ejercicio9;

public class Consumidor implements Runnable
{
    Cola colaCompartida;

    public Consumidor(Cola colaCompartida)
    {
        this.colaCompartida = colaCompartida;
    }

    @Override
    public void run()
    {
        int num;
        while(true)
        {
            num = colaCompartida.get();
            if(num != -1)
                System.out.println("El consumidor " + Thread.currentThread().getName() + " consume el número " + num);

        }
    }
}
