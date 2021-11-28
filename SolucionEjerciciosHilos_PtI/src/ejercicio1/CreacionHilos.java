package ejercicio1;

public class CreacionHilos
{
    public static void main(String[] args)
    {

        Thread hilo1 = new Thread(new HiloNumerosLetras());
        hilo1.setName("Tipo 1");

        Thread hilo2 = new Thread(new HiloNumerosLetras());
        hilo2.setName("Tipo 2");

        hilo1.start();
        hilo2.start();

    }

}
