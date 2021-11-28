public class CorrecionPrueba
{

    //static CorreccionPersonaje pj1 = new CorreccionPersonaje();  //Esto es un constructor y "pj1" es un objeto creado a partir de la clase CorreccionPersonaje

    public static void main(String[] args) //creo aquí el main para hacer las pruebas del personaje
    {
        //pj1.nombre = "Pepe"; esto no funciona porque tiene que ser static, ya que el main lo es. Esto es si el constructor se hace en la zona global
        CorreccionPersonaje pj1 = new CorreccionPersonaje();
        pj1.nombre = "Pepe";   //los parametros nombre, vida y exp los saco de la clase CorreccionPersonaje gracias al constructor
        pj1.vida = 50;
        pj1.exp = 5000;
        pj1.calcularLVL(); //lamo al metodo que te saca el nivel
        //int lvlCalculado = pj1.calcularLVL();
        //System.out.println(lvlCalculado);
        System.out.println(pj1.calcularLVL());
    }
}
