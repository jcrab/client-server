
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = null; // TODO: create a server socket
        Socket clientSocket = null; // TODO: wait for a connection...

        PrintWriter out = null; // TODO: create an output stream (Writer) for the socket

        out.println("connection made");

        // TODO: close resources when finished
    }
}
