import java.util.Scanner;
public class circular{
  public class void main(String[]args){
    Scanner input = new Scanner(System.in);
    double velocity = input.nextDouble();
    if(60 < ((2*(velocity*velocity))/3)){
      System.pit.println("This veocity will cause the rope to break");
    }else{
      System.out.println("This velocity will not cause the rope to break");
    }
  }
}
