import java.util.LinkedList;

public class Cola
{
    LinkedList<Integer> list = new LinkedList<>();
    public Cola(LinkedList<Integer> list){this.list = list;}

    boolean siListaVacia()
    {
        return list.isEmpty();
    }

    boolean siListaLlena()
    {
        return list.size() == 2 ? true : false;
    }

    synchronized Integer get() throws InterruptedException
    {
        while (siListaVacia())
        {
            wait();
        }
        Integer numSacado = list.removeLast();
        System.out.println("El Conumidor  " + Thread.currentThread().getName() + " consume " + numSacado);
        notifyAll();
        return numSacado;
    }

    synchronized void set(Integer numero) throws InterruptedException
    {
        while(siListaLlena())
        {
            wait();
        }
        list.addFirst(numero);
        System.out.println("El Productor " + Thread.currentThread().getName() + " produce " + numero);
        notifyAll();
    }
}
