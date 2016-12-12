public class solar{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a planet number from the sun:  ");
    int planet = scan.nextInt();
    switch(planet){
    case 1: System.out.println("Mercury");
            break;
    case 2: System.out.println("Venus");
            break;
    case 3: System.out.println("Earth");
            break;
    case 4: System.out.println("Mars");
            break;
    case 5: System.out.println("Jupiter");
            break;
    case 6: System.out.println("Saturn");
            break;
    case 7: System.out.println("Uranus");
            break;
    case 8: System.out.println("Neptune");
            break;
    }
  }
}
