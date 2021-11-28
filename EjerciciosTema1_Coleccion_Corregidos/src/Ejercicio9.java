import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9
{
    public static void main(String[] args)
    {
        //He de poner un valor a esta variable. para que se meta al menos una vez en el while, pongo -1.
        int numMin = -1;
        int numMax = -1;
        try
        {
            while (numMin < 0  || numMin > 255)
            {
                System.out.println("Por favor, introduce un número de host mínimo correcto al que hacer ping");
                InputStreamReader isR = new InputStreamReader(System.in);
                BufferedReader bf = new BufferedReader(isR);
                String linea = bf.readLine();
                numMin = Integer.parseInt(linea);
            }
            while (numMax < 0  || numMax > 255)
            {
                System.out.println("Por favor, introduce un número de host máximo correcto al que hacer ping");
                InputStreamReader isR = new InputStreamReader(System.in);
                BufferedReader bf = new BufferedReader(isR);
                String linea = bf.readLine();
                numMax = Integer.parseInt(linea);
            }
            System.out.println("Se va a lanzar un ping de la máquina 192.168.1." + numMin + " a la máquina 192.168.1." + numMax);
            for (int i = numMin; i < numMax; i++)
            {
                System.out.println("Lanzando ping a: 192.168.1." + i);
                ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "ping", "192.168.1." + i);
                pb.redirectOutput(new File(".\\resultados\\ping" + i + ".txt"));
                    Process p = pb.start();
                    //waitFor Sirve para ejecutar muchos procesos en serie (uno detrás de otro).
                    //El código no continua hasta que se termine el proceso anterior.
                    p.waitFor();
            }

        }

        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
