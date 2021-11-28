import java.io.File;
import java.io.IOException;

public class Ejercicio2
{
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio1", "Fernando", "Madrid", "Recio");
        pb.directory(new File(".\\out\\production\\EjerciciosTema1"));
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
