import java.io.File;
import java.io.IOException;

public class LanzarPrograma
{
    public static void main(String[] args)
    {
        //System.out.println(args[0] + ", " + args[1]);
        for (int i = 0; i < 5; i++) {
            //ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Android\\Android Studio\\bin\\studio64.exe");
            ProcessBuilder pb = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\WINWORD.exe", "/t", "prueba.docx");
            pb.directory(new File("C:\\Users\\CES\\Desktop\\"));
            try
            {
                pb.start();
            } catch (IOException e)
            {
                System.exit(-1);
                e.printStackTrace();
            }
        }
    }
}
