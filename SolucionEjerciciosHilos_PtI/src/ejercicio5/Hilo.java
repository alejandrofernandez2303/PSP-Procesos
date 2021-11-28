package ejercicio5;

import java.util.Random;

public class Hilo extends Thread
{
    //Lo hago estático para que sea una variable común para los 4 hilos.
    static int[] arrayComun = new int[1000];

    @Override
    public void run() {
        super.run();
        switch (currentThread().getName())
        {
            case "Hilo 1":
                generarNumerosAleatorios(0, 249);
                break;
            case "Hilo 2":
                generarNumerosAleatorios(250, 499);
                break;
            case "Hilo 3":
                generarNumerosAleatorios(500, 749);
                break;
            case "Hilo 4":
                generarNumerosAleatorios(750, 999);
                break;
        }
    }

    void generarNumerosAleatorios(int min, int max)
    {
        Random r = new Random();
        //Cuidado, el máximo es inclusivo.
        for (int i = min; i <= max; i++) {
            int numAle = r.nextInt(1001) - 500;
            System.out.println("El hilo " + currentThread().getName() + " genera el " + numAle + " en la posición " + i);
            arrayComun[i] = numAle;
        }
    }
}
