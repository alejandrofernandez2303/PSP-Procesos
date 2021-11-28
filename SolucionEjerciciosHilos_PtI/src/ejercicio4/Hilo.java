package ejercicio4;

public class Hilo implements Runnable {
    @Override
    public void run() {
        //Contador de 0 a 10 inclusive.
        for (int i = 0; i <= 10; i++) {
            System.out.println("El hilo " + Thread.currentThread().getName() + " va por " + i);
            try {
                Thread.sleep(500); //Esperas de medio s.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
