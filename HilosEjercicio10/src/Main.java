public class Main
{
    public static void main(String[] args)
    {
        Cuenta cuentaComun = new Cuenta(100);
        Personas Ana = new Personas("Ana", cuentaComun);
        Personas Juan = new Personas("Juan", cuentaComun);
        Personas Carlos = new Personas("Carlos", cuentaComun);

        Ana.setPriority(Thread.MAX_PRIORITY);
        Juan.setPriority(Thread.MIN_PRIORITY);
        Carlos.setPriority(Thread.MIN_PRIORITY);

        Ana.start();
        Juan.start();
        Carlos.start();
    }
}
