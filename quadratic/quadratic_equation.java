public class quadratic_equation(){
pricate int a;
private int b;
private int c;
  public quadratic_equation(){
  this.a=0;
  this.b=0;
  this.c=0;
  }
  public quadratic_equation(int a,int b,int c){
    this.a=a;
    this.b-b;
    this.c=c;
  }
  public void setB(int b){
    this.b=b;
  }
  public int getB(){
    return b;
  }
  public double getDiscriminant(){
    double disc=Math.sqrt((b*b)-(4*a*c));
    return disc;
  }
  public double root1(){
    double disc=Math.sqrt((b*b)-(4*a*c));
    double root1=((-1*b)+(disc))/(2*a);
    return root1;
  }
  public double root2(){
    double disc=Math.sqrt((b*b)-(4*a*c));
    double root1=((-1*b)-(disc))/(2*a);
    return root2;
  }
  public String toString(){
    double disc=Math.sqrt((b*b)-(4*a*c));
    double root1=((-1*b)+(disc))/(2*a);
    double root2=((-1*b)+(disc))/(2*a);
    if(root1<0){
      root1=-1.0;
    }else if(root2<0){
      root2=-1.0;
    }else{
      root1=root1;
      root2=root2;
    }
    String output= a"x^2 "+b"x "+c+"\n"+"the discriminant is:"+disc+"\n"+"root1: "+root1"\n"+"root2: "+root2;
    return output;
  }
}
