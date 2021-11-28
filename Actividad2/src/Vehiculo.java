import java.util.Scanner;
public class Vehiculo
{
    String nombre;
    String color;
    int velMax;
    int ataqPrinc;

    void ataqueCaza()
    {
        int min = 0;
        int max = 100;
        ataqPrinc = (int) (Math.random()*100+1);
        if(ataqPrinc >= 50)
        {
            System.out.println("El ataque es: " + ataqPrinc + ", por tanto es efectivo");
        }else
        {
            System.out.println("El ataque es: " + ataqPrinc + ", por tanto no es efectivo");
        }
    }
    void acelerar()
    {
        Scanner entrada = new Scanner (System.in);
        velMax = entrada.nextInt();
        if(velMax < 30)
        {
            System.out.println("El vehiculo no tiene la suficiente potencia");
        }else
        {
            System.out.println("Tienes la suficiente potencia para continuar");
        }
    }
}
