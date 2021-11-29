import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Cliente
{
    public static void main(String[] args)
    {

        /*Persona Beatriz = new Persona("Beatriz", 1132);
        Persona David = new Persona("David", 643);
        Persona Ana = new Persona("Ana", 349);*/

        String host = "localhost";
        int puerto = 80;
        Persona juan = new Persona("Juan", 2200);

        InetSocketAddress address = new InetSocketAddress(host, puerto);
        Socket socket = new Socket();

        try
        {
            socket.connect(address);
            ObjectOutputStream oS = new ObjectOutputStream(socket.getOutputStream());
            oS.writeObject(juan);
            /*oS.writeObject(Beatriz);
            oS.writeObject(David);
            oS.writeObject(Ana);*/
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Conexion perfecta");
    }
}
