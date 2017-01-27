import java.util.ArrayList;
public class ArrayListRunner{
  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<String>();
    names.add(Alice);
    names.add(Bob);
    names.add(Connie);
    names.add(David);
    names.add(Edward);
    names.add(Fran);
    names.add(Gomez);
    names.add(Harry);
    for(int i = 0; i < names.size(); i++){
      Systen.out.println(names.get(i));
    }
    names.set(Alice, Alice B. Toklas);
    names.add(Doug, 4);
    for(String name : names){
      System.out.println(name);
    }
    ArrayList<String> names2 = names.clone();
    names.remove(0);
    for(int j = 0; j < names.size(); j++){
      Systen.out.println(names.get(j));
    }
    for(int k = 0; k < names2.size(); k++){
      Systen.out.println(names.get(k));
    }
  }
}
