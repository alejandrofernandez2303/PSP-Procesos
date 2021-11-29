import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor
{

    public static ArrayList<Persona> clientes=new ArrayList<>();
    public static ArrayList<Integer> puntuaciones=new ArrayList<>();
    public static ArrayList<String> txt=new ArrayList<>();

    public static void main(String[] args)
    {
        try
        {

            ServerSocket server = new ServerSocket(80);
            while(true)
            {
                System.out.println("Waiting...");
                Socket cliente = server.accept();
                HiloServer hilo = new HiloServer(cliente);
                hilo.start();
            }


            /*ObjectInputStream oIS = new ObjectInputStream(cliente.getInputStream());
            Object juan = (Persona) oIS.readObject();*/
            /*Object beatriz = (Persona) oIS.readObject();
            Object david = (Persona) oIS.readObject();
            Object ana = (Persona) oIS.readObject();*/

            /*File archivo = new File("datos.txt");
            FileWriter writer = new FileWriter(archivo);
            writer.write(((Persona) juan).nombre + ((Persona) juan).puntuacion);*/
            /*writer.write(Beatriz.getNombre() + ", " + Beatriz.getPuntuacion());
            writer.write(David.getNombre() + ", " + David.getPuntuacion());
            writer.write(Ana.getNombre() + ", " + Ana.getPuntuacion());*/

            //System.out.println((Persona) juan).nombre + ((Persona) juan).puntuacion);
            /*System.out.println(Beatriz.getNombre() + ", " + Beatriz.getPuntuacion());
            System.out.println(David.getNombre() + ", " + David.getPuntuacion());
            System.out.println(Ana.getNombre() + ", " + Ana.getPuntuacion());*/

            /*oIS.close();
            server.close();
            cliente.close();*/
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
