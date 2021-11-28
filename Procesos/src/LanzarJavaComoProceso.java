import java.io.File;
import java.io.IOException;

public class LanzarJavaComoProceso
{
    public static void main(String[] args)
    {

        ProcessBuilder pb = new ProcessBuilder("java", "LanzarPrograma");
        pb.directory(new File("D:\\AlexF\\PSP\\Procesos\\out\\production\\LanzarProceso\\"));
        try {
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
