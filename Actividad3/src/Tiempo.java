import java.util.Scanner;

public class Tiempo
{
    int horas;
    int minutos;
    int segundos;

    void cambioHora(int horas, int minutos, int segundos)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca las horas");
        horas = entrada.nextInt();
        if(horas > 0)
        {
            System.out.println("Introduce los minutos");
            minutos = entrada.nextInt();
            if((minutos > 0)&&(minutos < 60))
            {
                System.out.println("Introduce los segundos");
                segundos = entrada.nextInt();
                if((segundos > 0)&&(segundos < 60))
                {
                    System.out.println("Hay partido, las horas son: " + horas + ", los minutos son: " + minutos + " y los segundos son: " + segundos);
                }else
                {
                    System.out.println("Error");
                }
            }else
            {
                System.out.println("Error");
            }
        }else
        {
            System.out.println("Error");
        }
    }
}