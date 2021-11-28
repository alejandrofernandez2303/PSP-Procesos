package ejercicio3;

import java.util.Random;

public class Caballo implements Runnable
{
    int puntuacion;
    static int posicion; //static porque es posición común a todos.
    Random r = new Random();
    @Override
    public void run()
    {
        while (puntuacion < 100)
        {
            //Aleatorio de 1 a 15 (ambos inclusive)
            puntuacion += r.nextInt(15) + 1;
            System.out.println(Thread.currentThread().getName() + " va por " + puntuacion);
            try {
                Thread.sleep(500); //Espera de medio segundo.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Si corta el while, es que hemos llegado a final de meta.
        posicion++;
        System.out.println(Thread.currentThread().getName() + " ha llegado a meta y queda en la posición " + posicion);
    }
}
