import java.io.File;
import java.io.IOException;

public class Ejercicio8
{
    public static void main(String[] args) {
        for (int i = 0; i < 255; i++) {
            System.out.println("Lanzando ping a: 192.168.1." + i);
            ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "ping", "192.168.1." + i);
            pb.redirectOutput(new File(".\\resultados\\ping" + i + ".txt"));
            try {
                Process p = pb.start();
                //waitFor Sirve para ejecutar muchos procesos en serie (uno detrás de otro).
                //El código no continua hasta que se termine el proceso anterior.
                p.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
