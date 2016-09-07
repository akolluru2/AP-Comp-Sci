public class plus    
    public static main(String[]args){
      int a = 3;
      int b = 6;
      int c = 11;
      System.out.println(Math.pow(b,2);
      System.out.println(4*a*c);
      double deter = Math.pow(b,2) - (4*a*c);
        if(deter < 0){
            "System.out.println("Imaginary roots cannot be calculated");
        }else{
            double sqrt = Math.sqrt(deter);
            double roots = sqrt / (2*a);
            System.out.println("The roots are +- " + roots);
        }
    }
  }
