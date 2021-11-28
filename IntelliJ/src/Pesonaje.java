public class Pesonaje
{
    String nombre;
    int vida;
    int experiencia;
    int level;

    public Pesonaje(String nombre, int vida, int experiencia) {
        this.nombre = nombre;
        this.vida = vida;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {

        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        level = experiencia/1000;
        this.experiencia = level;
    }
}
