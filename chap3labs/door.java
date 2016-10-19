public class Door{
  private boolean isOpen = false;
  private String name = "";
  public Door(String name, boolean open){
    this.name = name;
    isOpen = open;
  }
  public void close(){
    isOpen = false; 
  }
  public void open(){
    isOpen = true; 
  }
  public void setName(String name){
    this.name = name; 
  }
  public String getName(){
    return name; 
  }
}
