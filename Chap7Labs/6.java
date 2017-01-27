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
}
