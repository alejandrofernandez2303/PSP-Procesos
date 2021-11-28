public class Persona
{
    String nombre;
    int puntuacion;

    public Persona(String nombre, int puntuacion)
    {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getPuntuacion()
    {
        return puntuacion;
    }
}
