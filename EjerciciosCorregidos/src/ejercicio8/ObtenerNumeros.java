package ejercicio8;

public class ObtenerNumeros
{
    //Empezamos con el 5 y el 10 como números.
    //Avanzamos de 5 en 5 por cada pareja.
    //Así, primera pareja: 5, 10, la segunda: 10, 15.
    public static Thread[] hilos = new Thread[4];
    public static void main(String[] args)
    {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        for (int i = 0; i < hilos.length; i++)
        {
            //La primera pareja de cada hilo será el número:
            //n1 (pareja inicial) + sumar 5 * 125 parejas más adelante por cada hilo.
            n1 = n1 + 5 * 125 * i;
            n2 = n2 + 5 * 125 * i;
            hilos[i] = new Thread(new LanzaSumas(n1, n2, i * 125));
            hilos[i].setName(String.valueOf(i));
            hilos[i].start();
        }
    }
}
