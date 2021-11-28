package ejercicio8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LanzaSumas implements Runnable
{
    int n1, n2;
    int numPareja;
    public LanzaSumas(int n1, int n2, int numPareja) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void run()
    {
        int numHilo = Integer.parseInt(Thread.currentThread().getName());
        //125 parejas de nº por cada hilo.
        for (int i = 125 * numHilo; i < 125 + (125 * numHilo); i++)
        {
            try
            {
                File file = new File("suma" + (i + 1) + ".txt");
                FileWriter writer = new FileWriter(file);
                int nuevoN1 = n1 + 5 * i;
                int nuevoN2 = n2 + 5 * i;
                int suma = 0;
                //Sumamos los nº comprendidos entre la nueva pareja.
                for (int j = nuevoN1; j <= nuevoN2; j++)
                {
                    suma += j;
                }
                writer.write(String.valueOf(suma));
                writer.flush();
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
