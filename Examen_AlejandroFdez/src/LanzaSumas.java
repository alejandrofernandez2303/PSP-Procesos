import java.io.*;

public class LanzaSumas
{

    public static void main(String[] args)
    {
            int numero1 = Integer.parseInt(args[0]);
            int numero2 = Integer.parseInt(args[1]);
            int numFich;
            int suma = 0;
            for (int i = numero1; i <= numero2; i++)
            {
                suma += i;
            }

        numFich = Integer.parseInt(args[2]);
            File fich = new File("E:\\2ºGDAM\\PSP\\Examen_AlejandroFdez\\resultados\\suma" + numFich + ".txt");
        try
        {
            FileWriter writer = new FileWriter(fich);
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
