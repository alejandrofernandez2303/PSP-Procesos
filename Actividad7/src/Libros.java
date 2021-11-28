import java.util.Scanner;

public class Libros
{
    int isbn;
    String titulo;
    String autor;
    int nPaginas;
    Scanner entrada = new Scanner(System.in);

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public static void main(String[] args)
    {
        Libros l1 = new Libros();
        Libros l2 = new Libros();
        l1.titulo = "Una pica en Flandes";
        l1.autor = "Fernando Martinez Lainez";
        l1.nPaginas = 376;
        l2.titulo = "Pisando fuerte";
        l2.autor = "Fernando Martinez Lainez";
        l2.nPaginas = 352;
        mostrarInfo();
        if(l1.nPaginas > l2.nPaginas)
        {
            System.out.println("El libro de " + l1.nPaginas + " paginas es el que más paginas tiene");
        }else if(l2.nPaginas > l1.nPaginas)
        {
            System.out.println("El libro de " + l2.nPaginas + " paginas es el que más paginas tiene");
        }else
        {
            System.out.println("Ambos tienen igual numero de paginas");
        }
    }
    static void mostrarInfo()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es el autor de la novela?");
        String autor2 = teclado.nextLine();
        System.out.println("¿Cuantas paginas tiene el libro?");
        int nPaginas2 = teclado.nextInt();
        int isbnA = (int) (Math.random()*1000+0);
        int isbn1 = (int) (Math.random()*10+0);
        int isbn2= (int) (Math.random()*100+0);
        int isbn3 = (int) (Math.random()*1000000+0);
        int isbn4 = (int) (Math.random()*10+0);
        System.out.println("El libro con ISBN " + isbnA + "-" + isbn1 + "-" + isbn2 + "-" + isbn3 + "-" + isbn4 + ", creado por el autor " + autor2 + ", tiene " + nPaginas2 + " paginas.");
    }
    static void dejarLibrosEnBiblioteca()
    {
        System.out.println("Todos los libros han sido depositados en una biblioteca");
    }
    void cualEsMayor()
    {
        System.out.println("Por favor ingrese el numero de paginas de dos libros diferentes.");
        int pag1 = entrada.nextInt();
        int pag2 = entrada.nextInt();

        if(pag1 > pag2)
        {
            System.out.println("El libro de " + pag1 + " paginas es el que más paginas tiene");
        }else if(pag2 > pag1)
        {
            System.out.println("El libro de " + pag2 + " paginas es el que más paginas tiene");
        }else
        {
            System.out.println("Ambos tienen igual numero de paginas");
        }
    }
}
