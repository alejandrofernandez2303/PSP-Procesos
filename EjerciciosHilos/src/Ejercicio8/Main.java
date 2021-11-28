package Ejercicio8;

import java.io.File;
import java.io.IOException;

public class Main
{
    public static Thread[] hilos = new Thread[4];
    //los numeros con los que vamos a empezar el ejercicio son el 3 y el 7
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        for (int i = 0; i < hilos.length; i++)
        {
            //las siguientes parejas
            //num1 + 5 porque la siguiente pareja son los mismos numeros mas 5 cada uno
            //multiplicado por 125 por las 125 parejas de numeros que tenemos
            //multiplicado por i porque es el numero de parejas que tenemos
            num1 = num1 + 5 * 125 * i;
            num2 = num2 + 5 * 125 * i;
            hilos[i] = new Thread(new LanzaSumas(num1, num2));
            hilos[i].setName(String.valueOf(i));
            hilos[i].start();
        }
    }
}
