import java.io.IOException;

public class LanzarNotepadCMD
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++) { //for para abrirlo varias veces
            //ProcessBuilder pb = new ProcessBuilder("Notepad");
            ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
            try {
                pb.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
