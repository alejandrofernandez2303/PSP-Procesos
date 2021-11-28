import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class LanzaSumas
{
    //Los dos números que nos pasan desde ObtenerNumeros, 
    //vienen por los args de este main.
    public static void main(String[] args) 
    {
        //De nuevo se han de parsear.
        int menor = Integer.parseInt(args[0]);
        int mayor = Integer.parseInt(args[1]);
        int numPareja = Integer.parseInt(args[2]);
        int sumaTotal = 0;
        for (int i = menor; i <= mayor; i++)
        {
            sumaTotal += i;
        }
        File fich = new File("D:\\IntelliJ_Projects\\LanzaSumas\\resultados\\suma" + numPareja + ".txt");
        try {
            FileWriter writer = new FileWriter(fich);
            writer.write(String.valueOf(sumaTotal));
            writer.flush();
            writer.close(); //No nos olvidemos de cerrar.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
