import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class House extends JFrame{
    public House(){
        this.setTitle("House");
        this.setSize(500,500);
        //repaint();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(100,150,300,200);
        g.drawLine(100,150,250,100);
        g.drawLine(400,150,250,100);
        g.drawRect(150,200,50,50);
        g.drawRect(300,200,50,50);
        g.drawRect(225,350,50,-100);
    }
    public static void main(String[]args){
        House h = new House();
    }
}
    
