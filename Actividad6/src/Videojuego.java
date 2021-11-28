public class Videojuego
{
    String titulo;
    float horasEstimadas = 10.0f;
    int nivelDif;
    String genero;
    String compañia;
    Videojuego[] sagaBattlefield = new Videojuego[5];

    public Videojuego(String titulo, float horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, float horasEstimadas, int nivelDif, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.nivelDif = nivelDif;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(float horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public int getNivelDif() {
        return nivelDif;
    }

    public void setNivelDif(int nivelDif) {
        this.nivelDif = nivelDif;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

}
