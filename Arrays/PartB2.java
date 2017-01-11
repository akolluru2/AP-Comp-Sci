pubic class arrays{
  public static void main(String[]args){
    String [] fName = {"Andy", "Barbara", "Chandra", "Dyson", "Eric"};
		String [] mName = {"F.", "G.", "H.", "I."};
		String [] lName = {"Jackman", "Kincaid", "Lacy"};
    for(int i = 0; i < fName.length-1; i + 2){
      String test = fName[i];
      String test2 = fName[i+1];
      fName[i] = test2;
      fName[i+1] = test;
    }
  }
}  
	
