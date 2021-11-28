import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Waiting...");
            ServerSocket server = new ServerSocket(80);

            Socket cliente = server.accept();

            ObjectInputStream oIS = new ObjectInputStream(cliente.getInputStream());
            Persona Juan = (Persona) oIS.readObject();
            Persona Beatriz = (Persona) oIS.readObject();
            Persona David = (Persona) oIS.readObject();
            Persona Ana = (Persona) oIS.readObject();

            File archivo = new File("datos.txt");
            FileWriter writer = new FileWriter(archivo);
            writer.write(Juan.getNombre() + ", " + Juan.getPuntuacion());
            writer.write(Beatriz.getNombre() + ", " + Beatriz.getPuntuacion());
            writer.write(David.getNombre() + ", " + David.getPuntuacion());
            writer.write(Ana.getNombre() + ", " + Ana.getPuntuacion());

            System.out.println(Juan.getNombre() + ", " + Juan.getPuntuacion());
            System.out.println(Beatriz.getNombre() + ", " + Beatriz.getPuntuacion());
            System.out.println(David.getNombre() + ", " + David.getPuntuacion());
            System.out.println(Ana.getNombre() + ", " + Ana.getPuntuacion());

            oIS.close();
            server.close();
            cliente.close();
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
