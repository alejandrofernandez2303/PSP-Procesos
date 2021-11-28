package ejercicio7;

import java.util.Random;

public class Corredores implements Runnable
{
    int casillaActual = 1;

    @Override
    public void run() {
        Random r = new Random();
        while (casillaActual < 70)
        {
            int prob = r.nextInt(100) + 1;
            if(Thread.currentThread().getName().equals("Tortuga"))
            {
                if(prob < 20) //Resbalón
                {
                    casillaActual -= 6;
                    if(casillaActual < 0)
                        casillaActual = 1;
                }
                else if(prob <= 50) //Avance lento.
                {
                    casillaActual++;
                }
                else //Avance rápido.
                {
                    casillaActual += 3;
                }
                System.out.println("La " + Thread.currentThread().getName() + " va por la casilla " + casillaActual);
            }
            else //Liebre
            {
                if(prob < 10) //Resbalón grande
                {
                    casillaActual -= 12;
                    if(casillaActual < 0)
                        casillaActual = 1;
                }
                else if(prob <= 30) //Resbalón pequeño.
                {
                    casillaActual -= 2;
                    if(casillaActual < 0)
                        casillaActual = 1;
                }
                else if(prob <= 50) //Salto grande
                {
                    casillaActual += 9;
                }
                else if(prob <= 80) //Salto pequeño
                {
                    casillaActual ++;
                }
                else
                {
                    System.out.println("La liebre se quedó dormida.");
                }
                System.out.println("La " + Thread.currentThread().getName() + " va por la casilla " + casillaActual);
            }
            try {
                Thread.sleep(1000);
                System.out.println("La " + Thread.currentThread().getName() + " va por la casilla " + casillaActual);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("La " + Thread.currentThread().getName() + " llegó a la meta!");
    }
}
