package ejercicio10;

public class Main
{
    public static void main(String[] args)
    {
        CuentaComun cuenta = new CuentaComun(100);
        Persona ana = new Persona("Ana", cuenta);
        Persona juan = new Persona("Juan", cuenta);
        Persona carlos = new Persona("Carlos", cuenta);
        ana.setPriority(Thread.MAX_PRIORITY);
        carlos.setPriority(Thread.MIN_PRIORITY);
        juan.setPriority(Thread.MIN_PRIORITY);
        ana.start();
        juan.start();
        carlos.start();
    }
}
