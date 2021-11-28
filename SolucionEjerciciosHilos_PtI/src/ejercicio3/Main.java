package ejercicio3;

public class Main
{
    public static void main(String[] args) {
        Thread caballo1 = new Thread(new Caballo());
        caballo1.setName("Rocinante");

        Thread caballo2 = new Thread(new Caballo());
        caballo2.setName("Perdigón");

        Thread caballo3 = new Thread(new Caballo());
        caballo3.setName("Sardinilla");

        Thread caballo4 = new Thread(new Caballo());
        caballo4.setName("Pegaso");

        caballo1.start();
        caballo2.start();
        caballo3.start();
        caballo4.start();
    }
}
