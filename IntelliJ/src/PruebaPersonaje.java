public class PruebaPersonaje
{
    public static void main(String[] args) {
        Pesonaje personaje1 = new Pesonaje( "Alonso", 100, 8500);
        Pesonaje personaje2 = new Pesonaje("Barrichello", 100, 6000);
        Pesonaje personaje3 = new Pesonaje("Fisichella", 100, 7500);

        personaje1.setExperiencia(8500);
        personaje1.setVida(100);
        personaje1.setNombre("Alonso");
        personaje2.setExperiencia(6000);
        personaje2.setVida(100);
        personaje2.setNombre("Barrichello");
        personaje3.setExperiencia(7500);
        personaje3.setVida(100);
        personaje3.setNombre("Fisichella");

        System.out.println(personaje1.level);
        System.out.println(personaje2.level);
        System.out.println(personaje3.level);

    }


}
