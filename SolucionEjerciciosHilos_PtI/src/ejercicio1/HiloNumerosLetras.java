package ejercicio1;

public class HiloNumerosLetras implements Runnable {


    @Override
    public void run()
    {
        if(Thread.currentThread().getName().equals("Tipo 1"))
        {
            for (int i = 1; i <= 30; i++)
            {
                System.out.println("El hilo "+ Thread.currentThread().getName() + " va por " + i);
            }
        }
        else
        {
            for (char i = 'a'; i <= 'z'; i++)
            {
                System.out.println("El hilo "+ Thread.currentThread().getName() + " va por " + i);
            }
        }
    }
}
