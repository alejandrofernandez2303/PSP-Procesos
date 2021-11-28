package ejercicio2;

public class Contador extends Thread
{
    int contador;
    String nombreHilo;
    int limiteCont;

    public Contador(int contador, String nombreHilo, int limiteCont) {
        this.contador = contador;
        this.nombreHilo = nombreHilo;
        this.limiteCont = limiteCont;
    }

    @Override
    public void run() {
        super.run();
        //Se hace una cuenta desde lo que diga "contador"
        //hasta el límite "limiteCont"
        for (int i = contador; i < limiteCont; i++)
        {
            System.out.println("El hilo " + nombreHilo + " va por " + i);
        }
    }
}
