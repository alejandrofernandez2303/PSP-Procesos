package ejercicio4;

public class Main
{
    public static void main(String[] args) {
        Thread[] hilos = new Thread[5]; //Constructor de array.
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(new Hilo()); //Constructor de cada hilo del array.
            hilos[i].setName("Hilo " + i);
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
        System.out.println("Todos los hilos han terminado!");
    }
}
