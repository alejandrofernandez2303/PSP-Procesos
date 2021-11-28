package Ejercicio8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LanzaSumas implements Runnable
{
    int numero1;
    int numero2;
    int numeroPareja;

    public LanzaSumas(int numero1, int numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public void run()
    {
        int numeroHilo = Integer.parseInt(Thread.currentThread().getName());

        for (int i = 125 * numeroHilo; i < 125 + (125 * numeroHilo); i++)
        {

            try
            {
                File archivo = new File("Suma" + i + ".txt");
                FileWriter writer = new FileWriter(archivo);
                int nuevoNum1 = numero1 + 5 * i;
                int nuevoNum2 = numero2 + 5 * i;
                int suma = 0;

                //aqui estamos sumando los numeros comprendidos entre el primer y segundo numero
                for (int j = nuevoNum1; j < nuevoNum2; j++)
                {
                    suma += j;
                }
                writer.write(String.valueOf(suma));
                writer.flush();
                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
