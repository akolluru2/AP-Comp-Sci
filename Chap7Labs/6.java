public class ArrayMethods{
  private int[] values;
  public ArrayMethods(int[] initialValues){
    values = initialValues;
  }
  public void swapFirstAndLast(){
    int length = values.length;
    int last = values[length-1];
    int first = values[0];
    values[length-1] = first;
    values[0] = last;
  }
  public void shiftRight(){
    int [] reorg = new int[values.length];
    for(int i = 0; i < values.length; i++){
      if(i = values.length-1){
        reorg[0] = values[i];
      }else{
        reorg[i] = values[i+1];
      }
    }
    for(int j = 0; j < values.length; j==){
      values[i] = reorg[i];
    }
  }
  public void replaceEven(){
    for(int i = 0; i <values.length; i++){
      if(values[i]%2 = 0){
        values[i] = 0;
      }
    }
  }
  public void checkNeighbor(){
    for(int i = 0; i < values.length; i++){
      if(i = values.length-1){
      }else if(i = 0){
      }else{
        if(values[i-1] > values[i+1]){
          values[i] = values[i-1];
        }else if(values[i-1] < values[i+1]){
          values[i] = values[i+1];
        }else{
          values[i] = values[i+1];
        }
      }
    }
  }
  public void sortEven(){
    int reorg = new int[values.length]; 
    int even = 0;
    int odd = vaues.length-1;
    for(int i = 0; i <values.length; i++){
      if(values[i]%2==0){
        reorg[even] = values[i];
        even++;
      }else if(values[i]%2==1){
        reorg[odd] = vaues[i];
        odd--;
      }
    }
  }
}
