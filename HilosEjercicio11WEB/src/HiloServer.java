import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Collections;

public class HiloServer extends Thread
{
    Socket cliente;
    ObjectInputStream oIS;
    public static boolean borrar;

    public HiloServer(Socket cliente)
    {
        this.cliente = cliente;
        try
        {
            this.oIS = new ObjectInputStream(cliente.getInputStream());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void run()
    {
        super.run();
        System.out.println("Se ha unido: " + cliente.getInetAddress().toString());
        try
        {
            Persona persona = (Persona) oIS.readObject();
            Servidor.clientes.add(persona);
            borrar = Servidor.clientes.size() == 4 ? true:false;
            if(borrar)
            {
                for (Persona p: Servidor.clientes)
                {
                    Servidor.puntuaciones.add(persona.puntuacion);
                }
                Collections.sort(Servidor.puntuaciones);
                Collections.reverse(Servidor.puntuaciones);
                for (Persona p: Servidor.clientes)
                {
                    for (int pers: Servidor.puntuaciones)
                    {
                        if(pers == persona.puntuacion)
                        {
                            String msj = "{'nombre':"+persona.nombre+",'puntuacion':"+persona.puntuacion+"}";
                            Servidor.txt.add(msj);
                            break;
                        }
                    }
                }
                Servidor.puntuaciones.clear();
                Servidor.clientes.clear();
                File fichero = new File("datos.txt");
                FileWriter writer = new FileWriter(fichero);
                for (String msj: Servidor.txt)
                {
                    writer.write(msj);
                    writer.flush();
                }
                System.out.println("{'nombre':"+persona.nombre+",'puntuacion':"+persona.puntuacion+"}");
                writer.close();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
