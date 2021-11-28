public class CorreccionPersonaje
{
    String nombre;
    float vida;
    float exp;

    int calcularLVL()  //metodo para calcular la vida a traves de la exp
    {
        int lvl;
        lvl = (int) exp / 1000;  //(int) hace que EXP que es float pase a ser un int
        return lvl;  //el return se pone cuando el metodo tiene como parametro de salida "int". Ponemos ese parametro de salida porque queremos que nos devuelva un entero
    }
}
