import java.awt.Rectangle;

public class AreaTester{  
   public static void main(String[] args){  
      Rectangle r = new Rectangle(10, 20, 50, 70);
      double area = r.getWidth() * r.getHeight();
		
      System.out.println("The area of the rectangle is " + area);
   }
}
