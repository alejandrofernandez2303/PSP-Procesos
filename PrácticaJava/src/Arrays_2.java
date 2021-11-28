public class Arrays_2
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int e = 6;
        int[] myNum = {a, b, c, d, e};
        int sumaLocos = 0;
        int media;

        for (int i = 0; i < myNum.length; i++)
        {
            System.out.println("Numero en la posicion " + i + ": " + myNum[i]);
            sumaLocos += myNum[i];
            System.out.println("Resultado suma: " + sumaLocos);
            media = sumaLocos / myNum.length;
            System.out.println("La media es: " + media);
        }
    }
}
