package ejercicio10;

public class CuentaComun
{
    int cantidadInicial;
    int cantidadActual;

    public CuentaComun(int cantidadInicial)
    {
        this.cantidadInicial = cantidadInicial;
        cantidadActual = cantidadInicial;
    }

    synchronized void retirarDinero(String nombre, int cantidad)
    {
        if(cantidadActual > 0)
        {
            cantidadActual -= cantidad;
            System.out.println(nombre + " retira " + cantidad);
            System.out.println("La cuenta se quedó a: " + cantidadActual);
        }
        else
            System.out.println("No puedes retirar dinero");
    }
    synchronized void ingresarDinero(String nombre, int cantidad)
    {
        cantidadActual += cantidad;
        System.out.println(nombre + " ingresa " + cantidad);
        System.out.println("La cuenta se quedó a: " + cantidadActual);
    }
}
