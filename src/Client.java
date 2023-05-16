import javax.swing.*;
import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",12345);
            BufferedReader userInputBuffer=new BufferedReader(new InputStreamReader(System.in));
            BufferedReader socketInputBuffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream outputStream= socket.getOutputStream();
            PrintWriter printWriter =new PrintWriter(outputStream);
            String sendmgs, acceptmgs;
            while(true){
                acceptmgs =socketInputBuffer.readLine();
                System.out.println("Server: " +acceptmgs);

                sendmgs = userInputBuffer.readLine();
                printWriter.println(sendmgs);
                printWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
