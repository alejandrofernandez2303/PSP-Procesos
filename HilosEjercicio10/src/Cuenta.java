public class Cuenta
{
    int cantidadInicial;
    int cantidadActual;

    public Cuenta(int cantidadInicial)
    {
        this.cantidadInicial = cantidadInicial;
        cantidadActual = cantidadInicial;
    }

    synchronized void retirarDinero(String nombre, int cantidadRetirada)
    {
        if(cantidadActual <= 0)
        {
            System.out.println("No quedan fondos, haber invertido");
        }
        else if(cantidadActual > 0)
        {
            cantidadActual -= cantidadRetirada;
            System.out.println(nombre + " ha retirado " + cantidadRetirada);
            System.out.println("La cuenta se ha quedado en " + cantidadActual + "€");
        }
    }

    void ingresacion(String nombre, int cantidadIngreso)
    {
        cantidadActual += cantidadIngreso;
        System.out.println(nombre + " ha ingresado " + cantidadIngreso);
        System.out.println("La cuenta se ha quedado en " + cantidadActual + "€");
    }
}
