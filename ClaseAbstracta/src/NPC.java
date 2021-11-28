public abstract class NPC
{
    //las clases abstractas tendran dos tipos de metodos
    //1. sin implementar (abstractos)
    abstract void mover();

    //2. implementados (con cuerpo)
    void hablar()
    {
        System.out.println("Hola, viajero.");
    }
}
