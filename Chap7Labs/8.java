public class Table{
  private int[ ][ ] values;
  private int rows;
  private int columns;
  public Table(int rows, int columns) { 
    values = new int[rows][columns];
    this.rows = rows;
    this.columns= columns;
  }
  public void set(int i, int j, int n) {
    values[i][j] = n; 
  }
  pubic  avg8(){
  int sum = 0;
  for (int i = 0; i < rows; i++){
    for(int j = 0; j < columns; j++){
      if(i = 0 || i = rows-1){
      }else if(j = 0 || j = columns - 1){
      }else{
        sum = sum + values[i-1][j] +values[i-1][j-1]+values[i-1][j+1]+values[i][j-1]+values[i][j+1]+values[i+1][j]+values[i+1][j+1]+values[i+1][j-1];
      }
      int avg = sum/8;
      values[i][j] = avg;
      }
    }
  }
}
