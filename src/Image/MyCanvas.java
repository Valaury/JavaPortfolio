
package Image;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyCanvas extends Canvas{
    
    public MyCanvas() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("Red.png"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,200);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.setIconImage(img);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) throws IOException {
        MyCanvas myCanvas= new MyCanvas();
    }
}
