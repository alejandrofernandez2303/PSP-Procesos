
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class PruebaVehiculo
{
    public static void main(String[] args) {
        Scanner escritura = new Scanner (System.in);
        /*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        System.out.println("Crea tu vehiculo (nombre y color)");
        Vehiculo v1 = new Vehiculo();
        v1.nombre = escritura.nextLine();
        v1.color = escritura.nextLine();
        System.out.println("Ahora escribe un valor para su velocidad de aceleración. Asegúrate de darle la suficiente potencia");
        v1.acelerar();
        if(v1.velMax < 30)
        {
            System.out.println("No tienes potencia, se acabó");
        }else
        {
            v1.ataqueCaza();
        }

    }
}
