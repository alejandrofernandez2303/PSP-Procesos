import java.io.File;
import java.io.IOException;

public class ObtenerNumeros
{
    public static void main(String[] args)
    {
        long tiempoInicial = System.currentTimeMillis();
        long tiempoFinal;
        int menor, mayor;
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        if(num1 > num2)
        {
            menor = num2;
            mayor = num1;
        }
        else if(num2 > num1)
        {
            menor = num1;
            mayor = num2;
        }
        else
        {
            System.out.println("Ambos números son iguales");
            menor = num1;
            mayor = num1;
        }
        //500 sumas.
        for (int i = 0; i < 500; i++)
        {

            //Lanzamos el proceso y le pasamos ambos números en orden (primero el menor, después el mayor.
            //sumando la "i" para que las parejas vayan avanzando.
            ProcessBuilder pb = new ProcessBuilder("java", "LanzaSumas",
                    String.valueOf(menor + 5 * i), String.valueOf(mayor + 5 * i), String.valueOf(i + 1));
            pb.directory(new File(".\\out\\production\\LanzaSumas"));
            try {
                Process p = pb.start();
                //Así hacemos que cada proceso espere al anterior
                //La ejecución es más lenta, pero nos aseguramos que todo vaya bien.
                p.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Capturamos el tiempo final.
        tiempoFinal = System.currentTimeMillis();

        //Esto lo hacemos para después comparar el mismo ejercicio pero utilizando hilos (tema 2).
        System.out.println("Tiempo total en segundos en serie: " + ((tiempoFinal - tiempoInicial) / 1000));

    }
}
