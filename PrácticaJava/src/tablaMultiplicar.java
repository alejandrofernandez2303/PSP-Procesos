import java.util.Scanner;

public class tablaMultiplicar
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pon numero");
        int num = entrada.nextInt();
        int multiplicacion;

        for (int i = 1; i <= 10; i++)
        {
            multiplicacion = num * (i);
            System.out.println(num + " * " + i + " es: " + multiplicacion);
        }
    }
}
