pubic class Array{
  public static void main(String[]args){
		String [] fName = {"Andy", "Barbara", "Chandra", "Dyson", "Eric"};
		String [] mName = {"F.", "G.", "H.", "I."};
		String [] lName = {"Jackman", "Kincaid", "Lacy"};
		String [] names = new String [10];
	  for(int l = 0; l<names.length; l++){
      names[l] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];
    }
    for(int i = 0; i< names.length; i++){
			for(int j = i; j<names.length; j++){
				if(names[i].equals(names[j])){
					names[j] = fName[(int)(Math.random()*5)]+" "+mName[(int)(Math.random()*4)]+" "+lName[(int)(Math.random()*3)];	
				}
			}
		}
  }
}
