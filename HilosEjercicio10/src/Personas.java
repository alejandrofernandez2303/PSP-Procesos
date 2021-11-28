public class Personas extends Thread
{
    Cuenta cuentaComun;
    String nombre;

    public Personas(String nombre, Cuenta cuentaComun)
    {
        this.nombre = nombre;
        this.cuentaComun = cuentaComun;
    }

    @Override
    public void run()
    {
        super.run();

        //meticion de dineros
        if(nombre.equals("Ana"))
        {
            for (int i = 0; i < 20; i++)
            {
                cuentaComun.ingresacion(nombre, 10);
            }
        }
        else if(nombre.equals("Juan"))
        {
            //retirada de dinero de juan
            for (int i = 0; i < 16; i++)
            {
                cuentaComun.retirarDinero(nombre, 10);
            }
        }
        else if(nombre.equals("Carlos"))
        {
            //retirada de dinero de carlos
            for (int i = 0; i < 14; i++)
            {
                cuentaComun.retirarDinero(nombre, 10);
            }
        }




    }
}
