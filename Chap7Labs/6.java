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
  
}
