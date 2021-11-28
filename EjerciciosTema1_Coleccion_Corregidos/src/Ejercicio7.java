import java.io.File;
import java.io.IOException;

public class Ejercicio7
{
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("CMD");
        pb.redirectInput(new File("entrada.bat"));
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
