import java.util.ArrayList;
public class RandomStringChooser{
private ArrayList<String> words = new ArrayList<String>();
  publlic RandomStringChooser(ArrayList words){
    this.words = words;
  }
  public static String getNext()
    String word;
    if(words.size == 0){
      word = "NONE";
    }else{
      int random = (int)((Math.random()*words.size());
      word = words.get(random);
      words.remove(random);
    }
    return word;
}
