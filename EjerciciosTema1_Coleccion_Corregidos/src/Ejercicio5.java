import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ejercicio5
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 3; i++) {
            File fich = new File("entrada" + (i + 1) + ".txt");
            try {
                FileWriter writer = new FileWriter(fich);
                Random r = new Random();
                int numAle = r.nextInt(1000);
                writer.write(String.valueOf(numAle));
                writer.flush(); //Recuerda confirmar las escrituras con flush.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
