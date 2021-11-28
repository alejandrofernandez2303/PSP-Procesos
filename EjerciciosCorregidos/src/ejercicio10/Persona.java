package ejercicio10;

public class Persona extends Thread
{
    CuentaComun cuentaComun;
    String nombre;
    public Persona(String nombre, CuentaComun cuentaComun)
    {
        this.nombre = nombre;
        this.cuentaComun = cuentaComun;
    }

    @Override
    public void run()
    {
        super.run();
        if(nombre.equals("Ana"))
        {
            for (int i = 0; i < 20; i++) {
                cuentaComun.ingresarDinero(nombre, 10);
            }
        }
        else if(nombre.equals("Juan")) //Juan
        {
            for (int i = 0; i < 16; i++) {
                cuentaComun.retirarDinero(nombre, 10);
            }
        }
        else
        {
            for (int i = 0; i < 14; i++) {
                cuentaComun.retirarDinero(nombre, 10);
            }
        }


    }
}