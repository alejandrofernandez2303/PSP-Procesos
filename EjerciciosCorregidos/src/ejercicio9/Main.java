package ejercicio9;

import java.util.LinkedList;

public class Main
{
    final static int NUM_CLIENTES = 20;
    final static int NUM_PRODUCTORES = 2;
    static LinkedList<Integer> lista = new LinkedList<>();
    static Thread[] hilosConsumidores = new Thread[NUM_CLIENTES];
    static Thread[] productores = new Thread[NUM_PRODUCTORES];
    public static void main(String[] args)
    {
        Cola colaCompartida = new Cola(lista);

        //------------Inicialización productores-------------//
        for (int i = 0; i < NUM_PRODUCTORES; i++)
        {
            productores[i] = new Thread(new Productor(colaCompartida));
            productores[i].setName(String.valueOf(i));
            productores[i].start();
        }

        //-------------Inicialización consumidores-----------//
        for (int i = 0; i < NUM_CLIENTES; i++)
        {
            hilosConsumidores[i] = new Thread(new Consumidor(colaCompartida));
            hilosConsumidores[i].setName(String.valueOf(i));
            hilosConsumidores[i].start();
        }

    }
}
