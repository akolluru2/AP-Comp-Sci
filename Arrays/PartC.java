public class Array{
  public static void main(String[]args){
	String [] fName = {"Andy", "Barbara", "Chandra", "Dyson", "Eric"};
	String [] mName = {"F.", "G.", "H.", "I."};
	String [] lName = {"Jackman", "Kincaid", "Lacy"};
	String [] names = new String [10];
	for(int i = 0; i<names.length; i++){
		names[i] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
		//System.out.println("!"+names[i]);
	}
    for(int j = 0; j< names.length; j++){
		for(int k = j+1; k<names.length; k++){
			String q = names[j];
			String w = names[k];
			if(w.equals(q)){
				//System.out.println(">"+names[k]);
				names[k] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
				//System.out.println(names[k]);
			}
		}
	}
    for(int m = 0; m < names.length; m++){
		String name = names[m];
		System.out.println(name);
	}
  }
}
