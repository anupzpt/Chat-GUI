import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame=new JFrame("Chat Application");
    JTextArea text=new JTextArea();
    JButton button1=new JButton("send");
    void content(){
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text.setBounds(10,5,150,40);
        frame.add(text);

        button1.setBounds(190,5,70,40);
        frame.add(button1);
    }
}
