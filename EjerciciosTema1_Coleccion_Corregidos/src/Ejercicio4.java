import java.io.*;

public class Ejercicio4
{
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "ping", "192.168.1.255");
        Process p = null;
        try {
            p = pb.start();
            InputStream is = p.getInputStream();
            InputStreamReader isR = new InputStreamReader(is); //Sobreescribo isR para utilizarlo con el is del proceso.
            BufferedReader bf = new BufferedReader(isR);
            String lectura = "";
            while ( ( lectura = bf.readLine()) != null)
            {
                System.out.println(lectura);
            }

            isR.close();
            bf.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
