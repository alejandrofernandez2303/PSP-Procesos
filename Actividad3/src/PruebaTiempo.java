import java.util.Scanner;
public class PruebaTiempo
{
    public static void main(String[] args)
    {
        Tiempo t1  = new Tiempo();
        String respuesta;
        Scanner teclado = new Scanner(System.in);

        t1.horas = (int) (Math.random()*24+1);
        t1.minutos = (int) (Math.random()*59+1);
        t1.segundos = (int) (Math.random()*59+1);

        System.out.println("Las horas son: " + t1.horas);
        System.out.println("Los minutos son: " + t1.minutos);
        System.out.println("Los segundos son: " + t1.segundos);

        System.out.println("¿Te gustaria cambiar la hora? s para Sí y n para No");

        respuesta = teclado.nextLine();
        switch(respuesta)
        {
            case "s":
                t1.cambioHora(t1.horas, t1.minutos, t1.segundos);
                break;
            case "n":
                System.out.println("OK");
            default:
                System.out.println("Error");
        }
    }
}
