import java.util.LinkedList;

public class Main
{


    public static void main(String[] args)
    {
        final int NUM_PROD = 2;
        final int NUM_CONS = 20;

        LinkedList<Integer> listComun = new LinkedList<>();
        Cola colaComun = new Cola(listComun);

        Thread[] productores = new Thread[NUM_PROD];
        Thread[] consumidores = new Thread[NUM_CONS];

        for (int i = 0; i < NUM_PROD; i++)
        {
            productores[i] = new Thread(new Productor(colaComun));
            productores[i].setName("Productor " + i);
            productores[i].start();
        }
        for (int i = 0; i < NUM_CONS; i++)
        {
            consumidores[i] = new Thread(new Consumidor(colaComun));
            consumidores[i].setName("Consumidor " + i);
            consumidores[i].start();
        }
    }
}
