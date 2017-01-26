package chat;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(5000);
            while (true) {
                Socket socket = serverSocket.accept();
                Thread thread = new PerClinetThread(socket);
                thread.start();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}