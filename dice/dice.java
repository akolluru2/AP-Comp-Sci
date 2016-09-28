public class dice{
  private int rollcount;
  private int sides;
  private int value;
  public dice(){
    this.sides=6;
    this.rollcount=0;
    this.value=-1;
  }
  
  public dice(int sides){
    this.sides=sides;
    this.rollcount=0;
    this.value=-1;
  }
  
  public int roll(){
    rollcount++;
    value=(int)((Math.random()*sides)+1)
    return value;
  }
  
  public int getroll(){
    return rollcount;
  }
  
  public int getvalue(){
    return value;
  }
}
