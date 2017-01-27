publlic class 2D{
  public static void main(String[] args){
    int [] [] nums = new int [4] [5];
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 5; j++){
        nums [i] [j] = (int) ((Math.random()*48)+2);
      }
    }
  }
}
