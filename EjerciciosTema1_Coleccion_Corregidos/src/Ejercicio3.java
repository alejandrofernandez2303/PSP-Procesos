import java.io.*;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        InputStreamReader isR = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isR);
        System.out.println("Por favor, ingrese su nombre");
        try
        {
            String linea1 = bf.readLine();
            System.out.println("Por favor, ingrese su primer apellido");
            String linea2 = bf.readLine();
            System.out.println("Por favor, ingrese su segundo apellido");
            String linea3 = bf.readLine();


            ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio1", linea1, linea2, linea3);
            pb.directory(new File(".\\out\\production\\EjerciciosTema1"));
            Process p = pb.start();
            InputStream is = p.getInputStream();
            isR = new InputStreamReader(is); //Sobreescribo isR para utilizarlo con el is del proceso.
            bf = new BufferedReader(isR);
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
