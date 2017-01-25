package chat;

import java.net.Socket;

class Client {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(
                "Usage: java Client <user-name>");
            return;
        }
        try {
            Socket socket = new Socket("localhost", 5000);
            Thread thread1 = new SenderThread(socket, args[0]);
            Thread thread2 = new ReceiverThread(socket);
            thread1.start();
            thread2.start();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}