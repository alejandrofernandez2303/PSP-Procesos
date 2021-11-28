package ejercicio2;

public class Main
{
    public static void main(String[] args) {
        Contador hilo1 = new Contador(5, "hilo1", 47);
        Contador hilo2 = new Contador(3, "hilo2", 48);

        hilo1.start();
        hilo2.start();
    }
}
