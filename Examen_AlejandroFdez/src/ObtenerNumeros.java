import java.io.File;
import java.io.IOException;

public class ObtenerNumeros
{
    static int num1;
    static int num2;
    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);



        if(n1 > n2)
        {
            System.out.println(n1 + " mayor que " + n2);
        }
        else
        {
            System.out.println(n2 + " mayor que " + n1);
        }


        for (int i = 1; i < 500; i++)
        {
            ProcessBuilder pb = new ProcessBuilder("java", "LanzaSumas", String.valueOf(n1 + 5 * i), String.valueOf(n2));//, args[0], args[1] no hay que ponerlo
            pb.directory(new File(".\\out\\production\\Examen_AlejandroFdez"));
            try
            {
               Process p = pb.start();
               p.waitFor();
            }
            catch (IOException | InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
