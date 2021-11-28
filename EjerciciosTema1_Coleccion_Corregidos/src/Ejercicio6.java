import java.io.*;

public class Ejercicio6
{
    static int multTotal = 1;
    static FileReader reader;
    static BufferedReader bf;
    static FileWriter writer;
    public static void main(String[] args) {
        try
        {
            for (int i = 1; i <= 3; i++)
            {
                File fich = new File("entrada" + i + ".txt");
                reader = new FileReader(fich);
                bf = new BufferedReader(reader);
                String linea = bf.readLine(); //No hago while porque sé que los ficheros sólo tienen una línea.
                //Voy leyendo números de cada uno de los ficheros y voy multiplicándolos entre sí en "Num".
                int num = Integer.parseInt(linea);
                multTotal *= num;
            }

            writer = new FileWriter(new File("salida.txt"));
            writer.write(String.valueOf(multTotal));
            writer.flush();

            //Cerramos todo:
            reader.close();
            writer.close();
            bf.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
