package ejercicio9;

import java.util.LinkedList;

public class Cola
{
    final int NUMEROS_MAXIMOS = 2;
    //Manejo una lista enlazada tipo LIFO.
    LinkedList<Integer> cola;

    public Cola(LinkedList<Integer> cola)
    {
        this.cola = cola;
    }

    boolean comprobarSiVacia()
    {
        return cola.size() == 0 ? true : false;
    }

    boolean comprobarSiLlena()
    {
        return cola.size() == NUMEROS_MAXIMOS ? true : false;
    }
    synchronized int get() //DESENCOLAR.
    {
        while(comprobarSiVacia())
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        int numSacado = cola.removeLast();
        notifyAll();
        return numSacado;
    }
    synchronized void put(int numero, String id) //ENCOLAR
    {
        //Si está llena, tengo que esperar.
        while (comprobarSiLlena())
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cola.addFirst(numero);
        System.out.println("El productor " + id + " produce el número " + numero);
        notifyAll();
    }

}
