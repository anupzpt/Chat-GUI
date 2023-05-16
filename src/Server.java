import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
            GUI gui = new GUI();
            gui.content();
        try {
            ServerSocket serverSocket= new ServerSocket(12345);
            Socket socket=serverSocket.accept();

            BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));

            BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            OutputStream outputStream= socket.getOutputStream();
            PrintWriter printWriter =new PrintWriter(outputStream);
            String sendmgs, acceptmgs;
            while(true){
                sendmgs = userInput.readLine();
                printWriter.println(sendmgs);
                printWriter.flush();

                acceptmgs =socketInput.readLine();
                System.out.println("Client: " +acceptmgs);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
