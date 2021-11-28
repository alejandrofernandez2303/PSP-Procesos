package ejercicio5;


public class Main
{
    public static void main(String[] args) {
        Hilo[] hilos = new Hilo[5]; //Constructor de array.
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Hilo(); //Constructor de cada hilo del array.
            hilos[i].setName("Hilo " + (i + 1));
            hilos[i].start(); //Los lanzo todos a la vez sacando provecho de la prog. concurrente.
        }

        for (int i = 0; i < 5; i++)
        {
            try {
                hilos[i].join(); //Me aseguro que todos terminan con "join".
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        calcularMedia();
    }

    static void calcularMedia()
    {
        int suma = 0;
        int media;
        System.out.println("Calculando media....");
        for (int i = 0; i < Hilo.arrayComun.length; i++)
        {
            suma += Hilo.arrayComun[i]; //Acumulo la suma.
        }
        System.out.println("La suma total es de: " + suma);
        media = suma / Hilo.arrayComun.length;
        System.out.println("La media es de: " + media);
    }

}
