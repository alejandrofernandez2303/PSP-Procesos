import java.util.Random;
import java.util.Scanner;

public class Persona
{
    String nombre;
    int edad;
    String dni;
    char sexo;
    float peso;
    float altura;
    float alturaN;
    float res;

    Scanner entrada = new Scanner(System.in);

    public Persona(String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona(String nombre, int edad, String dni, char sexo, float peso, float altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }void calcularIMC()
    {
        System.out.println("Vamos a calcular tu Indice de Masa Corporal!");
        System.out.println("Si este fuera de menos de 18.5 está en un peso inferior al normal, si es de 18.5-24.9, está usted en peso normal");
        System.out.println("Si este fuera de 25 a 29.9 estaría en un peso superior al normal, de ahí para arriba sería sobrepeso");
        System.out.println("Introduzca su peso: ");
        peso = entrada.nextFloat();
        System.out.println("Introduzca su altura: ");
        altura = entrada.nextFloat();
        alturaN = altura * altura;
        res = peso / alturaN;
        System.out.println("Su Indice de Masa Corporal es de: " + res);
        if(res < 18.5){
            System.out.println("Peso inferior al normal");
        }else if((res >= 18.5)&&(res <= 24.9)){
            System.out.println("Peso normal");
        }else if((res >= 25)&&(res <= 29.9)){
            System.out.println("Peso superior al normal");
        }else{
            System.out.println("Está usted en sobrepeso, apúntese al gimnasio.");
        }
    }
    void esMayorDeEdad()
    {
        boolean respuesta;
        edad = entrada.nextInt();
        if(edad >= 18)
        {
            respuesta = true;
        }else
        {
            respuesta = false;
        }
    }
    void comprobarSexo(char sexo)
    {
        if((sexo != 'H')&&(sexo != 'M'))
        {
            sexo = 'H';
        }
    }
    public static void generarDNI()
    {
        int min = 0;
        int max = 100000000;
        Random random = new Random();

        int rnd = (int) (Math.random()*max+min);
        char letra = (char) (random.nextInt(26) + 'a');
        System.out.println("DNI: " + rnd + letra);
    }
    public static void main(String[] args)
    {
        generarDNI();
    }


}
