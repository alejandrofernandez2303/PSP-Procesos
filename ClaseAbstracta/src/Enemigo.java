public class Enemigo extends NPC
{
    //hay que implementar los metodos abstractos (estyo obligado)
    @Override
    void mover()
    {

    }

    @Override
    void hablar()
    {
        super.hablar();
    }

    public static void main(String[] args)
    {
        Enemigo ene = new Enemigo();
        ene.hablar();
    }
}
