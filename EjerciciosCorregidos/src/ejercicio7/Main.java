package ejercicio7;

public class Main
{
    static Thread[] corredores = new Thread[2];
    public static void main(String[] args)
    {
        corredores[0] = new Thread(new Corredores());
        corredores[0].setName("Liebre");
        corredores[1] = new Thread(new Corredores());
        corredores[1].setName("Tortuga");
        corredores[0].start();
        corredores[1].start();
    }
}
