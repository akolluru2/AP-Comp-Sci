import java.util.Arrays;
public class sort{
  public static void main (String[] args){
    int[] rands = new int[20];
    for(int i = 0; i < rands.length; i++){
      rands[i] = (int)((Math.random()*100));
    }
    Arrays.sort(rands);
  }
}
