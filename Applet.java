import javax.swing.*;
import java.awt.*;
public class Applet{
    public static void main(String[] args)
{
    JFrame frame = new JFrame();
    frame.setLayout(new BorderLayout());
    
    JButton northButton = new JButton("North");
    JButton southButton = new JButton("South");
    
    frame.add(northButton, BorderLayout.NORTH);
    frame.add(southButton, BorderLayout.SOUTH);
    
    frame.setSize(300, 300);
    frame.setVisible(true);
    

}

}