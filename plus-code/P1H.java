public class finder{
  public static void main(String[]args){
    String[] artists = new String[4];
    artists[0] = new String("Skrilex");
    artists[1] = new String("Drake");
    artists[2] = new String("Michael Jackson");
    artists[3] = new String("Knaye West");
    for(int i = 0; i < 4; i++){
      if(artists[i].equals ("Michael Jackson")){
        System.out.println("We found him");
      }else{
        System.out.println("We have yet to find him...");
      }
    }
  }
}
