pubic class Array{
  public static void main(String[]args){
		String [] fName = {"Andy", "Barbara", "Chandra", "Dyson", "Eric"};
		String [] mName = {"F.", "G.", "H.", "I."};
		String [] lName = {"Jackman", "Kincaid", "Lacy"};
		String [] names = new String [10];
	  for(int i = 0; i<names.length; i++){
      names[i] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
    }
    for(int j = 0; j< names.length; j++){
			for(int k = j; k<names.length; k++){
				if(names[j].equals(names[k])){
					names[k] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];	
				}
			}
		}
  }
}
