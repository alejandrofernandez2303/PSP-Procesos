public class Arrays
{

    public static void main(String[] args)
    {
        int[] myNum = {10, 20, 30, 40};
        int suma = 0;
        for (int i = 0; i < myNum.length; i++)
        {
            System.out.println(myNum[i]);
            System.out.println("Ahora la suma");
            suma += myNum[i];
            System.out.println(suma);
        }
    }
}
