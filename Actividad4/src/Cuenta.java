import java.util.Scanner;

public class Cuenta
{
        String titular;
        double cantidad = 1200;
        Scanner entrada = new Scanner(System.in);

        public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
}

        public String getTitular() {
                return titular;
        }

        public void setTitular(String titular) {
                this.titular = titular;
        }

        public double getCantidad() {
                return cantidad;
        }

        public void setCantidad(double cantidad) {
                this.cantidad = cantidad;
        }
        void ingresar(double cantidadA)
        {
                System.out.println("¿Quien es el titular de esta cuenta?");
                titular = entrada.nextLine();
                System.out.println("Buenas noches " + titular + ", ¿Cuanta cantidad desea ingresar?");
                cantidadA = entrada.nextDouble();
                if(cantidadA >= 0)
                {
                        cantidad += cantidadA;
                        System.out.println("La cantidad actual es de " + cantidad + "€, que tenga un buen dia");
                }else
                {
                        System.out.println("Ha habido un error, inténtelo de nuevo");
                        //ingresar(); preguntar a Fernando
                }

        }
        void retirar(double cantidadB)
        {
                System.out.println("¿Quien es el titular de esta cuenta?");
                titular = entrada.nextLine();
                System.out.println("Buenas noches " + titular + ", ¿Cuanta cantidad desea retirar?");
                cantidadB = entrada.nextDouble();
                if((cantidad - cantidadB) >= 0)
                {
                        cantidad-= cantidadB;
                        System.out.println("La cantidad actual es de " + cantidad + "€, que tenga un buen dia");
                }else
                {
                        cantidad = 0;
                        System.out.println("La cantidad actual es de " + cantidad + "€, que tenga un buen dia");
                }
        }


}
