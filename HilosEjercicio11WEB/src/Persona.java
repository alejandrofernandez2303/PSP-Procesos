import java.io.Serializable;

public class Persona implements Serializable
{
    String nombre;
    int puntuacion;

    public Persona(String nombre, int puntuacion)
    {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    /*public String getNombre()
    {
        return nombre;
    }

    public int getPuntuacion()
    {
        return puntuacion;
    }*/
}
